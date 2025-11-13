package springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.EmployeeEntity;
import springmvc.vo.Employee;

import java.util.List;

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

    public EmployeeEntity savaAndUpdate(EmployeeEntity employee) {
        Session session= sessionFactory.getCurrentSession();


            if (session.find(EmployeeEntity.class,employee.getId()) !=null)
            {
                System.out.println("merging");
                session.merge(employee);

            }
            else {
                System.out.println("add new user");
                session.persist(employee);

            }


        return employee;

    }

    @Override
    @Transactional
    public  EmployeeEntity delete(long id )
    {
        Session session= sessionFactory.getCurrentSession();
        EmployeeEntity employeeEntity;
        employeeEntity=session.find(EmployeeEntity.class,id);
        if (employeeEntity !=null) {

             session.remove(employeeEntity);
             return employeeEntity;
        }
        else {
            return null;
        }

    }

    @Override
    @Transactional
    public List<EmployeeEntity> getAllEmployees() {
        Session session= sessionFactory.getCurrentSession();
        return session.createQuery("from EmployeeEntity", EmployeeEntity.class).getResultList();

    }

    @Override
    @Transactional
    public EmployeeEntity getEmployeeById(long id) {
        Session session= sessionFactory.getCurrentSession();
        return session.find(EmployeeEntity.class,id);
    }
}
