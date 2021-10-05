package org.alaguna.testingstrategy.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "book_topics")
@Getter
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

}
