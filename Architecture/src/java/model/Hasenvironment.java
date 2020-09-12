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
 * Hasenvironment generated by hbm2java
 */
@Entity
@Table(name="hasenvironment"
    ,catalog="provdmtest"
)
public class Hasenvironment  implements java.io.Serializable {


     private Integer idhasEnvironment;
     private Buildexecution buildexecution;
     private Environment environment;
     private Testingsuiteexecution testingsuiteexecution;

    public Hasenvironment() {
    }

	
    public Hasenvironment(Environment environment) {
        this.environment = environment;
    }
    
    public Hasenvironment(Buildexecution buildexecution, Environment environment, Testingsuiteexecution testingsuiteexecution) {
       this.buildexecution = buildexecution;
       this.environment = environment;
       this.testingsuiteexecution = testingsuiteexecution;
    }
    
    public Hasenvironment(Buildexecution buildexecution, Environment environment) {
       this.buildexecution = buildexecution;
       this.environment = environment;
    }
    
    public Hasenvironment(Environment environment, Testingsuiteexecution testingsuiteexecution) {
      
       this.environment = environment;
       this.testingsuiteexecution = testingsuiteexecution;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idhasEnvironment", unique=true, nullable=false)
    public Integer getIdhasEnvironment() {
        return this.idhasEnvironment;
    }
    
    public void setIdhasEnvironment(Integer idhasEnvironment) {
        this.idhasEnvironment = idhasEnvironment;
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
    @JoinColumn(name="environment_idenvironment", nullable=false)
    public Environment getEnvironment() {
        return this.environment;
    }
    
    public void setEnvironment(Environment environment) {
        this.environment = environment;
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


