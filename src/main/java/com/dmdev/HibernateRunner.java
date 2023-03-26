package com.dmdev;

import org.hibernate.cfg.Configuration;

public class HibernateRunner {
    public static void main(String[] args) {
        var configuration = new Configuration();
        configuration.configure();
        try (var sessionFactory = configuration.buildSessionFactory();
             var session = sessionFactory.openSession()) {
            System.out.println("Hello world!");
        }
    }
}