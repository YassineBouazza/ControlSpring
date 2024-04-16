package ma.emsi.control_springboot.metier;

import ma.emsi.control_springboot.dao.entities.Order;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface OrderManager {

    public Order addOrder(Order order);
    public Page<Order> getAllOrders(int page, int taille);
    public Page<Order> searchOrders(String keyword, int page, int taille);
    public List<Order> getByKeyword(String keyword);
    public Order getOrderById(Integer id);
    public Order updateOrder(Order order);
    public boolean deleteOrder(Integer id);
}
