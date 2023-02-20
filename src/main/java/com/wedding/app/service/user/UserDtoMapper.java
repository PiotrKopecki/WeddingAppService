package com.wedding.app.service.user;

import com.wedding.app.service.user.dto.UserDto;
import com.wedding.app.service.user.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

	UserDto userToUserDto(User user);
}
