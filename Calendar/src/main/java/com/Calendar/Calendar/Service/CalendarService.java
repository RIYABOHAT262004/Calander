package com.Calendar.Calendar.Service;

import com.Calendar.Calendar.Domain.Events;
import com.Calendar.Calendar.Repository.CalendarRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CalendarService {
    @Autowired
    private CalendarRespository calendarRespository;

    public Events saveCalendar(Events events) {
        events.setDate(LocalDateTime.now());
        events.setVisible(LocalDateTime.now().plusDays(30));
        calendarRespository.save(events);
        return events;
    }

    public List<Events> findAll() {
        return calendarRespository.findAll();
    }

    public Events findCalendarById(String id) {
        Optional<Events> calendar = calendarRespository.findById(id);
        return calendar.get();
    }

    public void deleteById(String id) {
        calendarRespository.deleteById(id);
    }
}
