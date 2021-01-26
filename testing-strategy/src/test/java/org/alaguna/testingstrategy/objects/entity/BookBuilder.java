package org.alaguna.testingstrategy.objects.entity;

import org.alaguna.testingstrategy.entity.BookEntity;

public class BookBuilder {

    private Long id;
    private String name;
    private Integer sheetsNumber;

    public BookBuilder(){
        id = 1L;
        name = "Learn english";
        sheetsNumber = 120;
    }

    public BookBuilder withId(Long id){
        this.id=id;
        return this;
    }
    public BookBuilder withName(String name){
        this.name=name;
        return this;
    }
    public BookBuilder withSheetsNumber(Integer sheetsNumber){
        this.sheetsNumber=sheetsNumber;
        return this;
    }

    public BookEntity build(){
        return new BookEntity(id, name, sheetsNumber);
    }

}
