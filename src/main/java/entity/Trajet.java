package entity;

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
    @Column(name = "pointdepart")
    private Object pointdepart;
    @Basic
    @Column(name = "pointarrivee")
    private Object pointarrivee;
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

    public Object getPointdepart() {
        return pointdepart;
    }

    public void setPointdepart(Object pointdepart) {
        this.pointdepart = pointdepart;
    }

    public Object getPointarrivee() {
        return pointarrivee;
    }

    public void setPointarrivee(Object pointarrivee) {
        this.pointarrivee = pointarrivee;
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
        if (pointdepart != null ? !pointdepart.equals(trajet.pointdepart) : trajet.pointdepart != null) return false;
        if (pointarrivee != null ? !pointarrivee.equals(trajet.pointarrivee) : trajet.pointarrivee != null)
            return false;
        if (datedepart != null ? !datedepart.equals(trajet.datedepart) : trajet.datedepart != null) return false;
        if (heuredepart != null ? !heuredepart.equals(trajet.heuredepart) : trajet.heuredepart != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numtrajet != null ? numtrajet.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (pointdepart != null ? pointdepart.hashCode() : 0);
        result = 31 * result + (pointarrivee != null ? pointarrivee.hashCode() : 0);
        result = 31 * result + (datedepart != null ? datedepart.hashCode() : 0);
        result = 31 * result + (heuredepart != null ? heuredepart.hashCode() : 0);
        return result;
    }
}
