package com.example.CRM.Controller;

import jakarta.persistence.Column;

public class OrderDTO {

    private Integer id;

//    @ManyToMany
//    List<Client> clients = new ArrayList<>();
    private String typePresta;
    private String designation;
    private Integer clientId;
    private short nbDays;
    private Integer unitPrice;
    private Integer totalExcludeTaxe;
    private Integer totalWithTaxe;
    private short etat;

    public OrderDTO() {
    }

    public OrderDTO(String typePresta, String designation, Integer clientId, short nbDays, Integer unitPrice, short etat) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.clientId = clientId;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
//        this.totalExcludeTaxe = totalExcludeTaxe;
//        this.totalWithTaxe = totalWithTaxe;
        this.etat = etat;
    }

    public Integer getId() {
        return id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getTypePresta() {
        return typePresta;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public short getNbDays() {
        return nbDays;
    }

    public void setNbDays(short nbDays) {
        this.nbDays = nbDays;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTotalExcludeTaxe() {
        return totalExcludeTaxe;
    }

    public void setTotalExcludeTaxe(Integer totalExcludeTaxe) {
        this.totalExcludeTaxe = totalExcludeTaxe;
    }

    public Integer getTotalWithTaxe() {
        return totalWithTaxe;
    }

    public void setTotalWithTaxe(Integer totalWithTaxe) {
        this.totalWithTaxe = totalWithTaxe;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", typePresta='" + typePresta + '\'' +
                ", designation='" + designation + '\'' +
                ", clientId=" + clientId +
                ", nbDays=" + nbDays +
                ", unitPrice=" + unitPrice +
                ", totalExcludeTaxe=" + totalExcludeTaxe +
                ", totalWithTaxe=" + totalWithTaxe +
                ", etat=" + etat +
                '}';
    }
}
