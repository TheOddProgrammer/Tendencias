package Collections_Terminado;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona("Juan",24);
        Persona person1 = new Persona("Andres",34);
        Persona person2 = new Persona("Felipe",44);
        
        LinkedList<Persona> array = new LinkedList<>();
        
        array.add(person);
        array.add(person1);
        array.add(person2);
        
        for (Persona persona : array) {
            System.out.println(persona.getName());
        }
    }
}
