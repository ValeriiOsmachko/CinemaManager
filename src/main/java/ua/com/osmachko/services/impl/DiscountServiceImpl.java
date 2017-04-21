package ua.com.osmachko.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.User;
import ua.com.osmachko.services.DiscountService;
import ua.com.osmachko.util.DiscountStrategyCore;

import java.util.Date;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
@Service
public class DiscountServiceImpl implements DiscountService {


    @Autowired
    DiscountStrategyCore discountStrategy;

    public Double getDiscount(User user, Event event, Date date, Integer numberOfTickets) {
        return discountStrategy.countDiscount(user,event,date,numberOfTickets);
    }
}
