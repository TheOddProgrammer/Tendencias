package Ejercicio_3_Terminado;

public class Trabajador {
    private String name;
    private double pay;
    private String id;
    private static int number = 0;

    public Trabajador(String name, double pay, String id) {
        this.name = name;
        this.pay = pay;
        this.id = id;
        number++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
