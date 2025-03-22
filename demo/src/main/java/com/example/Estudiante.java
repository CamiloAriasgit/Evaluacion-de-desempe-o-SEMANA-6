package com.example;

public class Estudiante {

    //Atributos: nombre (String), edad (int).

    private String nombre;
    private int edad;

    //Métodos: constructor, getters, método toString().
    //constructor

    public Estudiante (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre: '" + nombre + '\'' +
                ", Edad: '" + edad + '\'' +
                '}';
    }
    
}
