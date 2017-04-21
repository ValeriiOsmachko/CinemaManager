package ua.com.osmachko.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import ua.com.osmachko.rating.SeatType;

import javax.persistence.*;

/**
 * Created by Valerii_Osmachko on 4/18/2017.
 */
@Data
@Table(name = "seat")
@Entity
public class Seat {

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)", name = "id")
    @Id
    private String id;
    @Column(name = "row")
    private Integer row;
    @Column(name = "seat_number")
    private Integer seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;

}
