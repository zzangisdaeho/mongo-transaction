package com.example.mongotransaction.documents;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "t1")
@TypeAlias("t1")
@Builder
@Getter
public class TestDocument {

    @Id
    private String id;

    private String name;

    private int age;

}
