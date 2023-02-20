package com.wedding.app.service.user;

import com.wedding.app.service.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.login = ?1 AND u.password = ?2")
	Optional<User> findByLoginAndPassword(String login, String password);
}
