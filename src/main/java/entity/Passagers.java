package entity;

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
    @Column(name = "pointdepartpassager")
    private Object pointdepartpassager;
    @Basic
    @Column(name = "pointarriveepassager")
    private Object pointarriveepassager;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passagers passagers = (Passagers) o;

        if (userid != null ? !userid.equals(passagers.userid) : passagers.userid != null) return false;
        if (numtrajet != null ? !numtrajet.equals(passagers.numtrajet) : passagers.numtrajet != null) return false;
        if (pointdepartpassager != null ? !pointdepartpassager.equals(passagers.pointdepartpassager) : passagers.pointdepartpassager != null)
            return false;
        if (pointarriveepassager != null ? !pointarriveepassager.equals(passagers.pointarriveepassager) : passagers.pointarriveepassager != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (numtrajet != null ? numtrajet.hashCode() : 0);
        result = 31 * result + (pointdepartpassager != null ? pointdepartpassager.hashCode() : 0);
        result = 31 * result + (pointarriveepassager != null ? pointarriveepassager.hashCode() : 0);
        return result;
    }
}
