package org.alaguna.testingstrategy.entity;


import javax.persistence.*;

@Entity
@Table(name = "book_topics")
public class BookTopicEntity {

    public BookTopicEntity(){

    }

    public BookTopicEntity(String id, String name){
        this.id=id;
        this.name = name;
    }


    @Id
    private String id;

    @Column(name = "NAME")
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
