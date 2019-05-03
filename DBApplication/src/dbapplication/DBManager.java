/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbapplication;

import EntityClasses.Admin;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Kannan
 */
public class DBManager {

    public static class DateToTimeConverter extends Converter {

        @Override
        public Object convertForward(Object value) {
            Date time = (Date) value;
            String Time = String.valueOf(time.getHours()) + ":" + String.valueOf(time.getMinutes()) + ":" + String.valueOf(time.getSeconds());
            return Time;
        }

        @Override
        public Object convertReverse(Object value) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static void main(String[] args) {
//        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("DBApplicationPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        Admin admin = (Admin) em.createNamedQuery("Admin.findByAdminID").setParameter("adminID", 123).getSingleResult();
//        System.out.println(admin.getTitle());
//        em.getTransaction().commit();
        DateToTimeConverter da = new DateToTimeConverter();
        Date date = new Date();
        String time = (String) da.convertForward(date);
        System.out.println(time);

    }

    public static void persist(Object object) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("DBApplicationPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
