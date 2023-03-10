package by_step_aqa_q1822_hibernate_example.service;

import by_step_aqa_q1822_hibernate_example.dao.Doctors;
import by_step_aqa_q1822_hibernate_example.dao.Wards;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class DoctorsService {

    public List<Doctors> getAllDoctors() {
        Transaction transaction = null;
        List<Doctors> resultSet = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Doctors> cq = cb.createQuery(Doctors.class);
            Root<Doctors> rootEntry = cq.from(Doctors.class);
            CriteriaQuery<Doctors> all = cq.select(rootEntry);

            TypedQuery<Doctors> allQuery = session.createQuery(all);

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

    public void saveDoctors(Doctors doctors) {

        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(doctors);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
