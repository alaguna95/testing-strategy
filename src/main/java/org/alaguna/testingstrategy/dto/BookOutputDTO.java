package org.alaguna.testingstrategy.dto;

public class BookOutputDTO {

    public BookOutputDTO(Long id, String name, Integer sheetsNumber, BookTopicOutputDTO bookTopic){
        this.id = id;
        this.name = name;
        this.sheetsNumber = sheetsNumber;
        this.bookTopic = bookTopic;
    }

    private Long id;

    private String name;

    private Integer sheetsNumber;

    private BookTopicOutputDTO bookTopic;

    public Long getId() { return id; }

    public String getName() {
        return name;
    }

    public Integer getSheetsNumber(){ return sheetsNumber; }

    public BookTopicOutputDTO getBookTopic() {
        return bookTopic;
    }
}
