package ua.com.osmachko.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.osmachko.dao.EventRepository;
import ua.com.osmachko.entities.Event;
import ua.com.osmachko.services.EventService;

import java.util.Date;
import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
@Service
public class EventServiceImpl implements EventService {


    @Autowired
    EventRepository eventRepository;

    public void save(Event event) {
        eventRepository.save(event);
    }

    public void remove(Event event) {
        eventRepository.delete(event);
    }

    public Event getById(String id) {
        return eventRepository.findOne(id);
    }

    public Event getByName(String name)
    {
        return eventRepository.findByName(name);
    }

    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    public List<Event> getForDateRange(Date from, Date to) {
        return eventRepository.findByDateFromAndTo(from,to);
    }

    public List<Event> getNextEvents(Date to) {
        return null;
    }
}
