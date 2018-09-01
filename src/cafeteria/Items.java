package cafeteria;

public class Items {
     
    private String Name;
    private float BoughtPrice;
    private float Price;
    private int Quanety;
     
    public Items(String name, float BP, float price, int Quant) {
        this.Name = name;
        this.BoughtPrice = BP;
        this.Price = price;
        this.Quanety = Quant; 
    }

    public float getBoughtPrice() {
        return BoughtPrice;
    }

    public String getName() {
        return Name;
    }

    public float getPrice() {
        return Price;
    }

    public int getQuanety() {
        return Quanety;
    }

    public void setBoughtPrice(float BoughtPrice) {
        this.BoughtPrice = BoughtPrice;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public void setQuanety(int Quanety) {
        this.Quanety = Quanety;
    }

    @Override
    public String toString() {
        return toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
