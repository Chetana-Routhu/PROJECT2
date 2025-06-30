package supplement_store2.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import supplement_store2.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
