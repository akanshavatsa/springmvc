package springmvc.service;

import springmvc.model.UserEntity;
import springmvc.vo.User;

public interface IUserService {

    UserEntity saveUser(User user);
}
