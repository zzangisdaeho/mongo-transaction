package com.example.mongotransaction.service;

import com.example.mongotransaction.documents.TestDocument;
import com.example.mongotransaction.repository.TestDocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestDocumentRepository testDocumentRepository;

    @Transactional
    public void saveTest(){
        TestDocument name1 = TestDocument.builder().name("name1").age(10).build();
        testDocumentRepository.save(name1);

        TestDocument name2 = TestDocument.builder().name("name2").age(20).build();
        testDocumentRepository.save(name2);

        TestDocument name3 = TestDocument.builder().name("name3").age(30).build();
        testDocumentRepository.save(name3);

        throw new RuntimeException("저장하지 마");
    }
}
