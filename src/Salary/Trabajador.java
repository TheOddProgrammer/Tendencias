package Salary;

public class Trabajador{
    private final double PAY_DAY = 15000;
    private final String name;
    private final String idE;
    protected String cargo;
    protected int diasLaburados;

    public Trabajador(String name, String idE, String cargo, int diasLaburados) {
        this.name = name;
        this.idE = idE;
        this.cargo = cargo;
        this.diasLaburados = diasLaburados;
    }
    
    public double CalcularPaga() {
        return this.diasLaburados*this.PAY_DAY;
    }

    @Override
    public String toString() {
        return "El Trabajador Identificado con Id "+idE+" con nombre "+name+" debe recibir un pago de "+CalcularPaga()+" por sus "+diasLaburados+" dias Laburados en la Empresa.";
    }

    
    
}
