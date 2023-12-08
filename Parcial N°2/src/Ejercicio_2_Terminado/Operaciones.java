package Ejercicio_2_Terminado;

import java.util.ArrayList;

public class Operaciones {
    public void choiceData(ArrayList<Persona> list){
        list.forEach(x ->{
            if (x.getLevel()> 2) {
                System.out.println("La Persona "+x.getName()+" es nivel "+x.getLevel());
            }
        });
    }
}
