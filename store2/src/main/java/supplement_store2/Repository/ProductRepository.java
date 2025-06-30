package supplement_store2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import supplement_store2.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
