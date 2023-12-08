package Salary;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static ArrayList<Trabajador> workers = new ArrayList<Trabajador>();
    static Scanner sc = new Scanner(System.in);
    static Scanner ss = new Scanner(System.in);
    
    public static void main(String[] args) {
        LlenarTrabajadores();
        workers.forEach(System.out::println);
    }
    
    public static void LlenarTrabajadores() {
        Trabajador trabajador = new Trabajador("Camilo", "345675", "Jefe", 8);
        workers.add(trabajador);
    }
    
}
