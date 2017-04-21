package ua.com.osmachko.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.*;
import java.time.LocalDateTime;


/**
 * Created by Valerii_Osmachko on 4/11/2017.
 */
@Data
@Entity
@Table(name = "ticket")
public class Ticket {

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)")
    @Id
    private String id;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private Event event;
    @Column(name = "date_time")
    private LocalDateTime dateTime;
    @Column(name = "seat_number")
    private long seat;

    public Ticket(User user, Event event, LocalDateTime dateTime, long seat) {
       /* this.user = user;
        this.event = event;*/
        this.dateTime = dateTime;
        this.seat = seat;
    }




}
