package EjercicioJAVA;

public class Main {
    public static void main(String[] args) {
        
        Administrativo administrativo = new Administrativo("Amazonico", "Felipe Pinto", "1092730511");
        Gerente gerente = new Gerente("Three Years","Resee", "1092730511");
        
        describeGeneral(administrativo);
        describeGeneral(gerente);
    }
    
    public static void describeGeneral(Empleado empleado) {
        empleado.describeEmployee();
        System.out.println("");
    }
}
