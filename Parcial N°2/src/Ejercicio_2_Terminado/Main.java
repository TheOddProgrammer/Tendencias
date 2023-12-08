package Ejercicio_2_Terminado;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        ArrayList<Persona> list  = new ArrayList<>();
        
        list.add(new Persona("1092730511","Juan",3));
        
        op.choiceData(list);
    }
    
}
