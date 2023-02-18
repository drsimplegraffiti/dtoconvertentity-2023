package com.dtoentity.dtoconvertentity.dto;

import com.dtoentity.dtoconvertentity.model.User;

public class UserDtoConverter {


    // convert user entity to user dto
    public static UserDto toUserDto(User user) { // convert user to userDto
        UserDto userDto = new UserDto();
//        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setAge(user.getAge());
        userDto.setAccountNumber(user.getAccountNumber());
        return userDto;
    }

    // convert user dto to user entity
    public static User toUserEntity(UserDto userDto) { // we need to convert the userDto to user
        User user = new User();
//        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAge(userDto.getAge());
        user.setAccountNumber(userDto.getAccountNumber());
        return user;
    }
}
