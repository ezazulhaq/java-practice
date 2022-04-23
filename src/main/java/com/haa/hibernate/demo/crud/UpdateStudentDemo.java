package com.haa.hibernate.demo.crud;

import com.haa.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

    public static void main(String[] args) {

        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("com/haa/hibernate/demo/hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {
            int studentId = 1;

            System.out.println("Update Student Object...");
            session.beginTransaction();

            System.out.println("Given Student Generated ID : " + studentId);
            Student myStudent = session.get(Student.class, studentId);

            myStudent.setLastName("Ul-Haq");

            System.out.println("Get Updated Student : " + myStudent);
            session.getTransaction().commit();

            System.out.println("Update Email ID of Student using HQL...");
            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Student set email = 'daffu@gmail.com' where firstName = 'Daffu'")
                    .executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!!!");

        } catch (Exception e) {
            factory.close();
        }

    }

}
