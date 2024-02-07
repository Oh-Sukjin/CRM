package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import jakarta.persistence.ManyToOne;

public class OrderDTO {

    @ManyToOne
    private Integer client;
    private Integer id;

//    @ManyToMany
//    List<Client> clients = new ArrayList<>();
    private String typePrestation;
    private String description;
//    private Client client;
    private short nbJours;
    private Integer prixUnitaire;
    private Integer totalHT;
    private Integer totalTTC;
    private OrderState etat;

    public OrderDTO() {
    }

//    public OrderDTO(String typePrestation, String description, Integer client, short nbJours, Integer prixUnitaire, OrderState etat) {
//        this.typePrestation = typePrestation;
//        this.description = description;
//        this.client = client;
//        this.nbJours = nbJours;
//        this.prixUnitaire = prixUnitaire;
//        this.etat = etat;
//    }


    public OrderDTO( String typePrestation, String description, Integer client, short nbJours, Integer prixUnitaire, OrderState etat) {
        this.client = client;
        this.typePrestation = typePrestation;
        this.description = description;
        this.nbJours = nbJours;
        this.prixUnitaire = prixUnitaire;
        this.etat = etat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypePrestation() {
        return typePrestation;
    }

    public void setTypePrestation(String typePrestation) {
        this.typePrestation = typePrestation;
    }

    public String getDescription() {
        return description;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getNbJours() {
        return nbJours;
    }

    public void setNbJours(short nbJours) {
        this.nbJours = nbJours;
    }

    public Integer getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Integer prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Integer getTotalHT() {
        return totalHT;
    }

    public void setTotalHT(Integer totalHT) {
        this.totalHT = totalHT;
    }

    public Integer getTotalTTC() {
        return totalTTC;
    }

    public void setTotalTTC(Integer totalTTC) {
        this.totalTTC = totalTTC;
    }

    public OrderState getEtat() {
        return etat;
    }

    public void setEtat(OrderState etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", typePrestation='" + typePrestation + '\'' +
                ", description='" + description + '\'' +
                ", client=" + client +
                ", nbJours=" + nbJours +
                ", prixUnitaire=" + prixUnitaire +
                ", totalHT=" + totalHT +
                ", totalTTC=" + totalTTC +
                ", etat=" + etat +
                '}';
    }
}
