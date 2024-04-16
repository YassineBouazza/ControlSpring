package ma.emsi.control_springboot.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Entity
@Table(name = "orders")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate date;
    private Double amount;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
//    @OneToMany(mappedBy = "order")
//    private List<Produit> products;
}
