package ua.com.osmachko.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.osmachko.dao.TicketRepository;
import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.Ticket;
import ua.com.osmachko.entities.User;
import ua.com.osmachko.services.BookingService;

import java.util.Date;
import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
@Service
public class BookingServiceImpl implements BookingService {


   @Autowired
    TicketRepository ticketRepository;

    public Double getTicketsPrice(Event event, Date dateTime, User user, Integer seats) {
        return null;
    }


    public boolean bookTicket(List<Ticket> tickets) {
        return false;
    }

    public List<Ticket> getPurchasedTicketsForEvent(Event event, Date date) {
        return ticketRepository.findByEventAndDate(event,date);
    }
}
