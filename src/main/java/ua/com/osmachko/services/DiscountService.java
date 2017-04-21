package ua.com.osmachko.services;

import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.User;

import java.util.Date;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
public interface DiscountService {

    Double getDiscount(User user, Event event, Date date, Integer numberOfTickets);


}
