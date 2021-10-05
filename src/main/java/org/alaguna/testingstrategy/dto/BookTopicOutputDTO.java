package org.alaguna.testingstrategy.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class BookTopicOutputDTO {

    public BookTopicOutputDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;

}
