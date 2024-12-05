import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class Week4LabProblem2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 50);

        primaryStage.setTitle("Problem 2: Counter");
        primaryStage.setScene(scene);


        // Your code here :)
        AtomicInteger counter = new AtomicInteger(0);
        String str = String.valueOf(counter);
        Label label = new Label(str);
        BorderPane pane = new BorderPane();

        Button decrease = new Button("Decrease");

        Button increase = new Button("Increase");

        VBox right = new VBox(increase);
        VBox left = new VBox(decrease);

        pane.prefWidthProperty().bind(scene.widthProperty());

        pane.setLeft(left);
        pane.setRight(right);
        pane.setCenter(label);

        root.getChildren ().add(pane);


        decrease.setOnAction(
                (ActionEvent event) -> {counter.decrementAndGet();
                    label.setText("" + counter.get());}
        );


        increase.setOnAction(
                (ActionEvent event) -> {counter.incrementAndGet();
                    label.setText("" + counter.get());});


        primaryStage.show();

    }
}