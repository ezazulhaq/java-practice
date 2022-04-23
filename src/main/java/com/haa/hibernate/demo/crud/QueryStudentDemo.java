package com.haa.hibernate.demo.crud;

import java.util.List;

import com.haa.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("com/haa/hibernate/demo/hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {
            System.out.println("Query Student Object...");
            session.beginTransaction();

            System.out.println("Query all Students...");
            List<Student> listStudent = session.createQuery("from Student").getResultList();
            displayStudents(listStudent);

            System.out.println("Query all Students whose Last Name is Duck...");
            listStudent = session.createQuery("from Student where lastName = 'Duck'").getResultList();
            displayStudents(listStudent);

            System.out.println("Query all Students whose First name is Abdul or Last Name is Haq...");
            listStudent = session.createQuery("from Student s where s.firstName = 'Abdul' or s.lastName = 'Haq'")
                    .getResultList();
            displayStudents(listStudent);

            System.out.println("Query all Students whose Email ID starts with abdul...");
            listStudent = session.createQuery("from Student s where s.email like 'abdul%'").getResultList();
            displayStudents(listStudent);

            session.getTransaction().commit();
            System.out.println("Done!!!");

        } catch (Exception e) {
            factory.close();
        }

    }

    private static void displayStudents(List<Student> listStudent) {
        for (Student theStudent : listStudent) {
            System.out.println(theStudent);
        }
        System.out.println();
    }

}
