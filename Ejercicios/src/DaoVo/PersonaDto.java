package DaoVo;

public class PersonaDto {
    private String id, names, lastnames;
    private int age;

    public PersonaDto(String id, String names, String lastnames, int age) {
        this.id = id;
        this.names = names;
        this.lastnames = lastnames;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
