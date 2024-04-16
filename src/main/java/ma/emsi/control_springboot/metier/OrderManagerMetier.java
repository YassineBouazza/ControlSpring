package ma.emsi.control_springboot.metier;

import ma.emsi.control_springboot.dao.entities.Order;
import ma.emsi.control_springboot.dao.repositories.OrderRepository;
import ma.emsi.control_springboot.metier.OrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
 @Service
public class OrderManagerMetier implements OrderManager {

     @Autowired
     private OrderRepository orderRepository;

     @Override
     public Order addOrder(Order order) {
         return orderRepository.save(order);
     }

     @Override
     public Page<Order> getAllOrders(int page, int taille) {
         return null;
     }

     @Override
     public Page<Order> searchOrders(String keyword, int page, int taille) {
         return null;
     }

//     @Override
//     public Page<Order> getAllOrders(int page, int taille) {
//         return orderRepository.findAll(PageRequest.of(page, taille));
//     }

//

     @Override
     public List<Order> getByKeyword(String keyword) {
         return null;
     }

     @Override
     public Order getOrderById(Integer id) {
         return orderRepository.findById(id).get();
     }

     @Override
     public Order updateOrder(Order order) {
         return orderRepository.save(order);
     }

     @Override
     public boolean deleteOrder(Integer id) {
         try {
             orderRepository.deleteById(id);
             return true;
         } catch (Exception exception) {
             return false;
         }
     }
 }
