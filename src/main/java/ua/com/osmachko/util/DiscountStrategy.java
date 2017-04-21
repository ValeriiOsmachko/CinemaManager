package ua.com.osmachko.util;

import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.User;

import java.util.Date;

/**
 * Created by Valerii_Osmachko on 4/12/2017.
 */
public interface DiscountStrategy {

    double countDiscount(User user, Event event, Date date, Integer numberOfTickets);
}
