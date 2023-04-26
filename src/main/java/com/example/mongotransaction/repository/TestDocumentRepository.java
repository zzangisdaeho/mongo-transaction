package com.example.mongotransaction.repository;

import com.example.mongotransaction.documents.TestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestDocumentRepository extends MongoRepository<TestDocument, String> {
}
