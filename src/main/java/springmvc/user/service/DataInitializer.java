package springmvc.user.service;//package com.noice.npass.user.service;//package com.aman.rajak.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import springmvc.user.dao.IUsersDao;
import springmvc.user.model.User;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private IUsersDao userRepository;

    @Autowired
    private final BCryptPasswordEncoder passwordEncoder;

    public DataInitializer(IUsersDao userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

//    @Override
//    public void run(String... args) {
//
//    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        User admin = new User();
        admin.setUsername("admin1");
        //admin.setPassword(passwordEncoder.encode("password"));
        admin.setRole("ROLE_ADMIN");
        userRepository.saveUser(admin);
        System.out.println("✅ Default admin user created: username=admin, password=password123");

    }
}

