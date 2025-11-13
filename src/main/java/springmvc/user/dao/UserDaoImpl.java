package springmvc.user.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import springmvc.user.model.User;


@Repository("userDaoImpl")
public class UserDaoImpl extends GenericDaoAbstarct<User, Long> implements IUsersDao{

    @PersistenceContext
    private EntityManager em;

    public UserDaoImpl() {
        super(User.class);
    }


    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return super.findById(id);
    }

    @Override
    public User getUserByUserName(String userName) {

        String query= " From User u where u.userName =: userName";
        TypedQuery<User> namedQuery = em.createQuery(query,User.class);
        namedQuery.setParameter("userName",userName);
        try{
            return namedQuery.getSingleResult();
        }catch (NoResultException ex){
            System.out.println("no user exist with name: "+userName);
        }
      return null;
        
    }


}
