package org.alaguna.testingstrategy.entity;


import javax.persistence.*;

@Entity
@Table(name = "book_topics")
public class BookTopicEntity {

    public BookTopicEntity(){

    }

    public BookTopicEntity(Long id, String name){
        this.id=id;
        this.name = name;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
