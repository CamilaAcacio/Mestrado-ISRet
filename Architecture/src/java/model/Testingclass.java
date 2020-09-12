package model;
// Generated 04/07/2017 11:51:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Testingclass generated by hbm2java
 */
@Entity
@Table(name="testingclass"
    ,catalog="provdmtest"
)
public class Testingclass  implements java.io.Serializable {


     private Integer idtestingClass;
     private Testingsuite testingsuite;
     private String name;
     private Set<Testingmethod> testingmethods = new HashSet<Testingmethod>(0);
     private Set<Testingclassexecution> testingclassexecutions = new HashSet<Testingclassexecution>(0);
     private Set<Used> useds = new HashSet<Used>(0);

    public Testingclass() {
    }

	
    public Testingclass(Testingsuite testingsuite) {
        this.testingsuite = testingsuite;
    }
    public Testingclass(Testingsuite testingsuite, String name, Set<Testingmethod> testingmethods, Set<Testingclassexecution> testingclassexecutions, Set<Used> useds) {
       this.testingsuite = testingsuite;
       this.name = name;
       this.testingmethods = testingmethods;
       this.testingclassexecutions = testingclassexecutions;
       this.useds = useds;
    }
    
    public Testingclass(Testingsuite testingsuite, String name) {
       this.testingsuite = testingsuite;
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idtestingClass", unique=true, nullable=false)
    public Integer getIdtestingClass() {
        return this.idtestingClass;
    }
    
    public void setIdtestingClass(Integer idtestingClass) {
        this.idtestingClass = idtestingClass;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="testingSuite_idtestingSuite", nullable=false)
    public Testingsuite getTestingsuite() {
        return this.testingsuite;
    }
    
    public void setTestingsuite(Testingsuite testingsuite) {
        this.testingsuite = testingsuite;
    }

    
    @Column(name="name", length=150)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingclass")
    public Set<Testingmethod> getTestingmethods() {
        return this.testingmethods;
    }
    
    public void setTestingmethods(Set<Testingmethod> testingmethods) {
        this.testingmethods = testingmethods;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingclass")
    public Set<Testingclassexecution> getTestingclassexecutions() {
        return this.testingclassexecutions;
    }
    
    public void setTestingclassexecutions(Set<Testingclassexecution> testingclassexecutions) {
        this.testingclassexecutions = testingclassexecutions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingclass")
    public Set<Used> getUseds() {
        return this.useds;
    }
    
    public void setUseds(Set<Used> useds) {
        this.useds = useds;
    }




}


