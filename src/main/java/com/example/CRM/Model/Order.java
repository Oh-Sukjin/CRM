package com.example.CRM.Model;

import com.example.CRM.Controller.OrderState;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @ManyToOne
    private Client client;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @Column(name = "type_presta")
    private String typePresta;
//    @Column(name = "designation")
    private String designation;
//    @Column(name = "client_id")


    @Column(name = "nb_days")
    private short nbDays;
//    @Column(name = "unit_price")
    private Integer unitPrice;
    @Transient
    @Column(name = "total_exclude_taxe")
    private Integer totalHt;
    @Transient
    @Column(name = "total_with_taxe")
    private Integer totalTtc;
//    @Column(name = "")

@Column(columnDefinition = "int4") // lié à un probleme de conversion SMALLINT vers INTEGER
private OrderState state;

    public Order() {
    }

    public Order(String typePresta, String designation, Client client, short nbDays, Integer unitPrice, OrderState state) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.client = client;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
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
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;   }

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

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
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
                ", unitPrice=" + unitPrice +
                ", totalHt=" + totalHt +
                ", totalTtc=" + totalTtc +
                ", state=" + state +
                '}';
    }
}
