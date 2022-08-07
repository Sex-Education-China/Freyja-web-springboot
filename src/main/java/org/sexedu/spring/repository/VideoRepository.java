package org.sexedu.spring.repository;

import org.sexedu.spring.bean.Video;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableMongoRepositories
@CrossOrigin
public interface VideoRepository extends MongoRepository<Video, Integer> {

}
