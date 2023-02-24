package com.Calendar.Calendar.Repository;

import com.Calendar.Calendar.Domain.Events;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRespository extends MongoRepository<Events, String> {
}
