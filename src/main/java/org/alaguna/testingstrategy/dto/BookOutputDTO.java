package org.alaguna.testingstrategy.dto;

import lombok.Getter;

@Getter
public class BookOutputDTO {

    public BookOutputDTO(String id, String name, Integer sheetsNumber, BookTopicOutputDTO bookTopic){
        this.id = id;
        this.name = name;
        this.sheetsNumber = sheetsNumber;
        this.bookTopic = bookTopic;
    }

    private String id;

    private String name;

    private Integer sheetsNumber;

    private BookTopicOutputDTO bookTopic;

}
