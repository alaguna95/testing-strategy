package org.alaguna.testingstrategy.objects.dto;

import org.alaguna.testingstrategy.dto.BookTopicOutputDTO;
import org.alaguna.testingstrategy.entity.BookTopicEntity;

public class BookTopicDtoObjectMother {

    public static BookTopicOutputDTO historical(){
        return new BookTopicOutputDTO(-1L, "Historical");
    }
}
