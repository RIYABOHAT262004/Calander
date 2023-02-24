package com.Calendar.Calendar.Domain;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Date;
@Data
public class Events {
    @Id
    private String id;
    private String name;
    private LocalDateTime date;
    private LocalDateTime visible;
    private String eventType;
    private String wikiLink;
}
