package cafeteria;

public class Items {

    private String Name;
    private float Price;

    public Items(String name, float BP, float price) {
        this.Name = name;
        this.Price = price;
    }

    public String getName() {
        return Name;
    }

    public float getPrice() {
        return Price;
    }

   

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

  
    @Override
    public String toString() {
        return toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
