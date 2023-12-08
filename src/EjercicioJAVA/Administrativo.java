package EjercicioJAVA;

public class Administrativo extends Empleado {
    private String career;

    public Administrativo(String career, String name, String documentNumber) {
        super(name, documentNumber);
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    
    @Override
    public void describeEmployee(){
        System.out.println(name + " " + documentNumber+ " " + career);
    }
}
