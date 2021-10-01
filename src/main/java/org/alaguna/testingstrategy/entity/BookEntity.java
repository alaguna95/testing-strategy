package org.alaguna.testingstrategy.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSheetsNumber() {
        return sheetsNumber;
    }

    public BookTopicEntity getBookTopic() {
        return bookTopic;
    }

}
