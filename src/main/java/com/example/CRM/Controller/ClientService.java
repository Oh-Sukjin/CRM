package com.example.CRM.Controller;

import com.example.CRM.DAO.ClientRepo;
import com.example.CRM.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepo clientRepo;

    public List<Client> findAll(){
        return clientRepo.findAll();
    }

    public void add(Client c){
        clientRepo.save(c);
    }

    public Optional<Client> findById(Integer id){
        return clientRepo.findById(id);
    }

    public void delete(Integer id){
        clientRepo.deleteById(id);
    }

    public void update(Client c){
        clientRepo.save(c);
    }


}
