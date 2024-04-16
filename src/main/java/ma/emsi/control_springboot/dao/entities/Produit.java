package ma.emsi.control_springboot.dao.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "produits")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    @Size(max = 100)
    private String title;
    @NotEmpty
    private String designation;
    @NotNull
    @Min(0)
    private double prix;

}
