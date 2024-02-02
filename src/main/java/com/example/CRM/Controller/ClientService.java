package com.example.CRM.Controller;

import com.example.CRM.DAO.ClientRepo;
import com.example.CRM.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepo clientRepo;

    public List<Client> findAll(){
        return clientRepo.findAll();
    }


}
