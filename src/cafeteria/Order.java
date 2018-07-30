package cafeteria;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {

    private Items item;
    private int Quantety;
    private Date date;

    public Order(String name, float Quant) {
        item.setName(name);
        item.setQuanety(Quant);
        date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Items getItem() {
        return item;
    }

    public int getQuantety() {
        return Quantety;
    }

    public void setItem(String name, float BP, float price, float Quant) {
        this.item.setName(name);
        this.item.setPrice(price);
        this.item.setQuanety(Quant);
    }

    public void setQuantety(int Quantety) {
        this.Quantety = Quantety;
    }

    @Override
    public String toString() {
        return toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
