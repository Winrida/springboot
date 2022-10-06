package web.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.springboot.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
