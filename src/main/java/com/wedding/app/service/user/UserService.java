package com.wedding.app.service.user;

import com.wedding.app.service.exception.BusinessException;
import com.wedding.app.service.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
	private final UserRepository userRepository;

	public User getUserById(Long userId) {
		return userRepository.findById(userId).orElseThrow(
				() -> new BusinessException("There is no user with id: " + userId, HttpStatus.NOT_FOUND)
		);
	}

	public User getUserByLoginAndPass(String login, String password) {
		Optional<User> user = userRepository.findByLoginAndPassword(login, password);
		return user.orElse(null);
	}
}
