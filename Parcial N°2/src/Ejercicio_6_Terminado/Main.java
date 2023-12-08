package Ejercicio_6_Terminado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> list = new ArrayList<>();
        
        list.add(new Estudiante("Sociales", "192104", "Fuelipe", 12, "Venezolano"));
        list.add(new Profesor("10000000", "Juan", 45, "Colombiano"));
        
        print(list);
    }
    
    public static void print(ArrayList<Persona> list) {
        for (Persona persona : list) {
            System.out.println(persona.getNombre());
        }
    }
}
