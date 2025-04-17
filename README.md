# Proyecto Java EE - Persistencia con EJB y JPA

## Descripción
Este proyecto implementa la capa de persistencia para una aplicación Java EE utilizando **Enterprise JavaBeans (EJB)** y **Java Persistence API (JPA)**. Se desarrolló en **NetBeans 8.0.2** con el servidor **GlassFish 4.1** y el proveedor de persistencia **EclipseLink**.

El sistema gestiona información de estudiantes y cursos, permitiendo el registro y administración de relaciones **muchos a muchos** entre ellos. Además, se amplió la funcionalidad para gestionar proyectos de espacio público, permitiendo operaciones CRUD sobre distintas entidades.

## Funcionalidades Implementadas
- **Gestión de Estudiantes y Cursos**:
  - Creación, modificación y eliminación de cursos.
  - Asignación de estudiantes a múltiples cursos y viceversa.
  - Persistencia de datos mediante **JPA** con relaciones **muchos a muchos**.
  
- **Manejo de Proyectos de Espacio Público**:
  - Registro y administración de proyectos con atributos como **nombre, descripción, localidad, presupuesto y número de habitantes**.
  - Implementación de operaciones CRUD para gestionar proyectos.
  
- **Estructura del Proyecto**:
  - **Proyecto WAR**: Contiene las vistas y controladores web.
  - **Proyecto EJB**: Implementa la lógica de negocio y la persistencia con JPA.
  - **Proyecto Integrador WAR-EJB**: Conecta la capa de presentación con la lógica de negocio.

## Tecnologías Utilizadas
- **Java EE**
- **EJB (Enterprise JavaBeans)**
- **JPA (Java Persistence API) con EclipseLink**
- **GlassFish 4.1**
- **NetBeans 8.0.2**
- **JSP para la interfaz de usuario**
- **Base de datos con llaves foráneas**

## Archivos Destacados
- `studentInfo.jsp`: Página para la gestión de estudiantes y cursos.
- **Script SQL** para la creación de la base de datos.

## Repositorio y Entrega
El código fuente del proyecto está disponible en **GitHub**. 

## Material de Apoyo
Para entender mejor el uso de **JPA y EJB**, se recomienda revisar los siguientes tutoriales:
- [Tutorial 1: EJB + JPA](https://www.youtube.com/watch?v=_zW27Y2boCo)
- [Tutorial 2: EJB + JPA](https://www.youtube.com/watch?v=XGUiwXSY6IA)
- [Tutorial 3: EJB + JPA](https://www.youtube.com/watch?v=RX23s1RN2SI)

- 

