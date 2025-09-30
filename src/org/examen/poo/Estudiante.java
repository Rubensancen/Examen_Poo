package org.examen.poo;

public class Curso {
    private String nombreCurso;
    private int creditos;

    public Estudiante (String nombreCurso,int creditos) {
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
    }

  public Estudiante(String nombre) {
        this.nombre = nombre;
        this.curso = null;
  }
  public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;}

        public curso getCurso() {
        return curso;
        }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

     public String getInfo() {
        if (curso == null) {
            return "Estudiante: " + nombre + ", Curso: no asignado";
        } else {
            return "Estudiante: " + nombre + ", Curso: " + curso.getNombreCurso() + ", Créditos: " + curso.getCreditos();
        }
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso=" + (curso != null ? curso.getNombreCurso() : "no asignado") +
                '}';
    }
}



