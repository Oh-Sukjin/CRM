package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import com.example.CRM.Model.Order;

public class OrderMapper {

    public static OrderDTO convertToDto(Order o){
        OrderDTO dto = new OrderDTO();
        dto.setTypePresta(o.getPrestation());
        dto.setDesignation(o.getDescription());
        dto.setClientId(o.getIdclient());
        dto.setNbDays(o.getNbjours());
        dto.setUnitPrice(o.getPrixunitaire());
        dto.setTotalExcludeTaxe(o.getTotalHt());
        dto.setTotalWithTaxe(o.getTotalTtc());
        dto.setEtat(o.getEtat());
        return dto;

    }



}
