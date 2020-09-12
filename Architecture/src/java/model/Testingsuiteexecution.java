package model;
// Generated 04/07/2017 11:51:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Testingsuiteexecution generated by hbm2java
 */
@Entity
@Table(name="testingsuiteexecution"
    ,catalog="provdmtest"
)
public class Testingsuiteexecution  implements java.io.Serializable {


     private String idtestingSuiteExecution;
     private Activity activity;
     private Testingsuite testingsuite;
     private Float duration;
     private Integer succesfullTest;
     private Integer failedTest;
     private Integer skippedTest;
     private Integer totalCount;
     private Double healthScale;
     private Integer idBuild;
     private Set<Testingclassexecution> testingclassexecutions = new HashSet<Testingclassexecution>(0);
     private Set<Wasinformedby> wasinformedbies = new HashSet<Wasinformedby>(0);
     private Set<Hasenvironment> hasenvironments = new HashSet<Hasenvironment>(0);
     private Set<Wasgeneratedby> wasgeneratedbies = new HashSet<Wasgeneratedby>(0);
     private Set<Used> useds = new HashSet<Used>(0);
     private Set<Wasassociatedwith> wasassociatedwiths = new HashSet<Wasassociatedwith>(0);

    public Testingsuiteexecution() {
    }

	
    public Testingsuiteexecution(String idtestingSuiteExecution, Activity activity, Testingsuite testingsuite) {
        this.idtestingSuiteExecution = idtestingSuiteExecution;
        this.activity = activity;
        this.testingsuite = testingsuite;
    }
    public Testingsuiteexecution(String idtestingSuiteExecution, Activity activity, Testingsuite testingsuite, Float duration, Integer succesfullTest, Integer failedTest, Integer skippedTest, Integer totalCount, Double healthScale, Integer idBuild, Set<Testingclassexecution> testingclassexecutions, Set<Wasinformedby> wasinformedbies, Set<Hasenvironment> hasenvironments, Set<Wasgeneratedby> wasgeneratedbies, Set<Used> useds, Set<Wasassociatedwith> wasassociatedwiths) {
       this.idtestingSuiteExecution = idtestingSuiteExecution;
       this.activity = activity;
       this.testingsuite = testingsuite;
       this.duration = duration;
       this.succesfullTest = succesfullTest;
       this.failedTest = failedTest;
       this.skippedTest = skippedTest;
       this.totalCount = totalCount;
       this.healthScale = healthScale;
       this.idBuild = idBuild;
       this.testingclassexecutions = testingclassexecutions;
       this.wasinformedbies = wasinformedbies;
       this.hasenvironments = hasenvironments;
       this.wasgeneratedbies = wasgeneratedbies;
       this.useds = useds;
       this.wasassociatedwiths = wasassociatedwiths;
    }
    
    public Testingsuiteexecution(String idtestingSuiteExecution, Activity activity, Testingsuite testingsuite, Float duration, Integer succesfullTest, Integer failedTest, Integer skippedTest, Integer totalCount, Double healthScale, Integer idBuild) {
       this.idtestingSuiteExecution = idtestingSuiteExecution;
       this.activity = activity;
       this.testingsuite = testingsuite;
       this.duration = duration;
       this.succesfullTest = succesfullTest;
       this.failedTest = failedTest;
       this.skippedTest = skippedTest;
       this.totalCount = totalCount;
       this.healthScale = healthScale;
       this.idBuild = idBuild;
    }
   
    
     @Id 

    
    @Column(name="idtestingSuiteExecution", unique=true, nullable=false, length=45)
    public String getIdtestingSuiteExecution() {
        return this.idtestingSuiteExecution;
    }
    
    public void setIdtestingSuiteExecution(String idtestingSuiteExecution) {
        this.idtestingSuiteExecution = idtestingSuiteExecution;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="activity_idactivity", nullable=false)
    public Activity getActivity() {
        return this.activity;
    }
    
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="testingSuite_idtestingSuite", nullable=false)
    public Testingsuite getTestingsuite() {
        return this.testingsuite;
    }
    
    public void setTestingsuite(Testingsuite testingsuite) {
        this.testingsuite = testingsuite;
    }

    
    @Column(name="duration", precision=12, scale=0)
    public Float getDuration() {
        return this.duration;
    }
    
    public void setDuration(Float duration) {
        this.duration = duration;
    }

    
    @Column(name="succesfull_test")
    public Integer getSuccesfullTest() {
        return this.succesfullTest;
    }
    
    public void setSuccesfullTest(Integer succesfullTest) {
        this.succesfullTest = succesfullTest;
    }

    
    @Column(name="failed_test")
    public Integer getFailedTest() {
        return this.failedTest;
    }
    
    public void setFailedTest(Integer failedTest) {
        this.failedTest = failedTest;
    }

    
    @Column(name="skipped_test")
    public Integer getSkippedTest() {
        return this.skippedTest;
    }
    
    public void setSkippedTest(Integer skippedTest) {
        this.skippedTest = skippedTest;
    }

    
    @Column(name="totalCount")
    public Integer getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    
    @Column(name="healthScale", precision=22, scale=0)
    public Double getHealthScale() {
        return this.healthScale;
    }
    
    public void setHealthScale(Double healthScale) {
        this.healthScale = healthScale;
    }

    
    @Column(name="idBuild")
    public Integer getIdBuild() {
        return this.idBuild;
    }
    
    public void setIdBuild(Integer idBuild) {
        this.idBuild = idBuild;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingsuiteexecution")
    public Set<Testingclassexecution> getTestingclassexecutions() {
        return this.testingclassexecutions;
    }
    
    public void setTestingclassexecutions(Set<Testingclassexecution> testingclassexecutions) {
        this.testingclassexecutions = testingclassexecutions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingsuiteexecution")
    public Set<Wasinformedby> getWasinformedbies() {
        return this.wasinformedbies;
    }
    
    public void setWasinformedbies(Set<Wasinformedby> wasinformedbies) {
        this.wasinformedbies = wasinformedbies;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingsuiteexecution")
    public Set<Hasenvironment> getHasenvironments() {
        return this.hasenvironments;
    }
    
    public void setHasenvironments(Set<Hasenvironment> hasenvironments) {
        this.hasenvironments = hasenvironments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingsuiteexecution")
    public Set<Wasgeneratedby> getWasgeneratedbies() {
        return this.wasgeneratedbies;
    }
    
    public void setWasgeneratedbies(Set<Wasgeneratedby> wasgeneratedbies) {
        this.wasgeneratedbies = wasgeneratedbies;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingsuiteexecution")
    public Set<Used> getUseds() {
        return this.useds;
    }
    
    public void setUseds(Set<Used> useds) {
        this.useds = useds;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="testingsuiteexecution")
    public Set<Wasassociatedwith> getWasassociatedwiths() {
        return this.wasassociatedwiths;
    }
    
    public void setWasassociatedwiths(Set<Wasassociatedwith> wasassociatedwiths) {
        this.wasassociatedwiths = wasassociatedwiths;
    }




}


