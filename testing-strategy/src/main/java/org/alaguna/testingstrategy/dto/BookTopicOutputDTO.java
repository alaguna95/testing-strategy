package org.alaguna.testingstrategy.dto;

public class BookTopicOutputDTO {

    public BookTopicOutputDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object){
        BookTopicOutputDTO bookTopic  = (BookTopicOutputDTO) object;

        return id.equals(bookTopic.getId()) && name.equals(bookTopic.getName());
    }
}
