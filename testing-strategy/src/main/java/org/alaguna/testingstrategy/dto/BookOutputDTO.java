package org.alaguna.testingstrategy.dto;

public class BookOutputDTO {

    public BookOutputDTO(Long id, String name, Integer sheetsNumber){
        this.id = id;
        this.name = name;
        this.sheetsNumber = sheetsNumber;
    }

    private Long id;

    private String name;

    private Integer sheetsNumber;

    public Long getId() { return id; }

    public String getName() {
        return name;
    }

    public Integer getSheetsName(){ return sheetsNumber; }
}
