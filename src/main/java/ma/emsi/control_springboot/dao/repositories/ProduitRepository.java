package ma.emsi.control_springboot.dao.repositories;

import jakarta.transaction.Transactional;
import ma.emsi.control_springboot.dao.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


@Transactional
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    Page<Produit> findByDesignationContains(String keyword, Pageable pageable);

}