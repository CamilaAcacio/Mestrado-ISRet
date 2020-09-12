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
 * Sourcecode generated by hbm2java
 */
@Entity
@Table(name="sourcecode"
    ,catalog="provdmtest"
)
public class Sourcecode  implements java.io.Serializable {


     private Integer idsourceCode;
     private Softwareartifact softwareartifact;
     private String name;
     private String path;
     private Set<Covers> coverses = new HashSet<Covers>(0);
     private Set<Wasderivedfrom> wasderivedfroms = new HashSet<Wasderivedfrom>(0);

    public Sourcecode() {
    }

	
    public Sourcecode(Softwareartifact softwareartifact) {
        this.softwareartifact = softwareartifact;
    }
    public Sourcecode(Softwareartifact softwareartifact, String name, String path, Set<Covers> coverses, Set<Wasderivedfrom> wasderivedfroms) {
       this.softwareartifact = softwareartifact;
       this.name = name;
       this.path = path;
       this.coverses = coverses;
       this.wasderivedfroms = wasderivedfroms;
    }
    
    public Sourcecode(Softwareartifact softwareartifact, String name, String path) {
       this.softwareartifact = softwareartifact;
       this.name = name;
       this.path = path;
    }
   
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idsourceCode", unique=true, nullable=false)
    public Integer getIdsourceCode() {
        return this.idsourceCode;
    }
    
    public void setIdsourceCode(Integer idsourceCode) {
        this.idsourceCode = idsourceCode;
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

    
    @Column(name="path", length=300)
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="sourcecode")
    public Set<Covers> getCoverses() {
        return this.coverses;
    }
    
    public void setCoverses(Set<Covers> coverses) {
        this.coverses = coverses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="sourcecode")
    public Set<Wasderivedfrom> getWasderivedfroms() {
        return this.wasderivedfroms;
    }
    
    public void setWasderivedfroms(Set<Wasderivedfrom> wasderivedfroms) {
        this.wasderivedfroms = wasderivedfroms;
    }




}

