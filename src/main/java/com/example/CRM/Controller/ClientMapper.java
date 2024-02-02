package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class ClientMapper {

    public static ClientDTO convertToDto(Client client){
        ClientDTO dto = new ClientDTO();
        dto.setCompany_name(client.getEntreprise());
        dto.setFirst_name(client.getNom());
        dto.setLast_name(client.getPrenom());
        dto.setEmail(client.getEmail());
        dto.setPhone(client.getTelephone());
        dto.setAddress(client.getAdresse());
        dto.setZip_code(client.getCodepostal());
        dto.setCity(client.getVille());
        dto.setCountry(client.getPays());
        dto.setState(client.getEtat());
        return dto;

    }



}
