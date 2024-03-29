/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontology;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InferenceLayer {

    private final OntologyController controller;

    public InferenceLayer() throws SQLException, ClassNotFoundException {
        controller = OntologyController.getInstance();
    }

    public List<String> jenaGetIndividualsByClass(String prefix, String className) {

        OntClass oc = controller.getOntModel().getOntClass(getUri(prefix) + className);
        List<String> listIndividuals = new ArrayList<>();
        if (oc != null) {
            for (Iterator i = oc.listInstances(); i.hasNext();) {
                listIndividuals.add(i.next().toString());
            }
        }
        return listIndividuals;
    }

    public List<String> sparqlGetIndividualsByClassInf(String prefix, String entidade) throws SQLException {
        String queryStr = "PREFIX : <" + getUri(prefix) + "> \n"
                + "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \n"
                + "SELECT DISTINCT ?" + entidade + "\n"
                + "WHERE { \n"
                + " ?" + entidade + " rdf:type :" + entidade + " . \n"
                + " }  \n";

        Query query = QueryFactory.create(queryStr);
        QueryExecution execution = QueryExecutionFactory.create(query, controller.getInfModel());
        ResultSet results = execution.execSelect();
        List<String> list = new ArrayList<>();
        while (results.hasNext()) {
            QuerySolution qs = results.next();
            Resource resource = qs.getResource("?" + entidade + "");
            if (resource.toString() != null && !resource.toString().equals("null")) {
                list.add(resource.toString());
            }
        }
        execution.close();

        return list;
    }

    public List<String> sparqlGetPropertiesByIndividualInf(String entidade) throws SQLException {
        String queryStr = "SELECT DISTINCT * \n"
                + "WHERE {<"
                + OntologyController.URI
                + entidade
                + "> ?predicate ?object} ";
        Query query = QueryFactory.create(queryStr);
        QueryExecution execution = QueryExecutionFactory.create(query, controller.getInfModel());
        ResultSet results = execution.execSelect();
        List<String> list = new ArrayList<>();
        try {
            while (results.hasNext()) {
                QuerySolution qs = results.next();
                Resource predicate = qs.getResource("?predicate");
                Resource resource = qs.getResource("?object");
                
                String p = predicate.toString();
                if(p.contains("#"))
                    p = p.split("#")[1];
                String r = resource.toString();
                if(r.contains("#"))
                    r = r.split("#")[1];
                
                if (resource.toString() != null && !resource.toString().equals("null") && predicate.toString() != null && !predicate.toString().equals("null")) {
                    list.add(p + " => " + r);
                }
            }
        } catch (AbstractMethodError ex) {
            ex.printStackTrace();
        }
        execution.close();

        return list;
    }

    public List<String> sparqlGetResult(String queryStr) throws SQLException {
        if (queryStr == null || queryStr == "") {
            queryStr = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                    + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n"
                    + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                    + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n"
                    + "SELECT ?subject ?object\n"
                    + "	WHERE { ?subject rdfs:subClassOf ?object }";
        }
        Query query = QueryFactory.create(queryStr);
        QueryExecution execution = QueryExecutionFactory.create(query, controller.getInfModel());
        ResultSet results = execution.execSelect();
        List<String> list = new ArrayList<>();
        try {
            while (results.hasNext()) {
                QuerySolution qs = results.next();
                list.add(qs.toString());
            }
        } catch (AbstractMethodError ex) {
            ex.printStackTrace();
        }
        execution.close();

        return list;
    }

    public List<String> jenaGetPropertiesByClass(String prefix, String classe) {

        OntClass oc = controller.getOntModel().getOntClass(getUri(prefix) + classe);
        List<String> listProperties = new ArrayList<>();
        if (oc != null) {
            for (Iterator i = oc.listDeclaredProperties(); i.hasNext();) {
                String property = i.next().toString();
                listProperties.add(property);
            }
        }
        return listProperties;
    }

    public List<String> jenaGetOPAssertionsByIndividualInf(String individualName, String opPrefix, String objectPropertyName) {
        OntProperty objectProperty;
        objectProperty = controller.getOntModel().getObjectProperty(getUri(opPrefix) + objectPropertyName);
        Resource resource = controller.getInfModel().getResource(OntologyController.URI + individualName);
        List<String> listProperties = new ArrayList<>();
        if (resource != null && objectProperty != null) {
            for (StmtIterator i = resource.listProperties(objectProperty); i.hasNext();) {
                String str = i.next().getClass().toString(); //getClass era getResource
                listProperties.add(str);
            }
        }
        return listProperties;
    }

    public List<String> jenaGetUsedWfmsInf(String individualName) {
        return jenaGetOPAssertionsByIndividualInf(individualName, "prov-se-o", "usedWfms");
    }

    public List<String> jenaGetExecuteInf(String individualName) {
        return jenaGetOPAssertionsByIndividualInf(individualName, "prov-se-o", "execute");
    }

    public List<String> jenaGetExecutedInInf(String individualName) {
        return jenaGetOPAssertionsByIndividualInf(individualName, "prov-se-o", "executedIn");
    }

    public List<String> jenaGetIsSimilarInf(String individualName) {
        return jenaGetOPAssertionsByIndividualInf(individualName, "prov-o-test", "isSimilar");
    }

    public List<String> jenaGetEvolutionTo(String individualName) {
        return jenaGetOPAssertionsByIndividualInf(individualName, "prov-o-test", "used");
    }

    public List<String> jenaGetEvolutionOf(String individualName) {
        return jenaGetOPAssertionsByIndividualInf(individualName, "prov", "wasDerivedFrom");
    }

    public List<String> jenaGetWasInfluencedByInf(String individualName) {
        return jenaGetOPAssertionsByIndividualInf(individualName, "prov", "wasInfluencedBy");
    }

    /**
     * Escolhe a URI correta de acordo com o prefixo informado
     *
     * @param prefix
     * @return
     */
    private String getUri(String prefix) {
        switch (prefix) {
            case "prov-se-o":
                return OntologyController.URI;
            default:
                return OntologyController.URI;
        }
    }
}