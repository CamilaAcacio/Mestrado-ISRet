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
 * Actedonbehalfof generated by hbm2java
 */
@Entity
@Table(name="actedonbehalfof"
    ,catalog="provdmtest"
)
public class Actedonbehalfof  implements java.io.Serializable {


     private Integer idactedOnBehalfOf;
     private Agent agentByAgentIdagent;
     private Agent agentByAgentIdagent1;

    public Actedonbehalfof() {
    }

    public Actedonbehalfof(Agent agentByAgentIdagent, Agent agentByAgentIdagent1) {
       this.agentByAgentIdagent = agentByAgentIdagent;
       this.agentByAgentIdagent1 = agentByAgentIdagent1;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idactedOnBehalfOf", unique=true, nullable=false)
    public Integer getIdactedOnBehalfOf() {
        return this.idactedOnBehalfOf;
    }
    
    public void setIdactedOnBehalfOf(Integer idactedOnBehalfOf) {
        this.idactedOnBehalfOf = idactedOnBehalfOf;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="agent_idagent", nullable=false)
    public Agent getAgentByAgentIdagent() {
        return this.agentByAgentIdagent;
    }
    
    public void setAgentByAgentIdagent(Agent agentByAgentIdagent) {
        this.agentByAgentIdagent = agentByAgentIdagent;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="agent_idagent1", nullable=false)
    public Agent getAgentByAgentIdagent1() {
        return this.agentByAgentIdagent1;
    }
    
    public void setAgentByAgentIdagent1(Agent agentByAgentIdagent1) {
        this.agentByAgentIdagent1 = agentByAgentIdagent1;
    }




}


