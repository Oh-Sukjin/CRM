package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import com.example.CRM.Model.Order;

public class OrderMapper {

    public static OrderDTO convertToDto(Order o){
        OrderDTO dto = new OrderDTO();
        dto.setTypePresta(o.getTypePresta());
        dto.setDesignation(o.getDesignation());
        dto.setClientId(o.getId());
        dto.setNbDays(o.getNbDays());
        dto.setUnitPrice(o.getUnitPrice());
        dto.setTotalExcludeTaxe(o.getTotalHt());
        dto.setTotalWithTaxe(o.getTotalTtc());
        dto.setEtat(o.getState());
        return dto;

    }



}
