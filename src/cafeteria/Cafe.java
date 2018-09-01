
package cafe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Cafe extends Application {
    Stage s ;
    Scene scene;
    
    public AnchorPane login(){
        
    AnchorPane home = new AnchorPane();
    
    Image image= new Image("images/IMG-20180816-WA0016.jpg");
   ImageView imageView1 = new ImageView(image); 
      imageView1.fitHeightProperty().bind(home.heightProperty());
   imageView1.fitWidthProperty().bind(home.widthProperty());
    
                             imageView1.setPreserveRatio(false);
            home.getChildren().add(imageView1); 
    
    Label cafesystem = new Label("Cafe");
          cafesystem.setStyle("-fx-text-Fill: white");
     cafesystem.setFont(Font.font("Arial", FontWeight.BOLD, 30));
     cafesystem.setLayoutX(120);
      cafesystem.setLayoutY(20);
      home.getChildren().add(cafesystem);
    
    Label username = new Label("Username");
          username.setStyle("-fx-text-Fill: white");
     username.setFont(Font.font("Arial", FontWeight.BOLD, 13));
     TextField us = new TextField();
     us.setPromptText("Enter Your Username");
     us.setStyle("-fx-background-color: rgba(53,89,119,0.4);-fx-text-inner-color: white;"); 
     us.setLayoutX(100);
     us.setLayoutY(85);
     username.setLayoutX(10);
      username.setLayoutY(85);
      home.getChildren().addAll(username,us);
      
      
      
      Label password = new Label("Password");
          password.setStyle("-fx-text-Fill: white");
     password.setFont(Font.font("Arial", FontWeight.BOLD, 13));
     
       PasswordField ps = new PasswordField();
        ps.setPromptText("Enter Your Password");
     ps.setStyle("-fx-background-color: rgba(53,89,119,0.4);-fx-text-inner-color: white;"); 
     password.setLayoutX(10);
      password.setLayoutY(125);
      ps.setLayoutX(100);
      ps.setLayoutY(125);
      home.getChildren().addAll(password, ps);   

      Button login = new Button("login");
      login.setStyle("-fx-background-color: orange;-fx-text-fill: white;");
      login.setPrefWidth(70);
      login.setLayoutX(150);
       login.setLayoutY(170);
        home.getChildren().add(login);
        
    return home;
    }
    public AnchorPane manageraccount(){
    AnchorPane manager = new AnchorPane();   
            Image image= new Image("images/IMG-20180816-WA0018.jpg");
   ImageView imageView1 = new ImageView(image);  
   imageView1.fitHeightProperty().bind(manager.heightProperty());
   imageView1.fitWidthProperty().bind(manager.widthProperty());
   imageView1.setPreserveRatio(false);
            manager.getChildren().add(imageView1);
            
            
            
        //jshkldsjhfas;lfhasldfh    
  
    
    return manager;
    }
    public AnchorPane addemp(){
    AnchorPane emp = new AnchorPane();
     Image image= new Image("images/IMG-20180816-WA0015.jpg");
   ImageView imageView1 = new ImageView(image); 
   imageView1.fitHeightProperty().bind(emp.heightProperty());
   imageView1.fitWidthProperty().bind(emp.widthProperty());
                             imageView1.setPreserveRatio(false);
            emp.getChildren().add(imageView1);
    
    
        Label name = new Label("name:");
          name.setStyle("-fx-text-Fill: white");
     name.setFont(Font.font("Arial", FontWeight.BOLD, 13));
     TextField us = new TextField();
     us.setPromptText("Enter Your name");
     us.setStyle("-fx-background-color: rgba(53,89,119,0.4);-fx-text-inner-color: white;"); 
     us.setLayoutX(100);
     us.setLayoutY(85);
     name.setLayoutX(30);
      name.setLayoutY(85);
      emp.getChildren().addAll(name,us);
      
      Label pass = new Label("password:");
          pass.setStyle("-fx-text-Fill: white");
     pass.setFont(Font.font("Arial", FontWeight.BOLD, 13));
     TextField ps = new TextField();
     ps.setPromptText("Enter Your password");
     ps.setStyle("-fx-background-color: rgba(53,89,119,0.4);-fx-text-inner-color: white;"); 
     ps.setLayoutX(100);
     ps.setLayoutY(125);
     pass.setLayoutX(30);
      pass.setLayoutY(125);
      emp.getChildren().addAll(pass,ps);
      
    Label age = new Label("age:");
          age.setStyle("-fx-text-Fill: white");
     age.setFont(Font.font("Arial", FontWeight.BOLD, 13));
     TextField as = new TextField();
     as.setPromptText("Enter Your age");
     as.setStyle("-fx-background-color: rgba(53,89,119,0.4);-fx-text-inner-color: white;"); 
     as.setLayoutX(100);
     as.setLayoutY(165);
     age.setLayoutX(30);
      age.setLayoutY(165);
      emp.getChildren().addAll(age,as);
      
      Button add = new Button("Add Employee");
      add.setStyle("-fx-background-color: orange;-fx-text-fill: white;");
      add.setPrefWidth(150);
      add.setLayoutX(120);
       add.setLayoutY(200);
        emp.getChildren().add(add);
      
    return emp;
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Scene scene = new Scene(login(), 300, 250);
        s = primaryStage;
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
