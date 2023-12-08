package Ejercicio_6_Terminado;

public class Estudiante extends Persona {
    public String materia;
    public String code;

    public Estudiante(String materia, String code, String nombre, int edad, String nacionalidad) {
        super(nombre, edad, nacionalidad);
        this.materia = materia;
        this.code = code;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
