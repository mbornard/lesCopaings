package isis.lesCopaings.lesCopaings.entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class Point {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpoint")
    private Integer idpoint;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "adresse")
    private String adresse;
    @Basic
    @Column(name = "longitude")
    private BigInteger longitude;
    @Basic
    @Column(name = "latitude")
    private BigInteger latitude;

    public Integer getIdpoint() {
        return idpoint;
    }

    public void setIdpoint(Integer idpoint) {
        this.idpoint = idpoint;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public BigInteger getLongitude() {
        return longitude;
    }

    public void setLongitude(BigInteger longitude) {
        this.longitude = longitude;
    }

    public BigInteger getLatitude() {
        return latitude;
    }

    public void setLatitude(BigInteger latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (idpoint != null ? !idpoint.equals(point.idpoint) : point.idpoint != null) return false;
        if (nom != null ? !nom.equals(point.nom) : point.nom != null) return false;
        if (adresse != null ? !adresse.equals(point.adresse) : point.adresse != null) return false;
        if (longitude != null ? !longitude.equals(point.longitude) : point.longitude != null) return false;
        if (latitude != null ? !latitude.equals(point.latitude) : point.latitude != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpoint != null ? idpoint.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        return result;
    }
}
