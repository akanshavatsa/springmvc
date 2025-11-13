package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springmvc.dao.IUserDao;
import springmvc.model.UserEntity;
import springmvc.utils.UserUtility;
import springmvc.vo.User;

@Component
public class UserServiceImpls implements IUserService {

    //service always with DAO

    @Autowired
    IUserDao userDaoService;

    @Override
    public UserEntity saveUser(User user) {
        return userDaoService.save(UserUtility.getUserEntity(user));
    }
}
