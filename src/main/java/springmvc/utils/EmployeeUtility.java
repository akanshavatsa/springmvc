package springmvc.utils;

import springmvc.model.EmployeeEntity;
import springmvc.vo.Employee;

public class EmployeeUtility {

    public  static  EmployeeEntity getEmployeeEntity(Employee employee)
    {
        EmployeeEntity employeeEntity= new EmployeeEntity();
        employeeEntity.setId(employee.getId());
        employeeEntity.setEmail(employee.getEmail());
        employeeEntity.setUserName(employee.getUserName());
        employeeEntity.setManagerName(employee.getManagerName());
        employeeEntity.setProjectName(employee.getProjectName());
        return  employeeEntity;
    }

    public  static  Employee getEmployee(EmployeeEntity employeeEntity)
    {
        Employee employee= new Employee();
        employee.setId(employeeEntity.getId());
        employee.setEmail(employeeEntity.getEmail());
        employee.setManagerName(employeeEntity.getManagerName());
        employee.setUserName(employeeEntity.getUserName());
        employee.setProjectName(employeeEntity.getProjectName());
        return employee;
    }
}
