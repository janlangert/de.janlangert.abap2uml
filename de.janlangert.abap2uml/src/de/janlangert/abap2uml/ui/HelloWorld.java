package de.janlangert.abap2uml.ui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


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
	      final Group root = new Group(circ);  
	      final Scene scene = new Scene(root, 400, 300);  
	  
	      stage.setTitle("Hello JavaFX 2.0!");  
	      stage.setScene(scene);  
	      stage.show();  
		
	}

}
