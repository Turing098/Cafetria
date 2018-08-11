package cafeteria;

import java.util.LinkedList;

public class CFunction {

    User user = new User();
    Cheque cheque ;
    Items item ;
    Order order ;

    
    public void SetOrder(LinkedList<Items> items , LinkedList<Integer> quatenty, int TN , boolean ST) {
        if (user.getType() == User.Casher || user.getType() == User.Maneger) {
            int size = items.size();
            for (int i = 0; i < size; i++) {
                cheque = new Cheque(new Order(items, quatenty, ST   ), TN );
            }
        } else {
            // cann't done
            System.out.println("u cann't make an order");
        }
    }
    
    public void Taxes(){
        
    }
    
    public void sales(){
        
    }
    
    public void DailyInventory(){
        
    }
    
    public void MonthleyInventory(){
        
    }
    
    public void CancelOrder(){
        if(User.Maneger==user.getType()){
            
        }
        else {
            System.out.println("u can't do it son pf bitch");
        }
    }
    
    private void AddCasher(){
        
    }
    
    private void SetService(){
        
    }
    
    public void DetalidInventory(){
        
    }
    public void PrivateSales(){
        
    }
    
    private void AddManeger(){
        if(User.Owner==user.getType()){
            
        }
        else 
            System.out.println("u can't do it");
    }
    
    
}
