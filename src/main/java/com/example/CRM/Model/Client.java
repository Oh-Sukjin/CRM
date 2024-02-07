package com.example.CRM.Model;

import com.example.CRM.Controller.ClientState;
import jakarta.persistence.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @ManyToMany
//    List<Client> clients = new ArrayList<>();

    @Column(name = "company_name")
    private String entreprise;
    @Column(name = "first_name")
    private String nom;
    @Column(name = "last_name")
    private String prenom;
    private String email;
    @Column(name = "phone")
    private String telephone;
    @Column(name = "address")
    private String adresse;
    @Column(name = "zip_code")
    private String codepostal;
    @Column(name = "city")
    private String ville;
    @Column(name = "country")
    private String pays;
    @Column(name = "state",columnDefinition = "int4")
    private ClientState etat;


    public Client() {
    }

    public Client(String entreprise, String nom, String prenom, String email, String telephone, String adresse, String codepostal, String ville, String pays, ClientState etat) {
        this.entreprise = entreprise;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.codepostal = codepostal;
        this.ville = ville;
        this.pays = pays;
        this.etat = etat;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
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

    public ClientState getEtat() {
        return etat;
    }

    public void setEtat(ClientState etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
//                ", clients=" + clients +
                ", entreprise='" + entreprise + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codepostal='" + codepostal + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", etat=" + etat +
                '}';
    }
}
