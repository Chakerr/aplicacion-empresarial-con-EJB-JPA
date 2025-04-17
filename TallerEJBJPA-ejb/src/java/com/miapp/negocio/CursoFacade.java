package com.miapp.negocio;

import com.miapp.modelo.Curso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CursoFacade {

    @PersistenceContext(unitName = "TallerEJBJPA-ejbPU")
    private EntityManager em;

    public void crearCurso(Curso curso) {
        em.persist(curso);
    }

    public Curso buscarCurso(String codigoCurso) {
        return em.find(Curso.class, codigoCurso);
    }

    public List<Curso> listarCursos() {
        return em.createQuery("SELECT c FROM Curso c", Curso.class).getResultList();
    }

    public void actualizarCurso(Curso curso) {
        em.merge(curso);
    }

    public void eliminarCurso(String codigoCurso) {
        Curso curso = buscarCurso(codigoCurso);
        if (curso != null) {
            em.remove(curso);
        }
    }
}
