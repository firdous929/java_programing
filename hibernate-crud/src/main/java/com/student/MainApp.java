package com.student;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        // Get Session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // 1. CREATE
            Student s = new Student();
            s.setId(1);
            s.setName("Firdous");
            s.setCourse("Java");
            session.save(s);
            System.out.println("Student saved successfully!");

            // 2. READ
            Student st = session.get(Student.class, 1);
            System.out.println("Retrieved Student Name: " + st.getName());

            // 3. UPDATE
            st.setCourse("Hibernate");
            session.update(st);
            System.out.println("Student updated successfully!");

            // Commit transaction
            tx.commit();
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}