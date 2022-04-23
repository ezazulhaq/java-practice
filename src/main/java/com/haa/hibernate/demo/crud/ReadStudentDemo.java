package com.haa.hibernate.demo.crud;

import com.haa.hibernate.demo.entity.Student;
import com.haa.hibernate.demo.util.DateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

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
            Student theStudent = new Student("Daffu", "Duck", "daffu@gamil.com", DateUtils.parseDate("23/04/1994"));

            session.beginTransaction();

            System.out.println("Saving the Student...");
            System.out.println("Saved Student : " + theStudent);
            session.save(theStudent);

            session.getTransaction().commit();

            System.out.println("Saved Student. Generated Id : " + theStudent.getId() + "\n");

            System.out.println("Read Student Object...");
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Given Student. Generated Id : " + theStudent.getId());
            Student myStudent = session.get(Student.class, theStudent.getId());

            System.out.println("Get Complete Student : " + myStudent);
            session.getTransaction().commit();

            System.out.println("Done!!!");

        } catch (Exception e) {
            factory.close();
        }

    }

}
