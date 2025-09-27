package springmvc.dao;

import springmvc.model.EmployeeEntity;
import springmvc.model.UserEntity;

public interface IUserDao {

    UserEntity save(UserEntity user);

    //EmployeeEntity save(EmployeeEntity employee);
}
