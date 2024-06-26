package com.project1.project.repository;


import com.project1.project.model.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.UUID;

public interface DocumentRepository extends MongoRepository<Document, UUID> {
    @Query("{ 'client_id': ?0 }")
    List<Document> findByClientId(String client_id);
}
