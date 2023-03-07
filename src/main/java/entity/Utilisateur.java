package entity;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Date;

@Entity
public class Utilisateur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userid")
    private Integer userid;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "notes")
    private BigInteger notes;
    @Basic
    @Column(name = "datenaiss")
    private Date datenaiss;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getNotes() {
        return notes;
    }

    public void setNotes(BigInteger notes) {
        this.notes = notes;
    }

    public Date getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Utilisateur that = (Utilisateur) o;

        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (datenaiss != null ? !datenaiss.equals(that.datenaiss) : that.datenaiss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (datenaiss != null ? datenaiss.hashCode() : 0);
        return result;
    }
}
