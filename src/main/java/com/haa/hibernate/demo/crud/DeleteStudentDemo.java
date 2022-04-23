package com.haa.hibernate.demo.crud;

import com.haa.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {

    public static void main(String[] args) {

        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {
            int studentId = 5;

            System.out.println("Delete Student Object...");
            session.beginTransaction();

            System.out.println("Given Student Generated ID : " + studentId);
            Student myStudent = session.get(Student.class, studentId);

            session.delete(myStudent);

            System.out.println("Get Delete Student : " + myStudent);
            session.getTransaction().commit();

            System.out.println("Delete a Student using HQL...");
            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete Student where id = '6'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!!!");

        } catch (Exception e) {
            factory.close();
        }

    }

}
