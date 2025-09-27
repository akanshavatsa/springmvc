package springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.EmployeeEntity;
import springmvc.vo.Employee;

@Component
public class EmployeeDao implements IEmployeeDao{



    SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @Override
    @Transactional
    public EmployeeEntity save(EmployeeEntity employee) {

        Session session= sessionFactory.getCurrentSession();
        session.persist(employee);
        return employee;

    }

    @Override
    @Transactional
    public EmployeeEntity update(EmployeeEntity employee) {
        Session session= sessionFactory.getCurrentSession();
        session.merge(employee);
        return employee;

    }
}
