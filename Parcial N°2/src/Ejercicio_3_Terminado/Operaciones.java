package Ejercicio_3_Terminado;

import java.util.ArrayList;

public class Operaciones {
    public double bonoTransporte = 50000;
    public double minimo = 1000000;
    public double total = 0;
    
    public void agregar(ArrayList<Trabajador> list){
        list.forEach(x -> {
            if (x.getPay() < minimo) {
                x.setPay(x.getPay()+bonoTransporte);
            }
        });
        
        System.out.println("El Total a Pagar es: " + this.total);
    }
    
    public void recorrer(ArrayList<Trabajador> list) {
        list.forEach(x -> {
            System.out.println("Trabajador: "+x.getName() +
                    "\nSueldo: "+x.getPay() +
                    "\nNumero: "+x.getNumber());
            total+=x.getPay();
        });
        System.out.println("\n\n");
    }
}
