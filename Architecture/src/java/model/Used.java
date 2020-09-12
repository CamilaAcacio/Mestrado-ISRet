package model;
// Generated 04/07/2017 11:51:55 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Used generated by hbm2java
 */
@Entity
@Table(name="used"
    ,catalog="provdmtest"
)
public class Used  implements java.io.Serializable {


     private Integer idused;
     private Buildexecution buildexecution;
     private Softwareartifact softwareartifact;
     private Testingclass testingclass;
     private Testingclassexecution testingclassexecution;
     private Testingmethod testingmethod;
     private Testingmethodexecution testingmethodexecution;
     private Testingsuite testingsuite;
     private Testingsuiteexecution testingsuiteexecution;

    public Used() {
    }

    public Used(Buildexecution buildexecution, Softwareartifact softwareartifact, Testingclass testingclass, Testingclassexecution testingclassexecution, Testingmethod testingmethod, Testingmethodexecution testingmethodexecution, Testingsuite testingsuite, Testingsuiteexecution testingsuiteexecution) {
       this.buildexecution = buildexecution;
       this.softwareartifact = softwareartifact;
       this.testingclass = testingclass;
       this.testingclassexecution = testingclassexecution;
       this.testingmethod = testingmethod;
       this.testingmethodexecution = testingmethodexecution;
       this.testingsuite = testingsuite;
       this.testingsuiteexecution = testingsuiteexecution;
    }
    
    public Used(Buildexecution buildexecution, Softwareartifact softwareartifact) {
       this.buildexecution = buildexecution;
       this.softwareartifact = softwareartifact;
    }
    
    public Used(Testingsuite testingsuite, Testingsuiteexecution testingsuiteexecution) {
       this.testingsuite = testingsuite;
       this.testingsuiteexecution = testingsuiteexecution;
    }
    
    public Used(Testingclassexecution testingclassexecution, Testingclass testingclass) {
       this.testingclass = testingclass;
       this.testingclassexecution = testingclassexecution;
    }
    
    public Used(Testingmethod testingmethod, Testingmethodexecution testingmethodexecution) {
       this.testingmethod = testingmethod;
       this.testingmethodexecution = testingmethodexecution;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idused", unique=true, nullable=false)
    public Integer getIdused() {
        return this.idused;
    }
    
    public void setIdused(Integer idused) {
        this.idused = idused;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="buildExecution_idbuildExecution")
    public Buildexecution getBuildexecution() {
        return this.buildexecution;
    }
    
    public void setBuildexecution(Buildexecution buildexecution) {
        this.buildexecution = buildexecution;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="softwareArtifact_idsoftwareArtifact")
    public Softwareartifact getSoftwareartifact() {
        return this.softwareartifact;
    }
    
    public void setSoftwareartifact(Softwareartifact softwareartifact) {
        this.softwareartifact = softwareartifact;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="testingClass_idtestingClass")
    public Testingclass getTestingclass() {
        return this.testingclass;
    }
    
    public void setTestingclass(Testingclass testingclass) {
        this.testingclass = testingclass;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="testingClassExecution_idtestingClassExecution")
    public Testingclassexecution getTestingclassexecution() {
        return this.testingclassexecution;
    }
    
    public void setTestingclassexecution(Testingclassexecution testingclassexecution) {
        this.testingclassexecution = testingclassexecution;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="testingMethod_idtestingMethod")
    public Testingmethod getTestingmethod() {
        return this.testingmethod;
    }
    
    public void setTestingmethod(Testingmethod testingmethod) {
        this.testingmethod = testingmethod;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="testingMethodExecution_idtestingMethodExection")
    public Testingmethodexecution getTestingmethodexecution() {
        return this.testingmethodexecution;
    }
    
    public void setTestingmethodexecution(Testingmethodexecution testingmethodexecution) {
        this.testingmethodexecution = testingmethodexecution;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="testingSuite_idtestingSuite")
    public Testingsuite getTestingsuite() {
        return this.testingsuite;
    }
    
    public void setTestingsuite(Testingsuite testingsuite) {
        this.testingsuite = testingsuite;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="testingSuiteExecution_idtestingSuiteExecution")
    public Testingsuiteexecution getTestingsuiteexecution() {
        return this.testingsuiteexecution;
    }
    
    public void setTestingsuiteexecution(Testingsuiteexecution testingsuiteexecution) {
        this.testingsuiteexecution = testingsuiteexecution;
    }




}


