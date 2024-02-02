package com.example.CRM.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type_presta")
    private String prestation;
    @Column(name = "designation")
    private String description;
    @Column(name = "id_client")
    private Integer idclient;

    @Column(name = "nb_days")
    private Integer nbjours;
    @Column(name = "unit_price")
    private float prixunitaire;
    @Column(name = "total_exclude_taxes")
    private float totalHt;
    @Column(name = "total_with_taxes")
    private float totalTtc;
    @Column(name = "state")
    private Integer etat;

    public Order() {
    }

    public Order(String prestation, String description, Integer idclient, Integer nbjours, float prixunitaire, float totalHt, float totalTtc, Integer etat) {
        this.prestation = prestation;
        this.description = description;
        this.idclient = idclient;
        this.nbjours = nbjours;
        this.prixunitaire = prixunitaire;
        this.totalHt = totalHt;
        this.totalTtc = totalTtc;
        this.etat = etat;
    }

    public String getPrestation() {
        return prestation;
    }

    public void setPrestation(String prestation) {
        this.prestation = prestation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public Integer getNbjours() {
        return nbjours;
    }

    public void setNbjours(Integer nbjours) {
        this.nbjours = nbjours;
    }

    public float getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(float prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public float getTotalHt() {
        return totalHt;
    }

    public void setTotalHt(float totalHt) {
        this.totalHt = totalHt;
    }

    public float getTotalTtc() {
        return totalTtc;
    }

    public void setTotalTtc(float totalTtc) {
        this.totalTtc = totalTtc;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", prestation='" + prestation + '\'' +
                ", description='" + description + '\'' +
                ", idclient=" + idclient +
                ", nbjours=" + nbjours +
                ", prixunitaire=" + prixunitaire +
                ", totalHt=" + totalHt +
                ", totalTtc=" + totalTtc +
                ", etat=" + etat +
                '}';
    }
}
