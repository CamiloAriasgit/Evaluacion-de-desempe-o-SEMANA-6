package com.example;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();

        //crear un estudiante

        Estudiante estudiante1 = new Estudiante("Pepe Martinez", 12);
        Estudiante estudiante2 = new Estudiante("Maria Restrepo", 18);
        Estudiante estudiante3 = new Estudiante("Gorge Perez", 20);

        // Registrar libros y usuarios en la biblioteca
        escuela.agregarEstudiante(estudiante1);
        escuela.agregarEstudiante(estudiante2);
        escuela.agregarEstudiante(estudiante3);
        
        //Mostrar lista de estudiantes

        escuela.mostrarLaListaDeEstudiantes(); 
    }
}