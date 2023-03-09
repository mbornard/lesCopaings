package isis.lesCopaings.lesCopaings.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class PassagersPK implements Serializable {
    @Column(name = "userid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    @Column(name = "numtrajet")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numtrajet;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassagersPK that = (PassagersPK) o;

        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (numtrajet != null ? !numtrajet.equals(that.numtrajet) : that.numtrajet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (numtrajet != null ? numtrajet.hashCode() : 0);
        return result;
    }
}
