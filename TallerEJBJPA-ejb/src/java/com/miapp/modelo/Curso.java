package com.miapp.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Curso implements Serializable {

    @Id
    private String codigoCurso;
    private String nombreCurso;
    private int numeroCreditos;
    private int semestre;
    private int numeroEstudiantesAdmitidos;

    @ManyToMany(mappedBy = "cursos")
    private List<Estudiante> estudiantes;

    //getters and setters
    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    public int getNumeroCreditos(){
        return numeroCreditos;
    }

    public void setNombreCurso(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
    
    public int getSemestre(){
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public int getNumeroEstudiantesAdmitidos(){
        return numeroEstudiantesAdmitidos;
    }
    
    public void setNumeroEstudiantesAdmitidos (int numeroEstudiantesAdmitidos){
    this.numeroEstudiantesAdmitidos = numeroEstudiantesAdmitidos;
    }
    
    public List<Estudiante> getEstudiantes(){
    return estudiantes;
    }
    
    public void setEstudiantes(List<Estudiante> estudiantes){
    this.estudiantes = estudiantes;
    }

}
