package com.example.CRM.Controller;

import jakarta.persistence.Column;

public class OrderDTO {

    private Integer id;

//    @ManyToMany
//    List<Client> clients = new ArrayList<>();
    private String typePrestation;
    private String description;
    private Integer clientId;
    private short nbJours;
    private Integer prixUnitaire;
    private Integer totalHT;
    private Integer totalTTC;
    private OrderState etat;

    public OrderDTO() {
    }

    public OrderDTO(String typePrestation, String description, Integer clientId, short nbJours, Integer prixUnitaire, OrderState etat) {
        this.typePrestation = typePrestation;
        this.description = description;
        this.clientId = clientId;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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
                ", clientId=" + clientId +
                ", nbJours=" + nbJours +
                ", prixUnitaire=" + prixUnitaire +
                ", totalHT=" + totalHT +
                ", totalTTC=" + totalTTC +
                ", etat=" + etat +
                '}';
    }
}
