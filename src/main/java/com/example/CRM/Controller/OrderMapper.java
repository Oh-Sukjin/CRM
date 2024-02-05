package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import com.example.CRM.Model.Order;
import jakarta.persistence.Entity;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

public class OrderMapper {


    public static OrderDTO convertToDto(Order o){
        String state = "";
        OrderDTO dto = new OrderDTO();
        dto.setTypePrestation(o.getTypePresta());
        dto.setDescription(o.getDesignation());
        dto.setClientId(o.getId());
        dto.setNbJours(o.getNbDays());
        dto.setPrixUnitaire(o.getUnitPrice());
        dto.setTotalHT(o.getTotalHt());
        dto.setTotalTTC(o.getTotalTtc());

        return dto;
    }

    public static Order convertToEntity(OrderDTO o){
        Order entity = new Order();
        Client c = new Client();
        entity.setDesignation(o.getDescription());
        entity.setClient(c);
        entity.setNbDays(o.getNbJours());
        entity.setUnitPrice(o.getPrixUnitaire());
        entity.setTotalHt(o.getTotalHT());
        entity.setTotalTtc(o.getTotalTTC());
        entity.setState(o.getEtat());
        return entity;




    }




}
