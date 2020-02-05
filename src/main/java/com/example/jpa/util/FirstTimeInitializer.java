package com.example.jpa.util;

import com.example.jpa.security.AppUser;
import com.example.jpa.security.UserService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class FirstTimeInitializer implements CommandLineRunner {

    private final Log logger = LogFactory.getLog(FirstTimeInitializer.class);

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) throws Exception {

       if (userService.findAll().isEmpty()) {
            logger.info("No Users accounts found. Creating some users");

            AppUser user = new AppUser("saber", "saber", "saber");
          userService.save(user);
        }else {   logger.info("there are a user");}
    }
}
