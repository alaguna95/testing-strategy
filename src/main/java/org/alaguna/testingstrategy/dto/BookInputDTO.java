package org.alaguna.testingstrategy.dto;

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

    public String getId() { return id; }

    public String getName() {
        return name;
    }

    public Integer getSheetsNumber(){ return sheetsNumber; }

    public String getBookTopicId() {
        return bookTopicId;
    }

}
