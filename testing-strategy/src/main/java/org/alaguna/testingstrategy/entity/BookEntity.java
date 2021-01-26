package org.alaguna.testingstrategy.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class BookEntity {

    public BookEntity(){

    }

    public BookEntity(Long id, String name, Integer sheetsNumber){
        this.id = id;
        this.name = name;
        this.sheetsNumber = sheetsNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SHEETS_NUMBER")
    private Integer sheetsNumber;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSheetsNumber() {
        return sheetsNumber;
    }
}
