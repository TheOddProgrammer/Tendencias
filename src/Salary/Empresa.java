package Salary;

public class Empresa {
    protected final String[] CARGOS = {"Jefe","Director","Plebeyo"};
    protected int trabajadores;
    protected final int PAY_DAY = 15000;

    public Empresa(int trabajadores) {
        this.trabajadores = trabajadores;
    }
}
