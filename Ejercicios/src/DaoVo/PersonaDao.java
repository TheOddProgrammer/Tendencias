package DaoVo;

import java.util.Scanner;

public class PersonaDao {
    public final int MAYORIA_EDAD = 18;
    
    public void readData() {
        Scanner sc = new Scanner(System.in);
        
        String id = sc.next();
        String names = sc.next();
        String lastnames = sc.next();
        int age = Integer.parseInt(sc.next());
        
        PersonaDto persona = new PersonaDto(id,names,lastnames,age);
        
        esMayor(persona);
    }
    
    public void esMayor(PersonaDto persona) {
        
        int edad = persona.getAge();
        
        if (edad>MAYORIA_EDAD) {
            System.out.println("Es Mayor de Edad");
        } else {
            System.out.println("Es Menor de Edad");
        }
    }
}
