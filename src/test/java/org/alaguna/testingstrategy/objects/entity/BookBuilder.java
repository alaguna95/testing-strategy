package org.alaguna.testingstrategy.objects.entity;

import org.alaguna.testingstrategy.entity.BookEntity;
import org.alaguna.testingstrategy.entity.BookTopicEntity;

public class BookBuilder {

    private String id;
    private String name;
    private Integer sheetsNumber;
    private BookTopicEntity bookTopic;

    public BookBuilder(){
        id = "17268dbe-22a7-11ec-9621-0242ac130002";
        name = "Learn english";
        sheetsNumber = 120;
        bookTopic = BookTopicObjectMother.historical();
    }

    public BookBuilder withId(String id){
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

    public BookBuilder withBookTopic(BookTopicEntity bookType){
        this.bookTopic=bookTopic;
        return this;
    }

    public BookEntity build(){
        return new BookEntity(id, name, sheetsNumber, bookTopic);
    }

}
