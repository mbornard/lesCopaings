package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class PointarretPK implements Serializable {
    @Column(name = "numtrajet")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numtrajet;
    @Column(name = "idpoint")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpoint;

    public Integer getNumtrajet() {
        return numtrajet;
    }

    public void setNumtrajet(Integer numtrajet) {
        this.numtrajet = numtrajet;
    }

    public Integer getIdpoint() {
        return idpoint;
    }

    public void setIdpoint(Integer idpoint) {
        this.idpoint = idpoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PointarretPK that = (PointarretPK) o;

        if (numtrajet != null ? !numtrajet.equals(that.numtrajet) : that.numtrajet != null) return false;
        if (idpoint != null ? !idpoint.equals(that.idpoint) : that.idpoint != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numtrajet != null ? numtrajet.hashCode() : 0;
        result = 31 * result + (idpoint != null ? idpoint.hashCode() : 0);
        return result;
    }
}
