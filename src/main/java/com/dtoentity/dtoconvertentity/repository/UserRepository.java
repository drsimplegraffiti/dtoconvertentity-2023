package com.dtoentity.dtoconvertentity.repository;

import com.dtoentity.dtoconvertentity.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
