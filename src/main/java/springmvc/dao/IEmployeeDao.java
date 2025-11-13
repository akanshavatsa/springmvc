package springmvc.dao;

import org.springframework.transaction.annotation.Transactional;
import springmvc.model.EmployeeEntity;
import springmvc.vo.Employee;

import java.util.List;

public interface IEmployeeDao {

EmployeeEntity save(EmployeeEntity employee);

    EmployeeEntity savaAndUpdate(EmployeeEntity employeeEntity);
    EmployeeEntity delete(long id);
    List<EmployeeEntity> getAllEmployees();
    EmployeeEntity getEmployeeById(long id);
}
