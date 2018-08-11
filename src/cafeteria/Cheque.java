package cafeteria;

import java.util.Date;
import java.util.LinkedList;

public class Cheque {
    LinkedList<Order> order = new LinkedList<Order>();
    private int TableNumber;
    private Date date;
    // private Casher chasher;
    private double Tottal;
    private double Service;
    private double TottalCross;

    public Cheque(Order o, int TN) {
        this.order.toString();
        this.TableNumber = TN;
        date = new Date();
        Service = 0.12;
    }

    Cheque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setOrder(Order order) {
        this.order.add(order);
    }

    public void setService(double Service) {
        this.Service = Service;
    }

    public void setTableNumber(int TableNumber) {
        this.TableNumber = TableNumber;
    }

    public void setTottal() {
        int size= order.size();
        for (int i = 0; i < size ;i++) {
            int Isize = order.get(i).getItem().size();
            for(int j = 0; j<Isize; j++)
            this.Tottal += order.get(i).getItem().get(j).getPrice();
        }
    }

    public LinkedList<Order> getOrder() {
        return order;
    }

    public double getService() {
        return Service;
    }

    public int getTableNumber() {
        return TableNumber;
    }

    public double getTottal() {
        return Tottal;
    }

    public double getTottalCross() {
        return TottalCross;
    }

    public void setTottalCross() {
        this.TottalCross = getTottal() + getService();
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
