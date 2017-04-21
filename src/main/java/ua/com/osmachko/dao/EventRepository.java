package ua.com.osmachko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.osmachko.entities.Event;

import java.util.Date;
import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/10/2017.
 */
@Repository
public interface EventRepository extends JpaRepository<Event,String> {

    Event findByName(String name);
    List<Event> findByDateFromAndTo(Date from,Date to);
}
