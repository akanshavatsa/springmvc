package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springmvc.dao.IEmployeeDao;
import springmvc.model.EmployeeEntity;
import springmvc.utils.EmployeeUtility;
import springmvc.vo.Employee;

import java.util.List;

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
        return employeeDaoService.savaAndUpdate(EmployeeUtility.getEmployeeEntity(employee));
    }

    @Override
    public EmployeeEntity delete(long id) {
        return employeeDaoService.delete(id);
    }

    @Override
    public EmployeeEntity getEmployeeById(long id) {
        return employeeDaoService.getEmployeeById(id);
    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeDaoService.getAllEmployees();
    }
}
