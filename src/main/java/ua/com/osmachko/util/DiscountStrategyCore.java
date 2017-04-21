package ua.com.osmachko.util;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.User;
import ua.com.osmachko.services.impl.UserServiceImpl;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/11/2017.
 */
@Component
public class DiscountStrategyCore {

    @Autowired
    UserServiceImpl userService;
    @Autowired
    List<DiscountStrategy> strategies;

   public Double countDiscount(User user, Event event, Date date, Integer numberOfTickets) {
       return  strategies.stream().mapToDouble(e -> e.countDiscount(user,event,date,numberOfTickets)).max().getAsDouble();
   }




}
