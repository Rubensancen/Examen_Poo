package org.examen.poo;

public class Main {
    public static void main(String[] args) {
        Curso cursoPOO = new Curso("POO", 6);
        Curso cursoFIS = new Curso("FIS", 5);

        Estudiante[] estudiantesFmat = {
            new Estudiante("Marin"),
            new Estudiante("Flor", cursoFIS),
            new Estudiante("Didier"),
            new Estudiante("Ruben", cursoPOO)
        };

        for  (Estudiante e : estudiantesFmat) {
            System.out.println(e.getInfo());
        }

    }
}