package org.ada.school.repository;

import org.ada.school.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByNameOrLastNameLike(String queryText, String queryText2);

    List<User> findByCreatedAtAfter(Date createdAt);
}
