package DaoVo;
//Daos and Dto or Vo
//DTO Data Transfer Object (Almacena los Datos Requeridos)
//VO se Almacenan los Datos
public class Main {

    public static void main(String[] args) {
        PersonaDao persona = new PersonaDao();
        
        persona.readData();
    }
    
}
