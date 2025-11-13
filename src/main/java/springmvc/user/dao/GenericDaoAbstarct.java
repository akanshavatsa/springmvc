package springmvc.user.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public abstract class GenericDaoAbstarct<T, ID> implements IGenericDao<T, ID> {

    @PersistenceContext
    private EntityManager em;

    private final Class<T> entityClass;

    public GenericDaoAbstarct(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public T save(T entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public T saveOrUpdate(T entity) {
        return em.merge(entity);  // merge acts like save or update
    }

    @Override
    public void delete(T entity) {
        em.remove(em.contains(entity) ? entity : em.merge(entity));
    }

    @Override
    public T findById(ID id) {
        return em.find(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        return em.createQuery("from " + entityClass.getName(), entityClass).getResultList();
    }
}

