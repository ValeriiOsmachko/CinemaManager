package ua.com.osmachko.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;


/**
 * Created by Valerii_Osmachko on 4/10/2017.
 */

@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)", name = "user_id")
    @Id
    private String id;
    @Column(name = "email")
    private String email;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birthday_date")
    private Date birthdayDate;
    @Column(name = "amount_of_total_purchased_tickets")
    private Integer amountOfTotalPurchasedTickets;
   /* @OneToMany
    @JoinColumn(name = "ticket")
    private NavigableSet<Ticket> tickets = new TreeSet<>();*/


}
