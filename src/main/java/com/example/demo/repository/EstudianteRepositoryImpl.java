package com.example.demo.repository;

import com.example.demo.repository.model.Estudiante;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(Estudiante estudiante) {
        this.entityManager.persist(estudiante);
    }

    @Override
    public List<Estudiante> readAll() {
        TypedQuery<Estudiante>estudianteTypedQuery=this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);

        return estudianteTypedQuery.getResultList();
    }
}
