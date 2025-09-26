package springmvc.dao;

import springmvc.model.UserEntity;

public interface IUserDao {

    UserEntity save(UserEntity user);
}
