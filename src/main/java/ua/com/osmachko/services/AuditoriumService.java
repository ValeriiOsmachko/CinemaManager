package ua.com.osmachko.services;

import ua.com.osmachko.entities.Auditorium;

import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
public interface AuditoriumService {

    Auditorium getByName(String name);

    List<Auditorium> getAll();
}
