package com.miapp.negocio;

import com.miapp.modelo.ProyectoPublico;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ProyectoPublicoFacade {

    @PersistenceContext(unitName = "TallerEJBJPA-ejbPU")
    private EntityManager em;

    public void crearProyecto(ProyectoPublico proyecto) {
        em.persist(proyecto);
    }

    public ProyectoPublico buscarProyecto(Long id) {
        return em.find(ProyectoPublico.class, id);
    }

    public List<ProyectoPublico> listarProyectos() {
        return em.createQuery("SELECT p FROM ProyectoPublico p", ProyectoPublico.class).getResultList();
    }

    public void actualizarProyecto(ProyectoPublico proyecto) {
        em.merge(proyecto);
    }

    public void eliminarProyecto(Long id) {
        ProyectoPublico proyecto = buscarProyecto(id);
        if (proyecto != null) {
            em.remove(proyecto);
        }
    }

}
