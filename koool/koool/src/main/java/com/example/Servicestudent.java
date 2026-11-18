package com.example;

import com.example.kool.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Servicestudent {

    public void save(EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
      Student student = new Student();
      student.setAge(17);
      student.setName("Pavel");
      student.setEmail("appa@gmail.com");
      em.persist(student);
      em.getTransaction().commit();
      em.close();
    }
    public void uus(EntityManagerFactory emf){
        EntityManager em1 = emf.createEntityManager();
        em1.getTransaction().begin();
        Student student1 = em1.find(Student.class, 12342);
        student1.setAge(16);
        em1.getTransaction().commit();
        em1.close();
    }
    public void kustuta(EntityManagerFactory emf){
        EntityManager em2 = emf.createEntityManager();
        em2.getTransaction().begin();
        Student student2=em2.find(Student.class, 1010);
        em2.remove(student2);
        em2.getTransaction().commit();
        em2.close();
    }


}




