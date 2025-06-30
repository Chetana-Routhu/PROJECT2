package supplement_store2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import supplement_store2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
}
