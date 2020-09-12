package model;
// Generated 04/07/2017 11:51:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entityprov generated by hbm2java
 */
@Entity
@Table(name="entityprov"
    ,catalog="provdmtest"
)
public class Entityprov  implements java.io.Serializable {


     private String identity;
     private String name;
     private Set<Project> projects = new HashSet<Project>(0);

    public Entityprov() {
    }

	
    public Entityprov(String identity) {
        this.identity = identity;
    }
    public Entityprov(String identity, String name, Set<Project> projects) {
       this.identity = identity;
       this.name = name;
       this.projects = projects;
    }
    public Entityprov(String identity, String name) {
        this.identity = identity;
        this.name = name;
    }
    
   
     @Id 

    
    @Column(name="identity", unique=true, nullable=false, length=45)
    public String getIdentity() {
        return this.identity;
    }
    
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="entityprov")
    public Set<Project> getProjects() {
        return this.projects;
    }
    
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }




}

