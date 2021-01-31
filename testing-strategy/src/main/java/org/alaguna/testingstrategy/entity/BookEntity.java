package org.alaguna.testingstrategy.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class BookEntity {

    public BookEntity(){

    }

    public BookEntity(Long id, String name, Integer sheetsNumber, BookTopicEntity bookTopic){
        this.id = id;
        this.name = name;
        this.sheetsNumber = sheetsNumber;
        this.bookTopic = bookTopic;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SHEETS_NUMBER")
    private Integer sheetsNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_TOPIC_ID")
    BookTopicEntity bookTopic;

    public Long getId() {
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
