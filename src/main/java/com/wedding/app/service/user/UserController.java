package com.wedding.app.service.user;

import com.wedding.app.service.user.dto.UserDto;
import com.wedding.app.service.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/${api.url}/users")
@RestController
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	private final UserDtoMapper userDtoMapper;

	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable Long userId) {
		User user = userService.getUserById(userId);
		return new ResponseEntity<>(userDtoMapper.userToUserDto(user), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<UserDto> getUserByEmailAndPass(@RequestParam String login, @RequestParam String password) {
		User user = userService.getUserByLoginAndPass(login, password);
		return new ResponseEntity<>(userDtoMapper.userToUserDto(user), HttpStatus.OK);
	}
}
