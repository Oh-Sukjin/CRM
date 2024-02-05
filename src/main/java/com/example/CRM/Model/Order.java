package com.example.CRM.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type_presta")
    private String typePresta;
//    @Column(name = "designation")
    private String designation;
//    @Column(name = "client_id")
    @ManyToOne
    private Client client;

    @Column(name = "nb_days")
    private short nbDays;
    @Column(name = "unit_price")
    private Integer UnitPrice;
    @Transient
    @Column(name = "total_exclude_taxe")
    private Integer totalHt;
    @Transient
    @Column(name = "total_with_taxe")
    private Integer totalTtc;
//    @Column(name = "")
    private short state;

    public Order() {
    }

    public Order(String typePresta, String designation, Client client, short nbDays, Integer unitPrice, short state) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.client = client;
        this.nbDays = nbDays;
        UnitPrice = unitPrice;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public short getNbDays() {
        return nbDays;
    }

    public void setNbDays(short nbDays) {
        this.nbDays = nbDays;
    }

    public Integer getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        UnitPrice = unitPrice;
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

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", typePresta='" + typePresta + '\'' +
                ", designation='" + designation + '\'' +
                ", client=" + client +
                ", nbDays=" + nbDays +
                ", UnitPrice=" + UnitPrice +
                ", totalHt=" + totalHt +
                ", totalTtc=" + totalTtc +
                ", state=" + state +
                '}';
    }
}
