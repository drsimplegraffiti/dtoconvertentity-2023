package com.dtoentity.dtoconvertentity.serviceimpl;

import com.dtoentity.dtoconvertentity.dto.UserDto;
import com.dtoentity.dtoconvertentity.dto.UserDtoConverter;
import com.dtoentity.dtoconvertentity.model.User;
import com.dtoentity.dtoconvertentity.repository.UserRepository;
import com.dtoentity.dtoconvertentity.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserDtoConverter::toUserDto).collect(Collectors.toList());
    }

    // we need to convert the userDto to user
    @Override
    public UserDto getUserById(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return UserDtoConverter.toUserDto(user);
    }


    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserDtoConverter.toUserEntity(userDto);
        user = userRepository.save(user);
        return UserDtoConverter.toUserDto(user);
    }

    @Override
    public String deleteUser(String id) {
        userRepository.deleteById(id);
        return "User deleted successfully";
    }
}
