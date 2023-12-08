package Ejercicio_2_Terminado;

public class Persona {
    private String id;
    private String name;
    private int level;
    private String phone;
    private String address;

    public Persona(String id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public Persona(String id, String name, int level, String phone, String address) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.phone = phone;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
