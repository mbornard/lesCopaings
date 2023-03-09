package isis.lesCopaings.lesCopaings.entity;

import jakarta.persistence.*;

@Entity
@IdClass(PointarretPK.class)
public class Pointarret {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "numtrajet")
    private Integer numtrajet;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpoint")
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

        Pointarret that = (Pointarret) o;

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
