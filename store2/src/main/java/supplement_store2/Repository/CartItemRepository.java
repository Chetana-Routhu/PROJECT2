package supplement_store2.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import supplement_store2.entities.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
