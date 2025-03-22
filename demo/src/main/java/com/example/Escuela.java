package com.example;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    // Atributos: lista de estudiantes (List).

    private List<Estudiante> estudiantes;

    // Métodos:
    // Constructor para inicializar la lista.

    public Escuela() {
        this.estudiantes = new ArrayList<>();
    }

    //Método para agregar un estudiante.

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
        System.out.println("Estudiante " + estudiante.getNombre() + " inscrito a la escuela");
    }

    //Método para mostrar la lista de estudiantes.

    public void mostrarLaListaDeEstudiantes(){
        if (estudiantes.isEmpty()) {
            System.out.println("La lista de estudiuantes está vacía");
        } else {
            System.out.println("Estudiantes regustrados");
            for (Estudiante estudiante : estudiantes){
                System.out.println(estudiante);
            }
        }
    }


}
