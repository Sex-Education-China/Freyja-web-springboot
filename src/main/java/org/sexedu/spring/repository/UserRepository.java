package org.sexedu.spring.repository;

import org.sexedu.spring.bean.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface UserRepository extends MongoRepository<User,Integer> {

}
