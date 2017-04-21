package ua.com.osmachko.util;

import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.User;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Valerii_Osmachko on 4/12/2017.
 */
public class BirthdayDiscount implements DiscountStrategy {

    private static final Integer FIVE = 5;

    @Override
    public double countDiscount(User user, Event event, Date date, Integer numberOfTickets) {
        Double totalDiscount = 0.0;
        Date userBirthdayDate = user.getBirthdayDate();
        Date dayOfDiscountEnding = plusFiveDaysToUserBirthdayDate(userBirthdayDate);
        if(date.after(userBirthdayDate) && date.before(dayOfDiscountEnding)) {
            totalDiscount = (event.getBasePrice() * numberOfTickets) * 0.95;
        }
        return totalDiscount;
    }

    private Date plusFiveDaysToUserBirthdayDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, FIVE);
        return calendar.getTime();
    }
}
