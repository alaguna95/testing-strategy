package org.alaguna.testingstrategy.objects.dto;

import org.alaguna.testingstrategy.dto.BookTopicOutputDTO;
import org.alaguna.testingstrategy.entity.BookTopicEntity;

public class BookTopicDtoObjectMother {

    public static BookTopicOutputDTO historical(){
        return new BookTopicOutputDTO("17268dbe-22a7-11ec-9621-0242ac130002", "Historical");
    }
}
