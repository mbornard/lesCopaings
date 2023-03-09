package isis.lesCopaings.lesCopaings.entity;

import jakarta.persistence.*;

@Entity
@IdClass(PassagersPK.class)
public class Passagers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userid")
    private Integer userid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "numtrajet")
    private Integer numtrajet;
    @Basic
    @Column(name = "idpointdepartpassager")
    private Integer idpointdepartpassager;
    @Basic
    @Column(name = "idpointarriveepassager")
    private Integer idpointarriveepassager;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getNumtrajet() {
        return numtrajet;
    }

    public void setNumtrajet(Integer numtrajet) {
        this.numtrajet = numtrajet;
    }

    public Integer getIdpointdepartpassager() {
        return idpointdepartpassager;
    }

    public void setIdpointdepartpassager(Integer idpointdepartpassager) {
        this.idpointdepartpassager = idpointdepartpassager;
    }

    public Integer getIdpointarriveepassager() {
        return idpointarriveepassager;
    }

    public void setIdpointarriveepassager(Integer idpointarriveepassager) {
        this.idpointarriveepassager = idpointarriveepassager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passagers passagers = (Passagers) o;

        if (userid != null ? !userid.equals(passagers.userid) : passagers.userid != null) return false;
        if (numtrajet != null ? !numtrajet.equals(passagers.numtrajet) : passagers.numtrajet != null) return false;
        if (idpointdepartpassager != null ? !idpointdepartpassager.equals(passagers.idpointdepartpassager) : passagers.idpointdepartpassager != null)
            return false;
        if (idpointarriveepassager != null ? !idpointarriveepassager.equals(passagers.idpointarriveepassager) : passagers.idpointarriveepassager != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (numtrajet != null ? numtrajet.hashCode() : 0);
        result = 31 * result + (idpointdepartpassager != null ? idpointdepartpassager.hashCode() : 0);
        result = 31 * result + (idpointarriveepassager != null ? idpointarriveepassager.hashCode() : 0);
        return result;
    }
}
