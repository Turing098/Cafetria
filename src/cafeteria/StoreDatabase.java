package cafeteria;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


public class StoreDatabase extends Database {

    private HashMap<String, Integer> userTypes;

    public StoreDatabase(String driverURL, String databaseURL) {
        super(driverURL, databaseURL);

    }

    public void initializeUserTypes() {
        userTypes = new HashMap<>();
        ArrayList<String> types = getUserTypes();
        for(int i = 0, s = types.size(); i<s; i++)
            userTypes.put(types.get(i),i);
    }

    public Integer userType(String type) {
        int user_type  =  userTypes.get(type);
        return user_type;
    }

    public Integer login(String userName, String userPassword) {

        Integer user_type  = userTypes.get("NOT_REGISTERED");
        ResultSet resultSet = executeQuery("select * from users where user_name='"+userName+"';");

        try {
            if(resultSet.next())
            {
                String databasePassword = resultSet.getString("user_password");
                if(databasePassword.equals(userPassword))
                    user_type = resultSet.getInt("user_type");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user_type;
    }

    public ArrayList<String> getUserTypes() {

        ArrayList<String> types = new ArrayList<>();
        ResultSet resultSet = executeQuery("select type from users_types;");

        try {
            while(resultSet.next())
                types.add(resultSet.getString("type"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return types;
    }


    boolean addUser(String userName, String userPassword, int userType) {
        boolean done = false;
        done = executeInsertion("insert into users (user_name, user_password, user_type) " +
                "values ('"+ userName + "', '"+userPassword + "', "+ userType +");");
        return done;
    }

    public boolean addItem(String itemName, float buyingPrice, float sellingPrice, int availableQuantity ) {
        boolean done = false;
        done = executeInsertion("insert into items (item_name, available_quantity, buying_price, selling_price) " +
                "values ('"+ itemName + "', "+availableQuantity + ", "+ buyingPrice + ", "+ sellingPrice +");");
        return done;
    }


    public boolean addOrder(int tableNumber, ArrayList<Items> boughtItems, ArrayList<Integer> boughtQuantities, boolean isPaid) {
        boolean done = false;
        double totalCost = 0;
        for(int i=0, s= boughtItems.size(); i<s; i++)
            totalCost += boughtItems.get(i).getPrice() * boughtQuantities.get(i);


        done = executeInsertion("insert into orders (order_date, table_number, is_paid, order_total_cost)" +
                                "values ("+ new  Timestamp(new java.util.Date().getTime()) + ", " + tableNumber + ", " + isPaid+ ", " + totalCost+ ");");

        ResultSet resultSet = executeQuery("select order_id form orders order by order_id desc limit 1;");
        int lastOrderID = 0;
        try {
            if(resultSet.next())
                lastOrderID = resultSet.getInt("order_id");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for(int i=0, s= boughtItems.size(); i<s; i++)
        {
            done = executeInsertion("insert into orders details (order_id, item_id, sold_quantity, item_selling_price)" +
                    "values (" + lastOrderID + boughtItems.get(i).getID() + ", " + boughtQuantities.get(i) + ", " + boughtItems.get(i).getPrice()+");" );

            int itemRemainingQuantity = boughtItems.get(i).getQuanety() - boughtQuantities.get(i);
            executeUpdate("update items set available_quantity="+ itemRemainingQuantity +';');
        }
        return done;
    }

    public boolean insertBill(int tableNumber, ArrayList<Order> orders, double serviceCost) {
        boolean done = false;
        double ordersTotalCost = 0;
        for(Order x : orders)
            ordersTotalCost += x.getTotalCost();
        double totalBill = ordersTotalCost + serviceCost;

        done = executeInsertion("insert into bills (table_number, bill_date, orders_total_cost, service_cost, total_bill)" +
                                "values ("+ tableNumber + ", "+ new Timestamp(new Date().getTime())  + ", "+ ordersTotalCost + ", "+ serviceCost  + ", "+ totalBill +");");

        ResultSet resultSet = executeQuery("select bill_id form bills order by bill_id desc limit 1;");
        int lastBillID = 0;
        try {
            if(resultSet.next())
                lastBillID = resultSet.getInt("bill_id");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for(Order x: orders)
        {
            done = executeInsertion("insert into bills_orders (bill_id, order_id)"+
                                    "values (" + lastBillID + ", "+ x.getID() +");");
            executeUpdate("update orders set is_paid = 1 where order_id="+x.getID() + ';');
        }
        return done;
    }

    public ResultSet getAllBills() {
        ResultSet resultSet = executeQuery("select * from bills;");
        return  resultSet;
    }

    public ResultSet getAllItems() {
        ResultSet resultSet = executeQuery("select * from items;");
        return  resultSet;
    }

    public ResultSet getAllOrders() {
        ResultSet resultSet = executeQuery("select * from orders;");
        return  resultSet;
    }

    public ResultSet getAllUnpaidOrders() {
        ResultSet resultSet = executeQuery("select * from orders where is_paid = 0;");
        return  resultSet;
    }

    public ResultSet getOrderDetails(int orderID) {
        ResultSet resultSet = executeQuery("select * from orders_details where order_id="+orderID +";");
        return  resultSet;
    }

    public ResultSet getBillOrders(int billID) {
        ResultSet resultSet = executeQuery("select * from bill_orders where bill_id="+billID +";");
        return  resultSet;
    }


}
