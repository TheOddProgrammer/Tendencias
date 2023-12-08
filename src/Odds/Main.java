package Odds;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Numeros> array = new ArrayList<Numeros>();
    static Scanner sc = new Scanner(System.in);
    static Scanner ss = new Scanner(System.in);
    
    public static void main(String[] args) {
        LlenarArray();
        mostrarArray();
    }
    
    public static void LlenarArray() {
        String answer;
        do {
            System.out.print("Ingrese Numero: ");
            int num = sc.nextInt();
            Numeros numeros = new Numeros(num);
            array.add(numeros);
            System.out.print("¿Desea Ingresar Otro Numero? Y/N \nOpcion: ");
            answer = ss.nextLine().toUpperCase();
            System.out.println("");
        }while(answer.equals("Y"));
    }
    
    public static void mostrarArray() {
        array.forEach(System.out::println);
    }
}
