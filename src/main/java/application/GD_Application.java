package application;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GD_Application extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override	
	public void start(Stage primaryStage) {
		
		try {
			BorderPane  pane = new BorderPane();
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Chess");
			primaryStage.show();


		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
