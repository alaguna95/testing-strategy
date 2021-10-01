package org.alaguna.testingstrategy.dto;

public class BookTopicOutputDTO {

    public BookTopicOutputDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;

    public String getId() {
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
