package ua.com.osmachko.services;

import ua.com.osmachko.entities.Event;

import java.util.Date;
import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
public interface EventService {

    /**
     * This method save event into database.
     * @param event
     */
    void save(Event event);

    /**
     * This method removes event from database
     * and returns success flag.
     * @param event
     */
    void remove(Event event);

    Event getById(String id);

    /**
     *This method returns event with
     * given name.
     * @param name
     * @return specific event
     */
    Event getByName(String name);

    /**
     * This method returns all events
     * in database.
     * @return all events in database
     */
    List<Event> getAll();

    /**
     * This method returns list of events which
     * happen in the date range.
     * @param from
     * @param to
     * @return Events in the range
     */
    List<Event> getForDateRange(Date from, Date to);

    /**
     * This method returns a list of events which
     * happen from now till the specified date.
     * @param to
     * @return Events from now till specified date
     */
    List<Event> getNextEvents(Date to);
}
