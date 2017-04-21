package ua.com.osmachko.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * Created by Valerii_Osmachko on 4/10/2017.
 */
@Table(name = "auditorium")
@Data
@Entity
public class Auditorium {

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)", name = "id")
    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "total_amount_of_seats")
    private Long numberOfSeats;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "seat")
    private Set<Seat> vipSeates = Collections.emptySet();
    private Set<Seat> commonSeats = Collections.emptySet();


    /*public long countVipSeats(Collection<Long> seats) {
        return seats.stream().filter(seat -> vipSeates.contains(seat)).count();
    }*/
}
