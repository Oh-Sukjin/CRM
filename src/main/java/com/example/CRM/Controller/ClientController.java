package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    private HashMap<Integer, Client> clients = new HashMap<>();
    private int idCount;

    public void add(Client client){
        idCount++;
        client.setId(idCount);
        clients.put(client.getId(), client);
    }

}
