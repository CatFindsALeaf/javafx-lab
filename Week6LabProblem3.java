import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Week6LabProblem3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        // Your code here :)
        BorderPane pane = new BorderPane();

        Button moveUp = new Button("Move Up");
        Button moveDown = new Button("Move Down");
        Button moveLeft = new Button("Move Left");
        Button moveRight = new Button("Move Right");

        HBox topBox = new HBox(moveUp);
        HBox bottomBox = new HBox(moveDown);
        VBox leftBox = new VBox(moveLeft);
        VBox rightBox = new VBox(moveRight);

        pane.prefWidthProperty().bind(scene.widthProperty());
        pane.prefHeightProperty().bind(scene.heightProperty());

        moveUp.prefWidthProperty().bind(topBox.widthProperty());
        moveDown.prefWidthProperty().bind(bottomBox.widthProperty());
        moveLeft.prefHeightProperty().bind(leftBox.heightProperty());
        moveRight.prefHeightProperty().bind(rightBox.heightProperty());


        Circle circle = new Circle(100, 50, 25);
        pane.setCenter(new Pane(circle));

        pane.setTop(topBox);
        pane.setBottom(bottomBox);
        pane.setLeft(leftBox);
        pane.setRight(rightBox);


        moveUp.setOnAction(
                (ActionEvent event) -> {
                    circle.setCenterY(circle.getCenterY()-10);
                }
        );

        moveDown.setOnAction(
                (ActionEvent event) -> {
                    circle.setCenterY(circle.getCenterY()+10);
                }
        );

        moveLeft.setOnAction(
                (ActionEvent event) -> {
                    circle.setCenterX(circle.getCenterX()-10);
                }
        );

        moveRight.setOnAction(
                (ActionEvent event) -> {
                    circle.setCenterX(circle.getCenterX()+10);
                }
        );

        root.getChildren().add(pane);

        primaryStage.setTitle("Problem 3: Ball Control");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
