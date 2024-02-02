package com.example.CRM.Model;

import jakarta.persistence.*;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    @Column(name = "company_name")
    private String entreprise;
    @Column(name = "first_name")
    private String nom;
    @Column(name = "last_name")
    private String prenom;
    private String email;
    @Column(name = "phone")
    private Integer telephone;
    @Column(name = "address")
    private String adresse;
    @Column(name = "zip_code")
    private Integer codepostal;
    @Column(name = "city")
    private String ville;
    @Column(name = "country")
    private String pays;

    public Client() {
    }

    public Client(String entreprise, String nom, String prenom, String email, Integer telephone, String adresse, Integer codepostal, String ville, String pays) {
        this.entreprise = entreprise;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.codepostal = codepostal;
        this.ville = ville;
        this.pays = pays;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
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

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(Integer codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", entreprise='" + entreprise + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", adresse='" + adresse + '\'' +
                ", codepostal=" + codepostal +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}
