package supplement_store2.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import supplement_store2.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
