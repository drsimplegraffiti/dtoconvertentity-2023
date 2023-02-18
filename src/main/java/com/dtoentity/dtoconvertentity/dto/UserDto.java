package com.dtoentity.dtoconvertentity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto { // dto class is used to transfer data between processes
//    private String id;
    private String username;
    private String email;
    private String password;
    private Integer age;
    private String accountNumber;

}
