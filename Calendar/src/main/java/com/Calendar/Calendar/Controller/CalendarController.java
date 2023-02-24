package com.Calendar.Calendar.Controller;

import com.Calendar.Calendar.Domain.Events;
import com.Calendar.Calendar.Service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendar/auth")
public class CalendarController {
    @Autowired
    private CalendarService calendarService;
    @PostMapping("/create")
    public Events saveCalendar(@RequestBody Events events){
       return calendarService.saveCalendar(events);
    }
    @GetMapping("/getAll")
        public List<Events> getAllCalendar(){
        return calendarService.findAll();
        }
    @GetMapping("/getById/{id}")
    public Events findCalendarById(@PathVariable String id){
        return calendarService.findCalendarById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteEventsById(@PathVariable String id){
        calendarService.deleteById(id);
    }

}
