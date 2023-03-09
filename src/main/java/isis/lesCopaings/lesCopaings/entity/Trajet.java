package isis.lesCopaings.lesCopaings.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
public class Trajet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "numtrajet")
    private Integer numtrajet;
    @Basic
    @Column(name = "userid")
    private Integer userid;
    @Basic
    @Column(name = "idpointdepart")
    private Integer idpointdepart;
    @Basic
    @Column(name = "idpointarrivee")
    private Integer idpointarrivee;
    @Basic
    @Column(name = "datedepart")
    private Date datedepart;
    @Basic
    @Column(name = "heuredepart")
    private Time heuredepart;

    public Integer getNumtrajet() {
        return numtrajet;
    }

    public void setNumtrajet(Integer numtrajet) {
        this.numtrajet = numtrajet;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getIdpointdepart() {
        return idpointdepart;
    }

    public void setIdpointdepart(Integer idpointdepart) {
        this.idpointdepart = idpointdepart;
    }

    public Integer getIdpointarrivee() {
        return idpointarrivee;
    }

    public void setIdpointarrivee(Integer idpointarrivee) {
        this.idpointarrivee = idpointarrivee;
    }

    public Date getDatedepart() {
        return datedepart;
    }

    public void setDatedepart(Date datedepart) {
        this.datedepart = datedepart;
    }

    public Time getHeuredepart() {
        return heuredepart;
    }

    public void setHeuredepart(Time heuredepart) {
        this.heuredepart = heuredepart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trajet trajet = (Trajet) o;

        if (numtrajet != null ? !numtrajet.equals(trajet.numtrajet) : trajet.numtrajet != null) return false;
        if (userid != null ? !userid.equals(trajet.userid) : trajet.userid != null) return false;
        if (idpointdepart != null ? !idpointdepart.equals(trajet.idpointdepart) : trajet.idpointdepart != null)
            return false;
        if (idpointarrivee != null ? !idpointarrivee.equals(trajet.idpointarrivee) : trajet.idpointarrivee != null)
            return false;
        if (datedepart != null ? !datedepart.equals(trajet.datedepart) : trajet.datedepart != null) return false;
        if (heuredepart != null ? !heuredepart.equals(trajet.heuredepart) : trajet.heuredepart != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numtrajet != null ? numtrajet.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (idpointdepart != null ? idpointdepart.hashCode() : 0);
        result = 31 * result + (idpointarrivee != null ? idpointarrivee.hashCode() : 0);
        result = 31 * result + (datedepart != null ? datedepart.hashCode() : 0);
        result = 31 * result + (heuredepart != null ? heuredepart.hashCode() : 0);
        return result;
    }
}
