package Ejercicio_6_Terminado;

public class Profesor extends Persona{
    private String salario;

    public Profesor(String salario, String nombre, int edad, String nacionalidad) {
        super(nombre, edad, nacionalidad);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
