package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
public class Demandedetrajet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "numtrajet")
    private Integer numtrajet;
    @Basic
    @Column(name = "userid")
    private Integer userid;
    @Basic
    @Column(name = "pointdepartpassager")
    private Object pointdepartpassager;
    @Basic
    @Column(name = "pointarriveepassager")
    private Object pointarriveepassager;
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

    public Object getPointdepartpassager() {
        return pointdepartpassager;
    }

    public void setPointdepartpassager(Object pointdepartpassager) {
        this.pointdepartpassager = pointdepartpassager;
    }

    public Object getPointarriveepassager() {
        return pointarriveepassager;
    }

    public void setPointarriveepassager(Object pointarriveepassager) {
        this.pointarriveepassager = pointarriveepassager;
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

        Demandedetrajet that = (Demandedetrajet) o;

        if (numtrajet != null ? !numtrajet.equals(that.numtrajet) : that.numtrajet != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (pointdepartpassager != null ? !pointdepartpassager.equals(that.pointdepartpassager) : that.pointdepartpassager != null)
            return false;
        if (pointarriveepassager != null ? !pointarriveepassager.equals(that.pointarriveepassager) : that.pointarriveepassager != null)
            return false;
        if (datedepart != null ? !datedepart.equals(that.datedepart) : that.datedepart != null) return false;
        if (heuredepart != null ? !heuredepart.equals(that.heuredepart) : that.heuredepart != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numtrajet != null ? numtrajet.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (pointdepartpassager != null ? pointdepartpassager.hashCode() : 0);
        result = 31 * result + (pointarriveepassager != null ? pointarriveepassager.hashCode() : 0);
        result = 31 * result + (datedepart != null ? datedepart.hashCode() : 0);
        result = 31 * result + (heuredepart != null ? heuredepart.hashCode() : 0);
        return result;
    }
}
