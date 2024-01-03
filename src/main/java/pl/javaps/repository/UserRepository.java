package pl.javaps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javaps.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
