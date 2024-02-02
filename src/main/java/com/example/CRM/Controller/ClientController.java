package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("crm")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("clients")
    public List<ClientDTO> findAll(){
        List<Client> models = clientService.findAll();
        List<ClientDTO> dtos = new ArrayList<>();
        for(Client v : models){
            ClientDTO dto = ClientMapper.convertToDto(v);
            dtos.add(dto);
        }
        return dtos;
    }



}
