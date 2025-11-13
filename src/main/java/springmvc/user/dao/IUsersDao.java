package springmvc.user.dao;


import springmvc.user.model.User;

public interface IUsersDao  {

    User saveUser(User user);

    User getUserById(Long id);

    User getUserByUserName(String userName);

}
