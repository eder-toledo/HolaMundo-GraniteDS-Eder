package org.test;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@Local(HelloWorldService.class)
public class HelloWorldServiceBean implements HelloWorldService {

    @PersistenceContext
    protected EntityManager manager;

    @Override
    public String sayHello(String name) {
        manager.persist(new Welcome(name));
        return "Hello " + name + "!";
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Welcome> findWelcomeHistory() {
        Query query = manager.createQuery("from " + Welcome.class.getName());
        return query.getResultList();
    }
}