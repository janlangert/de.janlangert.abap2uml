package de.janlangert.abap2uml.ui;

import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextBuilder;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class HelloWorld extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args); 
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		  final Circle circ = new Circle(40, 40, 30);  
	        
	     
//	      Text
	      Text textRef = TextBuilder.create()
	    	      .layoutY(100)
	    	      .textOrigin(VPos.TOP)
	    	      .textAlignment(TextAlignment.JUSTIFY)
	    	      .wrappingWidth(400)
	    	      .text("Ein Text")
	    	      .fill(Color.rgb(187, 195, 107))
	    	      .font(Font.font("SansSerif", FontWeight.BOLD, 24))
	    	      .build();
	  
	      final Group root = new Group(circ); 
	      root.getChildren().add(textRef);
	      final Scene scene = new Scene(root,400,300);
	      
	      
//	      Parameter
	      Application.Parameters parameters = this.getParameters();
	      Map<String,String> namedParameters = parameters.getNamed();
	      System.out.println("NamedParameters: ");
	      for(Map.Entry<String, String> e : namedParameters.entrySet()){
	    	  String key = e.getKey();
	    	  String value = e.getValue();
	    	  System.out.println(key+ ": " + value);	    	
	    	}
	     
	      stage.initStyle(StageStyle.DECORATED);
	      stage.setTitle("Hello JavaFX 2.0!");  
	      stage.setScene(scene);  
	      stage.show();  
		
	}

}
