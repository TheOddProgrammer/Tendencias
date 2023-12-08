package EjercicioJAVA;

public abstract class Empleado {
    protected String name;
    protected String documentNumber;

    public Empleado(String name, String documentNumber) {
        this.name = name;
        this.documentNumber = documentNumber;
    }
    
    public abstract void describeEmployee();
}
