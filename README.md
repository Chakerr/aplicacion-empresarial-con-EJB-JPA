# Proyecto Java EE - Persistencia con EJB y JPA

## Descripción
Este proyecto implementa la capa de persistencia para una aplicación Java EE utilizando **Enterprise JavaBeans (EJB)** y **Java Persistence API (JPA)**. Se desarrolló en **NetBeans 8.0.2** con el servidor **GlassFish 4.1** y el proveedor de persistencia **EclipseLink**.

El sistema gestiona información de estudiantes y cursos, permitiendo el registro y administración de relaciones **muchos a muchos** entre ellos. Además, se amplió la funcionalidad para gestionar proyectos de espacio público, permitiendo operaciones CRUD sobre distintas entidades.

## Funcionalidades Implementadas

### 1. Gestión de Estudiantes y Cursos
- Registro de cursos con código, nombre, créditos, semestre, y cupos.
- Asignación de estudiantes a múltiples cursos (relación muchos a muchos).
- Persistencia de datos con anotaciones JPA.
- Lógica de negocio encapsulada en EJB `CursoFacade`.

### 2. Manejo de Proyectos de Espacio Público
- Entidad `ProyectoPublico` con atributos: nombre, descripción, localidad, presupuesto, número de habitantes.
- EJB `ProyectoPublicoFacade` con operaciones: crear, buscar, listar, actualizar, eliminar.
- Prueba funcional mediante `ProyectoServlet`.
  
### 3. Estructura del Proyecto
- **Proyecto EJB:** Contiene entidades JPA y lógica con EJBs.
- **Proyecto WAR:** Contiene controladores web (Servlet).
- **Proyecto EAR:** Integrador entre EJB y WAR.

## Tecnologías Utilizadas
- Java EE 7
- EJB (Enterprise JavaBeans)
- JPA (Java Persistence API) + EclipseLink
- GlassFish Server 4.1
- NetBeans IDE 8.0.2
- JSP (opcional)
- Servlet (`ProyectoServlet`) para pruebas

## Ejecución
1. Abrir el proyecto en NetBeans 8.0.2.
2. Asegurarse de usar JDK 8 y GlassFish Server 4.1.
3. Ejecutar el proyecto raíz (`TallerEJBJPA`) sobre GlassFish.
4. Acceder en navegador a:
   ```
   http://localhost:8080/TallerEJBJPA-war/proyectos
   ```

## Material de Apoyo
Para entender mejor el uso de **JPA y EJB**, se recomienda revisar los siguientes tutoriales:
- [Tutorial 1: EJB + JPA](https://www.youtube.com/watch?v=_zW27Y2boCo)
- [Tutorial 2: EJB + JPA](https://www.youtube.com/watch?v=XGUiwXSY6IA)
- [Tutorial 3: EJB + JPA](https://www.youtube.com/watch?v=RX23s1RN2SI)

- 

