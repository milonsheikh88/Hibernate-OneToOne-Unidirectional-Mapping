package com.milon.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.milon.hibernate.entity.Course;
import com.milon.hibernate.util.HibernateUtil;

public class CourseDao {

	public void saveCourse(Course course) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			session.persist(course);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}
}
