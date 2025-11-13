package springmvc.user.service;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import springmvc.user.dao.IUsersDao;
import springmvc.user.model.User;

@Named("userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Inject
    @Named("userDaoImpl")
    IUsersDao usersDao;

    @Override
    public boolean createUser(User user) {
        usersDao.saveUser(user);
        return false;
    }
}
