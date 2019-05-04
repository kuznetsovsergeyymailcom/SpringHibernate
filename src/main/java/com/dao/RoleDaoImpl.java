package com.dao;

import com.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role getRoleByTitle(String title) {
        Role role = entityManager.createQuery("from User u where u.name=:title", Role.class).getSingleResult();

        return role;
    }

    @Override
    public Role getRoleById(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public void saveRole(Role role){
        entityManager.persist(role);
    }
}
