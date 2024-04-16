package ma.emsi.control_springboot.dao.repositories;

import ma.emsi.control_springboot.dao.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Integer> {
}
