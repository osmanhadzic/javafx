package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application  {
    Stage window;
    Scene scene1,scene2;


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label("Welcome on first secen");
        Button btn1 = new Button();
        btn1.setText("Next secen");
        btn1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,btn1);
        scene1 = new Scene(layout1,300,300);

        Button btn2 = new Button("Back on first scene");
        btn2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn2);

        scene2 = new Scene(layout2,600,600);

        window.setScene(scene1);
        window.setTitle("Titele here");
        window.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


}
