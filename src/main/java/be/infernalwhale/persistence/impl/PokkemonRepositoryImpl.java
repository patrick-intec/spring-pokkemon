package be.infernalwhale.persistence.impl;

import be.infernalwhale.model.Pokkemon;
import be.infernalwhale.persistence.PokkemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Scope("prototype")
public class PokkemonRepositoryImpl implements PokkemonRepository {
    private final EntityManagerFactory entityManagerFactory;

    @Autowired
    public PokkemonRepositoryImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }


    @Override
    public Pokkemon savePokkemon(Pokkemon pokkemon) {
        EntityManager em = entityManagerFactory.createEntityManager();

        if (pokkemon.getId() == null) {
            em.persist(pokkemon);
        } else {
            pokkemon = em.merge(pokkemon);
        }

        em.getTransaction().begin();
        em.getTransaction().commit();

        return pokkemon;
    }

    @Override
    public List<Pokkemon> getAllPokkemon() {
        EntityManager em = entityManagerFactory.createEntityManager();
        String jpqlQuery = "SELECT p FROM Pokkemon p";

        TypedQuery<Pokkemon> typedQuery = em.createQuery(jpqlQuery, Pokkemon.class);

        return typedQuery.getResultList();
    }
}









