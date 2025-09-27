package springmvc.service;

import springmvc.model.EmployeeEntity;
import springmvc.vo.Employee;

public interface IEmployeeService {

      EmployeeEntity save(Employee employee);
      EmployeeEntity update(Employee employee);
}
