package org.alaguna.testingstrategy.objects.entity;

import org.alaguna.testingstrategy.entity.BookEntity;

public class BookObjectMother {

     public static BookEntity createBook(){
         return new BookEntity(1L, "Learn english", 1000);
     }
}
