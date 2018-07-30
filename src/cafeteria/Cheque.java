package cafeteria;

import java.util.Date;

public class Cheque {

    private Order order;
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

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setService(double Service) {
        this.Service = Service;
    }

    public void setTableNumber(int TableNumber) {
        this.TableNumber = TableNumber;
    }

    public void setTottal() {
        for (int i = 0; i < order.getQuantety(); i++) {
            this.Tottal += order.getItem().getPrice();
        }
    }

    public Order getOrder() {
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
