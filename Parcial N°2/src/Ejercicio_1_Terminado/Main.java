package Ejercicio_1_Terminado;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        
        map.put(23,"Juan");
        map.put(15,"Julian");
    }
    
    public static void receiveData(HashMap<Integer,String> list) {
        for (int key : list.keySet()) {
            if (key > 18) {
                System.out.println(list.get(key));
            }
        }
        
        
        // Otra Forma
        list.keySet().stream().filter((key) -> (key > 18)).forEachOrdered((key) -> {
            System.out.println(list.get(key));
        });
    }
}
