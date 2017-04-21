package ua.com.osmachko;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import ua.com.osmachko.configuration.ApplicationConfiguration;

/**
 * Created by Valerii_Osmachko on 4/19/2017.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.refresh();
        context.getBean(LocalSessionFactoryBean.class);
    }
}
