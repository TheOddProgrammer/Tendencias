package EjercicioJAVA;

public class Gerente extends Empleado{
    
    private String experience;

    public Gerente(String experience, String name, String documentNumber) {
        super(name, documentNumber);
        this.experience = experience;
    }    

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    
    @Override
    public void describeEmployee(){
        System.out.println(name + " " + documentNumber+ " " + experience);
    }
}
