package by_step_aqa_q1822_hibernate_example.service;

import by_step_aqa_q1822_hibernate_example.dao.Wards;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class WardsService {

    public List<Wards> getAllWards() {
        Transaction transaction = null;
        List<Wards> resultSet = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Wards> cq = cb.createQuery(Wards.class);
            Root<Wards> rootEntry = cq.from(Wards.class);
            CriteriaQuery<Wards> all = cq.select(rootEntry);

            TypedQuery<Wards> allQuery = session.createQuery(all);

            resultSet = allQuery.getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return resultSet;
    }

    public void saveWards(Wards wards) {

        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(wards);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
