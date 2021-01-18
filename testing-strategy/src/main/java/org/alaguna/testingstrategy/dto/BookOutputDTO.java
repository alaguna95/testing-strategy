package org.alaguna.testingstrategy.dto;

public class BookOutputDTO {

    public BookOutputDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }

    private Long id;

    private String name;

    public Long getId() { return id; }

    public String getName() {
        return name;
    }

}
