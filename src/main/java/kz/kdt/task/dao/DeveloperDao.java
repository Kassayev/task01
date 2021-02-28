package kz.kdt.task.dao;

import kz.kdt.task.entity.Developer;
import kz.kdt.task.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DeveloperDao {
    public Developer findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Developer.class, id);
    }

    public void save (Developer developer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(developer);
        tx1.commit();
        session.close();
    }

    public void update(Developer developer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(developer);
        tx1.commit();
        session.close();
    }

    public void delete(Developer developer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(developer);
        tx1.commit();
        session.close();
    }

    public List<Developer> findAll() {
        List<Developer> developers = (List<Developer>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from developer").list();
        return developers;
    }
}
