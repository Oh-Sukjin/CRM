package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("crm")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("clients")
    public List<ClientDTO> findAll(){
        List<Client> models = clientService.findAll();
        List<ClientDTO> dtos = new ArrayList<>();
        for(Client c : models){
            ClientDTO dto = ClientMapper.convertToDto(c);
            dtos.add(dto);
        }
        return dtos;
    }

    @PostMapping("clients")
    public void add(@RequestBody Client client){
        clientService.add(client);
    }

    @GetMapping("clients/{id}")
    public ResponseEntity<Client> findById(@PathVariable("id") Integer voitureId){
        Optional<Client> opt = clientService.findById(voitureId);
        if(opt.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(opt.get());
    }

    @DeleteMapping("clients/{id}")
    public void delete(@PathVariable("id") Integer id){
        clientService.delete(id);
    }

    @PutMapping("clients/{id}")
    public ResponseEntity put(@PathVariable("id") Integer id
            , @RequestBody Client c){
        // ATTENTION à l'ordre pour éviter le NullpointerException
        //  if(!id.equals(voiture.getId())) {
        if(!c.getId().equals(id)) {
            return ResponseEntity.badRequest().build();
        } else {
            clientService.update(c);
            return ResponseEntity.ok().build();
        }
    }


}
