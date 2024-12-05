import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class Week4LabProblem1 extends Application {
    public void start(Stage stage) {

        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);

        // Quadrant 1
        for(int i = 0; i < 20; i++){
            Line line = new Line( 200, (i * 10), 200 + (i * 10), 200 );
            line.setStrokeWidth(1);
            root.getChildren( ).add( line );
        }

        // Quadrant 2
        for(int i = 0; i < 20; i++){
            Line line = new Line( 200, (i * 10), 200 - (i * 10), 200 );
            line.setStrokeWidth(1);
            root.getChildren( ).add( line );
        }

        // Quadrant 3
        for(int i = 0; i < 20; i++){
            Line line = new Line( (i * 10), 200, 200, 200 + (i * 10));
            line.setStrokeWidth(1);
            root.getChildren( ).add( line );
        }

        // Quadrant 4
        for(int i = 0; i < 20; i++){
            Line line = new Line( 400 - (i * 10), 200, 200, 200 + (i * 10));
            Line line2 = new Line( 200, 200, 200, 400);
            line.setStrokeWidth(1);
            root.getChildren( ).add( line );
            root.getChildren( ).add( line2 );

        }



        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}