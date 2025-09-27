package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springmvc.dao.IEmployeeDao;
import springmvc.model.EmployeeEntity;
import springmvc.utils.EmployeeUtility;
import springmvc.vo.Employee;

@Component
public class EmployeeServiceImpl  implements  IEmployeeService{

    @Autowired
    IEmployeeDao employeeDaoService;


    @Override
    public EmployeeEntity save(Employee employee) {
        return employeeDaoService.save(EmployeeUtility.getEmployeeEntity(employee));

    }

    @Override
    public EmployeeEntity update(Employee employee) {
        return employeeDaoService.update(EmployeeUtility.getEmployeeEntity(employee));
    }
}
