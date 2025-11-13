package springmvc.service;

import springmvc.model.EmployeeEntity;
import springmvc.vo.Employee;

import java.util.List;
import java.util.Locale;

public interface IEmployeeService {

      EmployeeEntity save(Employee employee);
      EmployeeEntity update(Employee employee);
      EmployeeEntity delete(long id);
      EmployeeEntity getEmployeeById(long id);

      List<EmployeeEntity> getAllEmployees();
}
