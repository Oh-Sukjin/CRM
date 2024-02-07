package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import com.example.CRM.Model.Order;
import jakarta.persistence.Entity;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

public class OrderMapper {


    public static OrderDTO convertToDto(Order o){

        OrderDTO dto = new OrderDTO();
//        Client c = new Client();
        dto.setId(o.getId());
        dto.setTypePrestation(o.getTypePresta());
        dto.setDescription(o.getDesignation());
        dto.setClient(o.getId());
//        dto.setClient(c);
        dto.setNbJours(o.getNbDays());
        dto.setPrixUnitaire(o.getUnitPrice());
        dto.setTotalHT(o.getNbDays()*o.getUnitPrice());
        dto.setTotalTTC(((int)(o.getNbDays()*o.getUnitPrice()*1.2)));
        dto.setEtat(o.getState());
        return dto;
    }
}
