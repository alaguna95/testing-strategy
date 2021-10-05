package org.alaguna.testingstrategy.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Getter
public class BookEntity {

    public BookEntity(){

    }

    public BookEntity(String id, String name, Integer sheetsNumber, BookTopicEntity bookTopic){
        this.id = id;
        this.name = name;
        this.sheetsNumber = sheetsNumber;
        this.bookTopic = bookTopic;
    }

    @Id
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SHEETS_NUMBER")
    private Integer sheetsNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_TOPIC_ID")
    BookTopicEntity bookTopic;

}
