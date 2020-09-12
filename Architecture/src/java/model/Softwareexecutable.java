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
 * Softwareexecutable generated by hbm2java
 */
@Entity
@Table(name="softwareexecutable"
    ,catalog="provdmtest"
)
public class Softwareexecutable  implements java.io.Serializable {


     private String idsoftwareExecutable;
     private Softwareartifact softwareartifact;
     private String name;
     private Set<Wasgeneratedby> wasgeneratedbies = new HashSet<Wasgeneratedby>(0);
     private Set<Wasderivedfrom> wasderivedfroms = new HashSet<Wasderivedfrom>(0);

    public Softwareexecutable() {
    }

	
    public Softwareexecutable(String idsoftwareExecutable, Softwareartifact softwareartifact) {
        this.idsoftwareExecutable = idsoftwareExecutable;
        this.softwareartifact = softwareartifact;
    }
    public Softwareexecutable(String idsoftwareExecutable, Softwareartifact softwareartifact, String name, Set<Wasgeneratedby> wasgeneratedbies, Set<Wasderivedfrom> wasderivedfroms) {
       this.idsoftwareExecutable = idsoftwareExecutable;
       this.softwareartifact = softwareartifact;
       this.name = name;
       this.wasgeneratedbies = wasgeneratedbies;
       this.wasderivedfroms = wasderivedfroms;
    }
    
    public Softwareexecutable(String idsoftwareExecutable, Softwareartifact softwareartifact, String name) {
       this.idsoftwareExecutable = idsoftwareExecutable;
       this.softwareartifact = softwareartifact;
       this.name = name;
    }
   
   
     @Id 

    
    @Column(name="idsoftwareExecutable", unique=true, nullable=false, length=45)
    public String getIdsoftwareExecutable() {
        return this.idsoftwareExecutable;
    }
    
    public void setIdsoftwareExecutable(String idsoftwareExecutable) {
        this.idsoftwareExecutable = idsoftwareExecutable;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="softwareArtifact_idsoftwareArtifact", nullable=false)
    public Softwareartifact getSoftwareartifact() {
        return this.softwareartifact;
    }
    
    public void setSoftwareartifact(Softwareartifact softwareartifact) {
        this.softwareartifact = softwareartifact;
    }

    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="softwareexecutable")
    public Set<Wasgeneratedby> getWasgeneratedbies() {
        return this.wasgeneratedbies;
    }
    
    public void setWasgeneratedbies(Set<Wasgeneratedby> wasgeneratedbies) {
        this.wasgeneratedbies = wasgeneratedbies;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="softwareexecutable")
    public Set<Wasderivedfrom> getWasderivedfroms() {
        return this.wasderivedfroms;
    }
    
    public void setWasderivedfroms(Set<Wasderivedfrom> wasderivedfroms) {
        this.wasderivedfroms = wasderivedfroms;
    }




}


