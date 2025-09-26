package springmvc.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import springmvc.model.UserEntity;

@Component
public class UserDao  implements IUserDao{

    @Override
    public UserEntity save(UserEntity user) {
        return null;
    }
}
