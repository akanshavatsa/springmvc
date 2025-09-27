package springmvc.dao;

import springmvc.model.EmployeeEntity;
import springmvc.vo.Employee;

public interface IEmployeeDao {

EmployeeEntity save(EmployeeEntity employee);

    EmployeeEntity update(EmployeeEntity employeeEntity);
}
