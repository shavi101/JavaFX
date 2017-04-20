package application;
import java.net.URL;
//import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.scene.control.SplitMenuButton;
import javafx.stage.Stage;

public class MainController extends Application {
	
	@FXML
	private Label lblA;
	@FXML
	private SplitMenuButton SptM1I1L4;
    @FXML
	private TextField txtRegL4;
    
    @FXML
	private Button btnSubmitL4;
    
    
    @FXML
	private Label lblARegL4;
    @FXML
    private TextField txtM1I1L4;
    @FXML
    private TextField txtM1I2L4;
    @FXML
    private TextField txtM1I3L4;
    @FXML
    private TextField txtM2I1L4;
    @FXML
    private TextField txtM2I2L4;
    @FXML
    private TextField txtM2I3L4;
    @FXML
    private TextField txtM3I1L4;
    @FXML
    private TextField txtM3I2L4;
    @FXML
    private TextField txtM3I3L4;
    @FXML
    private TextField txtM4I1L4;
    @FXML
    private TextField txtM4I2L4;
    @FXML
    private TextField txtM4I3L4;
    @FXML
    private TextField txtM5I1L4;
    @FXML
    private TextField txtM5I2L4;
    @FXML
    private TextField txtM5I3L4;
    @FXML
    private TextField txtM6I1L4;
    @FXML
    private TextField txtM6I2L4;
    @FXML
    private TextField txtM6I3L4;
    @FXML
	private SplitMenuButton SptM1I2L4;
	@FXML
	private SplitMenuButton SptM1I3L4;
	@FXML
	private SplitMenuButton SptM2I1L4;
	@FXML
	private SplitMenuButton SptM4I1L4;
	@FXML
	private SplitMenuButton SptM3I3L4;
	@FXML
	private SplitMenuButton SptM2I2L4;
	@FXML
	private SplitMenuButton SptM2I3L4;
	@FXML
	private SplitMenuButton SptM3I1L4;
	@FXML
	private SplitMenuButton SptM3I2L4;
	@FXML
	private SplitMenuButton SptM6I2L4;
	@FXML
	private SplitMenuButton SptM6I1L4;
	@FXML
	private SplitMenuButton SptM5I3L4;
	@FXML
	private SplitMenuButton SptM5I2L4;
	@FXML
	private SplitMenuButton SptM5I1L4;
	@FXML
	private SplitMenuButton SptM4I2L4;
	@FXML
	private SplitMenuButton SptM4I3L4;
	@FXML
	private SplitMenuButton SptM6I3L4;
	@FXML
	private Label lblRegL4;
	
	@FXML
	private Label lbluog;
	
	@FXML
	private Label lblL4;
	
	@FXML
	private Label lbluog1;
	@FXML
	private Label lblL5;
	@FXML
	private Button btnSubmitL5;
	@FXML
	private Label lblRegL5;
	@FXML
	private TextField txtRegL5;

	@FXML
	private Label lblL6;
	@FXML
	private Label lblRegL51;
	@FXML
	private TextField txtRegL51;
	
	
	@FXML
	private Label lblM1I1L4;
	
	@FXML
	private Label lblM1I2L4;
	@FXML
	private Label lblM1I3L4;
	@FXML
	private Label lblM1AvgL4;
	@FXML
	private Label lblM1ResL4;
	@FXML
	private Label lblM2I1L4;
	@FXML
	private Label lblM2I2L4;
	@FXML
	private Label lblM2I3L4;
	@FXML
	private Label lblM2AvgL4;
	@FXML
	private Label lblM2ResL4;
	@FXML
	private Label lblM3I1L4;
	@FXML
	private Label lblM3I2L4;
	@FXML
	private Label lblM3I3L4;
	@FXML
	private Label lblM3AvgL4;
	@FXML
	private Label lblM3ResL4;
	@FXML
	private Label lblM4I1L4;
	@FXML
	private Label lblM4I2L4;
	@FXML
	private Label lblM4I3L4;
	@FXML
	private Label lblM4AvgL4;
	@FXML
	private Label lblM4ResL4;
	@FXML
	private Label lblM5I1L4;
	@FXML
	private Label lblM5I2L4;
	@FXML
	private Label lblM5I3L4;
	@FXML
	private Label lblM5AvgL4;
	@FXML
	private Label lblM5ResL4;
	@FXML
	private Label lblM6I1L4;
	@FXML
	private Label lblM6I2L4;
	@FXML
	private Label lblM6I3L4;
	@FXML
	private Label lblM6AvgL4;
	@FXML
	private Label lblM6ResL4;
	@FXML
	private Label lblM1ConL4;
	@FXML
	private Label lblM2ConL4;
	@FXML
	private Label lblM3ConL4;
	@FXML
	private Label lblM4ConL4;
	@FXML
	private Label lblM5ConL4;
	@FXML
	private Label lblM6ConL4;
	
	@FXML
	private Label lblM1CredL4;
	@FXML
	private Label lblM2CredL4;
	@FXML
	private Label lblM3CredL4;
	@FXML
	private Label lblM4CredL4;
	@FXML
	private Label lblM5CredL4;
	@FXML
	private Label lblM6CredL4;
	@FXML
	private Label lblTotCredL4;
	@FXML
	private Label lblTotL4;
	@FXML
	private Label lblRefL4;
	@FXML
	private Label lblRetL4;
	@FXML
	private Label lblFinalL4;
	
	@FXML
	private Label lblRegL4R;
	@FXML
	private Label lblATotL4;
	@FXML
	private Label lblARefL4;
	@FXML
	private Label lblARetL4;
	@FXML
	private Label lblMod1L4;
	@FXML
	private Label lblMod2L4;
	@FXML
	private Label lblMod3L4;
	@FXML
	private Label lblMod4L4;
	@FXML
	private Label lblMod5L4;
	@FXML
	private Label lblMod6L4;
	@FXML
	private Label lblMod6L4R;
	@FXML
	private Label lblMod5L4R;
	@FXML
	private Label lblMod4L4R;
	@FXML
	private Label lblMod3L4R;
	
	@FXML
	private Label lblMod2L4R;
	@FXML
	private Label lblMod1L4R;
	@FXML
	private Label lblI1L4;
	@FXML
	private Label lblI2L4;
	@FXML
	private Label lblI3L4;
	@FXML
	private Label lblAvgL4;
	@FXML
	private Label lblResL4;
	@FXML
	private Label lbluog2;
	@FXML
	private Label lblCredL4;
	@FXML
	private Label lblFinalL5;
	@FXML
	private Label lblL4R;
	@FXML
	private GridPane lblL4Grid;
	
	
	
	//Level4 Submit
	@FXML 
    public void Reg(ActionEvent event)throws Exception{//Action on submit button
		
		//Registration ID
		   
		    String reg=txtRegL4.getText();
		   lblARegL4.setText(reg);
		   
		
	//Switching interfaces
		Stage primaryStage=new Stage();
		Parent rt=FXMLLoader.load(getClass().getResource("/application/Level4.fxml"));
		Scene scene = new Scene(rt,742,615);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
		
	
   
    //Module1
 
    int n1=Integer.parseInt(txtM1I1L4.getText());//String to int ict1 module1
	//int n2=Integer.parseInt(txtM1I2L4.getText());//String to int ict2 module1
   // int n3=Integer.parseInt(txtM1I3L4.getText());//String to int ict3 module1
	
	//ArrayList<Integer>level4=new ArrayList<>();//Creating a Dynamic array to store marks
		
		//level4.add(n1);//Adding items
		//level4.add(n2);
		//level4.add(n3);
		
		//Ict1 module1 Pass/Ref/Retake
		if(txtM1I1L4.getText()!=null && n1>=0 && n1<=100 ){
		
		
		if(n1>=40 ){
			lblA.setText("Pass");
		}
			
			else if (n1>=30 && n1<=40){
				lblA.setText("Referral");
			}
				
				else{
					lblA.setText("Retake");
				}
		
		           
		            }else
			     {
        
        Alert alert = new Alert(AlertType.WARNING);
      //  alert.initOwner(mainApp.getPrimaryStage());
        alert.setTitle("Error");
        alert.setHeaderText("Invalid Mark");
        alert.setContentText("Please Enter Marks Between 0 and 100");

        alert.showAndWait();
    }
		
		
		/** //Ict2 module1 Pass/Ref/Retake
		do{
			
			if(n2>=40 ){
				lblA.setText("Pass");
			}
				
				else if (n2>=30 && n2<=40){
					lblA.setText("Referral");
				}
					
					else{
						lblA.setText("Retake");
					}
			}
			           while(n2>=0 && n2<=100);
			           
			    
		
		//Ict3 module1 Pass/Ref/Retake
				do{
					
					if(n3>=40 ){
						lblA.setText("Pass");
					}
						
						else if (n3>=30 && n3<=40){
							lblA.setText("Referral");
						}
							
							else{
								lblA.setText("Retake");
							}
					}
					           while(n3>=0 && n3<=100);
				
				//Calculating the average for module 1
				int avg1=(n1+n2+n3)/3;
				String avg1S = Integer.toString(avg1);
				lblM1AvgL4.setText(avg1S);
				
				//Result
				do{
				if(avg1>=40){
					lblM1ResL4.setText("Pass");
					
				}
				else{
					lblM1ResL4.setText("Fail");
				}
				}
				while(avg1<=100 && avg1<=0);
				
				//Condoned credits
				if(avg1>=30 && avg1<=40){
					lblM1ConL4.setText("E/C");
				}
				else{
					lblM1ConL4.setText("-");
				}
				
				//Credits
				if(avg1>=40 && avg1<=100){
					
					ArrayList<Integer>level4Cred=new ArrayList<>();//Creating a Dynamic array to store credits
					
					int x=20;
					level4Cred.add(x);//Adding items
					
					lblM1CredL4.setText("20 Credits");
				}
				else
					lblM1CredL4.setText("0 Credits");
					
				
				
				
				//Module2
				int n4=Integer.parseInt(txtM2I1L4.getText());//String to int ict1 module2
				int n5=Integer.parseInt(txtM2I2L4.getText());//String to int ict2 module2
				int n6=Integer.parseInt(txtM2I3L4.getText());//String to int ict3 module2
				
				level4.add(n4);//Adding Module2 icts
				level4.add(n5);
				level4.add(n6);
				
				//Ict1 module2 Pass/Ref/Retake
				do{
				
				if(n4>=40 ){
					lblA.setText("Pass");
				}
					
					else if (n4>=30 && n4<=40){
						lblA.setText("Referral");
					}
						
						else{
							lblA.setText("Retake");
						}
				}
				           while(n4>=0 && n4<=100);
				
				
				//Ict2 module2 Pass/Ref/Retake
				do{
					
					if(n5>=40 ){
						lblA.setText("Pass");
					}
						
						else if (n5>=30 && n5<=40){
							lblA.setText("Referral");
						}
							
							else{
								lblA.setText("Retake");
							}
					}
					           while(n5>=0 && n5<=100);
				
				//Ict3 module2 Pass/Ref/Retake
						do{
							
							if(n6>=40 ){
								lblA.setText("Pass");
							}
								
								else if (n6>=30 && n6<=40){
									lblA.setText("Referral");
								}
									
									else{
										lblA.setText("Retake");
									}
							}
							           while(n6>=0 && n6<=100);
						
						
						//Total credits
						for(int y:level4Cred){
						int total+=y;
						
						String totalS= Integer.toString(total);
						
						
						lblTotCredL4.setText(totalS);
						lblATotL4.setText(totalS);
						}
						
						//no. of Referrals
						
						for(int z:level4){
							if(z>30 && z<)
							
						}
						*/
		
						
						
						
	}
	/** //Level5 Submit
		@FXML 
	    public void Reg1(ActionEvent event)throws Exception{//Action on submit button L5
			
			/** //Registration ID
			   String reg1=txtRegL5.getText();
			   lblARegL5.setText(reg1);
			
		//Switching interfaces
			Stage primaryStage=new Stage();
			Parent rt=FXMLLoader.load(getClass().getResource("/application/Level5.fxml"));
			Scene scene = new Scene(rt,742,615);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} */
 
				
				
				
				
			
			
		
		
       
		
   
		
		
            
        
   
  
   
   
   
  
		
		
		
		
		
		
   
   

public Label getLblA() {
	return lblA;
}






























public void setLblA(Label lblA) {
	this.lblA = lblA;
}






























public Button getBtnSubmitL4() {
	return btnSubmitL4;
}






























public void setBtnSubmitL4(Button btnSubmitL4) {
	this.btnSubmitL4 = btnSubmitL4;
}






























public TextField getTxtM1I1L4() {
	return txtM1I1L4;
}






























public void setTxtM1I1L4(TextField txtM1I1L4) {
	this.txtM1I1L4 = txtM1I1L4;
}






























@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	}
































public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	
}


































}
