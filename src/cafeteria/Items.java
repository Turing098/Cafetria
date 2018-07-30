package cafeteria;

public class Items {
     
    private String Name;
    private float BoughtPrice;
    private float Price;
    private float Quanety;
     
    public Items(String name, float BP, float price, float Quant) {
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

    public float getQuanety() {
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

    public void setQuanety(float Quanety) {
        this.Quanety = Quanety;
    }

    @Override
    public String toString() {
        return toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
