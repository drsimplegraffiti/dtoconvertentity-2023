package com.dtoentity.dtoconvertentity.service;

import com.dtoentity.dtoconvertentity.dto.UserDto;

import java.util.List;

public interface UserService {
   List<UserDto> getAllUsers();
    UserDto getUserById(String id);
    UserDto createUser(UserDto userDto);

    String deleteUser(String id);

}
