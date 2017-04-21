package ua.com.osmachko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.osmachko.entities.User;

/**
 * Created by Valerii_Osmachko on 4/10/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User,String>{

    User findByEmail(String email);

}
