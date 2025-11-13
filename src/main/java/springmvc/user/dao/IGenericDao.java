package springmvc.user.dao;

import java.util.List;

public interface IGenericDao<T, ID> {

    T save(T entity);                 // Save new entity
    T saveOrUpdate(T entity);         // Save or update
    void delete(T entity);            // Delete entity
    T findById(ID id);                // Get by ID
    List<T> findAll();                // Get all
}
