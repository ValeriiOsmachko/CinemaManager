package ua.com.osmachko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.osmachko.entities.Auditorium;

/**
 * Created by Valerii_Osmachko on 4/12/2017.
 */
@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium,String> {

    Auditorium findByName(String name);

}
