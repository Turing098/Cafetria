package cafeteria;

public class User {
    private String name;
    private String password;
    private int type;
    
    
    static final int Casher = 1;
    static final int Maneger = 2;
    static final int Owner = 3;

    public User() {
    }
    
    public User(String name, String password, int type) {
        this.name = name;
        this.password = password;
        this.type = type;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getType() {
        return type;
    }
    
    
    
}
