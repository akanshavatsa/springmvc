package springmvc.utils;

import springmvc.model.UserEntity;
import springmvc.vo.User;

public class UserUtility {

    public static  UserEntity getUserEntity(User user){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setUserName(user.getUserName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        return userEntity;
    }
}
