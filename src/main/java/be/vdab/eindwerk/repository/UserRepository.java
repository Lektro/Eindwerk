package be.vdab.eindwerk.repository;

import be.vdab.eindwerk.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {
}
