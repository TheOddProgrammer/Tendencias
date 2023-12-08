package Ejercicio_3_Terminado;

//Parametros y Argumentos

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        ArrayList<Trabajador> list = new ArrayList<>();
        
        list.add(new Trabajador("Juan", 500000, "1092730511"));
        list.add(new Trabajador("Camilo", 500000, "1092730511"));
        
        
        op.recorrer(list);
        op.agregar(list);
        op.recorrer(list);
    }
}
