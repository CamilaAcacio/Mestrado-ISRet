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
 * Commitactivity generated by hbm2java
 */
@Entity
@Table(name="commitactivity"
    ,catalog="provdmtest"
)
public class Commitactivity  implements java.io.Serializable {


     private String idcommitActivity;
     private Activity activity;
     private String commit;
     private String author;
     private String commiter;
     private String hour;
     private String parent;
     private String tree;
     private String date;
     private Integer idBuild;
     private Set<Wasassociatedwith> wasassociatedwiths = new HashSet<Wasassociatedwith>(0);

    public Commitactivity() {
    }

	
    public Commitactivity(String idcommitActivity, Activity activity) {
        this.idcommitActivity = idcommitActivity;
        this.activity = activity;
    }
    public Commitactivity(String idcommitActivity, Activity activity, String commit, String author, String commiter, String hour, String parent, String tree, String date, Integer idBuild, Set<Wasassociatedwith> wasassociatedwiths) {
       this.idcommitActivity = idcommitActivity;
       this.activity = activity;
       this.commit = commit;
       this.author = author;
       this.commiter = commiter;
       this.hour = hour;
       this.parent = parent;
       this.tree = tree;
       this.date = date;
       this.idBuild = idBuild;
       this.wasassociatedwiths = wasassociatedwiths;
    }
   
     @Id 

    
    @Column(name="idcommitActivity", unique=true, nullable=false, length=45)
    public String getIdcommitActivity() {
        return this.idcommitActivity;
    }
    
    public void setIdcommitActivity(String idcommitActivity) {
        this.idcommitActivity = idcommitActivity;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="activity_idactivity", nullable=false)
    public Activity getActivity() {
        return this.activity;
    }
    
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    
    @Column(name="commit", length=45)
    public String getCommit() {
        return this.commit;
    }
    
    public void setCommit(String commit) {
        this.commit = commit;
    }

    
    @Column(name="author", length=45)
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    
    @Column(name="commiter", length=45)
    public String getCommiter() {
        return this.commiter;
    }
    
    public void setCommiter(String commiter) {
        this.commiter = commiter;
    }

    
    @Column(name="hour", length=45)
    public String getHour() {
        return this.hour;
    }
    
    public void setHour(String hour) {
        this.hour = hour;
    }

    
    @Column(name="parent", length=45)
    public String getParent() {
        return this.parent;
    }
    
    public void setParent(String parent) {
        this.parent = parent;
    }

    
    @Column(name="tree", length=45)
    public String getTree() {
        return this.tree;
    }
    
    public void setTree(String tree) {
        this.tree = tree;
    }

    
    @Column(name="date", length=45)
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    
    @Column(name="idBuild")
    public Integer getIdBuild() {
        return this.idBuild;
    }
    
    public void setIdBuild(Integer idBuild) {
        this.idBuild = idBuild;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="commitactivity")
    public Set<Wasassociatedwith> getWasassociatedwiths() {
        return this.wasassociatedwiths;
    }
    
    public void setWasassociatedwiths(Set<Wasassociatedwith> wasassociatedwiths) {
        this.wasassociatedwiths = wasassociatedwiths;
    }




}

