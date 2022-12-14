package pl.project.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.forum.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
