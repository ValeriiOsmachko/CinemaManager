package ua.com.osmachko.util;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.User;
import ua.com.osmachko.services.impl.UserServiceImpl;

import java.util.Date;

/**
 * Created by Valerii_Osmachko on 4/12/2017.
 */
public class EveryTenthTicketDiscount implements DiscountStrategy {

    @Autowired
    UserServiceImpl userService;

    @Override
    public double countDiscount(User user, Event event, Date date, Integer numberOfTickets) {
        if(userService.isUserExists(user)) {

        }
        Double totalDiscount = 0.0;
        Double basePrice = event.getBasePrice();
        Integer amountOfPurchasedTickets = user.getAmountOfTotalPurchasedTickets();
        Integer newAmount = amountOfPurchasedTickets + numberOfTickets;
        for (int i = amountOfPurchasedTickets + 1; i <= newAmount ; i++) {
            if(i % 10 == 0) {
                totalDiscount += basePrice * 0.5;
            }
        }
        return totalDiscount;
    }
}
