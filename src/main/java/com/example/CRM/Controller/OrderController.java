package com.example.CRM.Controller;

import com.example.CRM.Model.Client;
import com.example.CRM.Model.Order;
import com.example.CRM.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("crm")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    ClientService clientService;

    @GetMapping("commandes")
    public List<OrderDTO> findAll(){
        List<Order> models = orderService.findAll();
        List<OrderDTO> dtos = new ArrayList<>();
        for(Order o : models){
            OrderDTO dto = OrderMapper.convertToDto(o);
            dtos.add(dto);
        }
        return dtos;
    }

    @PostMapping("commandes")
    public void add(@RequestBody Order o){
        orderService.add(o);
    }

    @GetMapping("commandes/{id}")
    public ResponseEntity<Order> findById(@PathVariable("id") Integer orderId){
        Optional<Order> opt = orderService.findById(orderId);
        if(opt.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(opt.get());
    }

    @DeleteMapping("commandes/{id}")
    public void delete(@PathVariable("id") Integer id){
        orderService.delete(id);
    }

    @PutMapping("commandes/{id}")
    public ResponseEntity put(@PathVariable("id") Integer id
            , @RequestBody Order o){
        // ATTENTION à l'ordre pour éviter le NullpointerException
//        if(!id.equals(o.getId())) {
        if(!o.getId().equals(id)) {
            return ResponseEntity.badRequest().build();
        } else {
            orderService.update(o);
            return ResponseEntity.ok().build();
        }
    }


}
