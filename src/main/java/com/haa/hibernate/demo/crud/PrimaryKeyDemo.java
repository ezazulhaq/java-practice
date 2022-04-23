package com.haa.hibernate.demo.crud;

import com.haa.hibernate.demo.entity.Student;
import com.haa.hibernate.demo.util.DateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

    public static void main(String[] args) {

        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("com/haa/hibernate/demo/hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {
            System.out.println("Create 3 Student Objects...");
            session.beginTransaction();

            Student theStudent1 = new Student("Ezazul", "Haq", "ezazulhaq@gamil.com",
                    DateUtils.parseDate("20/04/1995"));
            Student theStudent2 = new Student("Abdul", "Shaik", "abdul@gamil.com", DateUtils.parseDate("12/03/1992"));
            Student theStudent3 = new Student("Riyaz", "Muhammad", "riyaz@gamil.com",
                    DateUtils.parseDate("02/06/1990"));

            System.out.println("Saving the 3 Students...");
            session.save(theStudent1);
            session.save(theStudent2);
            session.save(theStudent3);

            session.getTransaction().commit();

            System.out.println("Done!!!");

        } catch (Exception e) {
            factory.close();
        }

    }

}
