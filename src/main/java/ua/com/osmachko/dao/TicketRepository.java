package ua.com.osmachko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.osmachko.entities.Event;
import ua.com.osmachko.entities.Ticket;

import java.util.Date;
import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/12/2017.
 */
@Repository
public interface TicketRepository extends JpaRepository<Ticket,String> {

    List<Ticket> findByEventAndDate(Event event, Date date);
}
