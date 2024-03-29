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
 * Wasassociatedwith generated by hbm2java
 */
@Entity
@Table(name="wasassociatedwith"
    ,catalog="provdmtest"
)
public class Wasassociatedwith  implements java.io.Serializable {


     private Integer idwasAssociatedWith;
     private Buildexecution buildexecution;
     private Commitactivity commitactivity;
     private Person person;
     private Testingsuiteexecution testingsuiteexecution;

    public Wasassociatedwith() {
    }

    public Wasassociatedwith(Buildexecution buildexecution, Commitactivity commitactivity, Person person, Testingsuiteexecution testingsuiteexecution) {
       this.buildexecution = buildexecution;
       this.commitactivity = commitactivity;
       this.person = person;
       this.testingsuiteexecution = testingsuiteexecution;
    }
    
    public Wasassociatedwith(Buildexecution buildexecution, Person person) {
       this.buildexecution = buildexecution;
       this.person = person;
    }
    
    public Wasassociatedwith(Commitactivity commitactivity, Person person) {
       this.commitactivity = commitactivity;
       this.person = person;
    }
    
    public Wasassociatedwith( Testingsuiteexecution testingsuiteexecution, Person person) {
       this.person = person;
       this.testingsuiteexecution = testingsuiteexecution;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idwasAssociatedWith", unique=true, nullable=false)
    public Integer getIdwasAssociatedWith() {
        return this.idwasAssociatedWith;
    }
    
    public void setIdwasAssociatedWith(Integer idwasAssociatedWith) {
        this.idwasAssociatedWith = idwasAssociatedWith;
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
    @JoinColumn(name="commitActivity_idcommitActivity")
    public Commitactivity getCommitactivity() {
        return this.commitactivity;
    }
    
    public void setCommitactivity(Commitactivity commitactivity) {
        this.commitactivity = commitactivity;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_idperson")
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
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


