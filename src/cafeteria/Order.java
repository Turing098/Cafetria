package cafeteria;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Order {

    private LinkedList<Items> item = new LinkedList<Items>();
    private LinkedList<Integer> Quantety = new LinkedList<Integer>();
    private Date date;
    private boolean State;

    public Order(LinkedList<Items> items, LinkedList<Integer> Quant, boolean ST) {
        this.item=items;
        this.Quantety=Quant;
        date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        this.State=ST;
        
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LinkedList<Items> getItem() {
        return item;
    }

    public LinkedList<Integer> getQuantety() {
        return Quantety;
    }

    public void setItem(String name, float price) {
        this.item.getLast().setName(name);
        this.item.getLast().setPrice(price);
    }

    public void setQuantety(LinkedList<Integer> Quantety) {
        this.Quantety = Quantety;
    }

    @Override
    public String toString() {
        return toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
