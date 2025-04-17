package com.miapp.web;

import com.miapp.modelo.ProyectoPublico;
import com.miapp.negocio.ProyectoPublicoFacade;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/proyectos")
public class ProyectoServlet extends HttpServlet {

    @EJB
    private ProyectoPublicoFacade proyectoFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        ProyectoPublico proyecto = new ProyectoPublico();
        proyecto.setNombre("Parque Central");
        proyecto.setDescripcion("Mejoramiento del parque central");
        proyecto.setLocalidad("Localidad 3");
        proyecto.setPresupuesto(50000000);
        proyecto.setNumeroHabitantes(1500);

        proyectoFacade.crearProyecto(proyecto);

        List<ProyectoPublico> lista = proyectoFacade.listarProyectos();
        out.println("<html>>body");
        out.println("<h1>Lista de proyectos publicos</h1>");
        for (ProyectoPublico p : lista) {
            out.print("<p>" + p.getId() + "-" + p.getNombre() + "- $" + p.getPresupuesto() + "</p>");

        }
        out.println("</body></html>");

    }
}
