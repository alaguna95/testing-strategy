package org.alaguna.testingstrategy.dto;

import lombok.Getter;

@Getter
public class BookInputDTO {

    public BookInputDTO(String id, String name, Integer sheetsNumber, String bookTopicId){
        this.id = id;
        this.name = name;
        this.sheetsNumber = sheetsNumber;
        this.bookTopicId = bookTopicId;
    }

    private String id;

    private String name;

    private Integer sheetsNumber;

    private String bookTopicId;

}
