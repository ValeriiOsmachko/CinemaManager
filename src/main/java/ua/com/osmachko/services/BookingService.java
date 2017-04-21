package ua.com.osmachko.services;

import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.Ticket;
import ua.com.osmachko.entities.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
public interface BookingService {

    Double getTicketsPrice(Event event, Date dateTime, User user, Integer seats);

    boolean bookTicket(List<Ticket> tickets);

    List<Ticket> getPurchasedTicketsForEvent(Event event, Date date);
}
