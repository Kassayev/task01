package kz.kdt.task.dao;

import kz.kdt.task.entity.Manager;
import kz.kdt.task.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ManagerDao {
    public Manager findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Manager.class, id);
    }

    public void save (Manager manager) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(manager);
        tx1.commit();
        session.close();
    }

    public void update(Manager manager) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(manager);
        tx1.commit();
        session.close();
    }

    public void delete(Manager manager) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(manager);
        tx1.commit();
        session.close();
    }

    public List<Manager> findAll() {
        List<Manager> managers = (List<Manager>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from manager").list();
        return managers;
    }
}
