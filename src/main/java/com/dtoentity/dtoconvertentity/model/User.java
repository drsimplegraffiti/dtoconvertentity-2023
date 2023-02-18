package com.dtoentity.dtoconvertentity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data // This annotation is used to generate getters and setters for all the fields in the class.
@NoArgsConstructor // This annotation is used to generate a constructor with no parameters. e.g. public User() {}
@AllArgsConstructor // This annotation is used to generate a constructor with all the fields in the class as parameters. e.g. public User(String username, String email, String password, Integer age, String accountNumber) {}
@Document(collection = "users") // This annotation is used to map the User class to the users collection in the database.
public class User { // This class is used to represent the users collection in the database.

    @Id // This annotation is used to map the id field to the _id field in the database.
    private String id; // This field is used to represent the _id field in the database.
    private String username;
    private String email;
    private String password;
    private Integer age;
    private String accountNumber;



}
