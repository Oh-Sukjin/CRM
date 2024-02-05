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
//    @Column(name = "client_id")
    @ManyToOne
    private Client client;

    @Column(name = "nb_days")
    private short nbjours;
    @Column(name = "unit_price")
    private Integer prixunitaire;
    @Transient
    @Column(name = "total_exclude_taxe")
    private Integer totalHt;
    @Transient
    @Column(name = "total_with_taxe")
    private Integer totalTtc;
    @Column(name = "state")
    private short etat;

    public Order() {
    }

    public Order(String prestation, String description, short nbjours, Integer prixunitaire, short etat) {
        this.prestation = prestation;
        this.description = description;
//        this./ = idclient;
        this.nbjours = nbjours;
        this.prixunitaire = prixunitaire;
        this.etat = etat;
//        this.totalHt = totalHt;
//        this.totalTtc = totalTtc;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

//    public Integer getIdclient() {
//        return idclient;
//    }
//
//    public void setIdclient(Integer idclient) {
//        this.idclient = idclient;
//    }

    public short getNbjours() {
        return nbjours;
    }

    public void setNbjours(short nbjours) {
        this.nbjours = nbjours;
    }

    public Integer getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(Integer prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public Integer getTotalHt() {
        return totalHt;
    }

    public void setTotalHt(Integer totalHt) {
        this.totalHt = totalHt;
    }

    public Integer getTotalTtc() {
        return totalTtc;
    }

    public void setTotalTtc(Integer totalTtc) {
        this.totalTtc = totalTtc;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", prestation='" + prestation + '\'' +
                ", description='" + description + '\'' +
//                ", idclient=" + idclient +
                ", nbjours=" + nbjours +
                ", prixunitaire=" + prixunitaire +
                ", totalHt=" + totalHt +
                ", totalTtc=" + totalTtc +
                ", etat=" + etat +
                '}';
    }
}
