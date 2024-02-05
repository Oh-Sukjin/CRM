package com.example.CRM.Controller;


import com.example.CRM.DAO.OrderRepo;
import com.example.CRM.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public List<Order> findAll(){
        return orderRepo.findAll();
    }

    public void add(Order c){
        orderRepo.save(c);
    }

    public Optional<Order> findById(Integer id){
        return orderRepo.findById(id);
    }

    public void delete(Integer id){
        orderRepo.deleteById(id);
    }

    public void update(Order c){
        orderRepo.save(c);
    }


}
