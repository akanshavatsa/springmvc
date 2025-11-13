package springmvc.user.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import springmvc.user.dao.IUsersDao;
import springmvc.user.model.User;

import java.util.Collections;

@Service
public class  CustomUserDetailService implements UserDetailsService {


    @Autowired
    IUsersDao usersDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersDao.getUserByUserName(username);

        if(user==null){
            throw  new UsernameNotFoundException("User not found.");
        }

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(user.getRole()))
        );
    }
}
