package praktikum1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveMe extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		int width = 400;
		int height = 200;
		
		stage.setTitle("Move me around!");
		
		Pane layout = new Pane();
		Circle circle = new Circle(20);
		circle.setFill(Color.RED);
		circle.setLayoutX(width / 2);
		circle.setLayoutY(height / 2);
		
		layout.getChildren().add(circle);
		
		
		circle.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				circle.setFill(circle.getFill().equals(Color.RED) ? Color.GREEN : Color.RED);
			}
		});
		
		circle.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
			if (event.getCode() == KeyCode.LEFT) {
				System.out.println("You pressed left!");
				circle.setLayoutX((width - 3) / 2);
			}
		});
		
		Scene scene = new Scene(layout, width, height);
		stage.setScene(scene);
		stage.show();
		
	}

}