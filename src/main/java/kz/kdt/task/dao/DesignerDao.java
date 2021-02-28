package kz.kdt.task.dao;

import kz.kdt.task.entity.Designer;
import kz.kdt.task.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DesignerDao {
    public Designer findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Designer.class, id);
    }

    public void save (Designer designer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(designer);
        tx1.commit();
        session.close();
    }

    public void update(Designer designer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(designer);
        tx1.commit();
        session.close();
    }

    public void delete(Designer designer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(designer);
        tx1.commit();
        session.close();
    }

    public List<Designer> findAll() {
        List<Designer> designers = (List<Designer>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from designer").list();
        return designers;
    }
}
