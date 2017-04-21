package ua.com.osmachko.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.osmachko.dao.AuditoriumRepository;
import ua.com.osmachko.entities.Auditorium;
import ua.com.osmachko.services.AuditoriumService;

import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
@Service
public class AuditoriumServiceImpl implements AuditoriumService {

    @Autowired
    AuditoriumRepository auditoriumRepository;

    public Auditorium getByName(String name) {
        return auditoriumRepository.findByName(name);
    }

    public List<Auditorium> getAll() {
        return auditoriumRepository.findAll();
    }

}
