package com.haa.hibernate.demo.crud;

import com.haa.hibernate.demo.entity.Student;
import com.haa.hibernate.demo.util.DateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {

        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("com/haa/hibernate/demo/hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {
            System.out.println("Create Student Object...");
            Student theStudent = new Student("Ezazul", "Haq", "ezazulhaq@gamil.com", DateUtils.parseDate("23/04/1994"));

            session.beginTransaction();

            System.out.println("Saving the Student...");
            session.save(theStudent);

            session.getTransaction().commit();

            System.out.println("Done!!!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }

}
