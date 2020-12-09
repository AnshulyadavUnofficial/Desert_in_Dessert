package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;


public class Main extends Application {
    int score =0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Random random = new Random();
        primaryStage.setTitle("Dessert in the Desert JavaFX Game");
        BorderPane pane = new BorderPane();

        //Creating and inserting the label
        Label l1 = new Label("Score: "+ score);
        pane.setTop(l1);
        BorderPane.setAlignment(l1, Pos.TOP_LEFT);

        //Creating the exit button with its utility and inserting in pane
        Button exit = new Button("Exit");
        exit.setOnMouseClicked(mouseEvent -> {
            primaryStage.close(); });
        pane.setBottom(exit);
        BorderPane.setAlignment(exit,Pos.BOTTOM_RIGHT);

        //Creating another borderPane with desert and dessert buttons
        Button dessert = new Button("Dessert");
        Button desert1 = new Button("Desert");
        Button desert2 = new Button("Desert");
        Button desert3 = new Button("Desert");
        Button desert4 = new Button("Desert");
        Button desert5 = new Button("Desert");
        Button desert6 = new Button("Desert");
        Button desert7 = new Button("Desert");
        Pane anotherPane= new Pane(desert1,desert2,desert3,desert4,desert5,desert6,desert7,dessert);
        Button [] allButtons = {desert1,desert2,desert3,desert4,desert5,desert6,desert7,dessert};
        dessert.setOnAction(mouseEvent -> {randomizeButtonPositions(random,allButtons);
        l1.setText("Score :"+(score++));
        exit.requestFocus();
        });
        desert1.setOnAction(mouseEvent -> {randomizeButtonPositions(random,allButtons);
        l1.setText("Score :"+(score--));exit.requestFocus();});
        desert2.setOnAction(mouseEvent -> {randomizeButtonPositions(random,allButtons);
        l1.setText("Score :"+(score--));exit.requestFocus();});
        desert3.setOnAction(mouseEvent -> {randomizeButtonPositions(random,allButtons);
        l1.setText("Score :"+(score--));exit.requestFocus();});
        desert4.setOnAction(mouseEvent -> {randomizeButtonPositions(random,allButtons);
        l1.setText("Score :"+(score--));exit.requestFocus();});
        desert5.setOnAction(mouseEvent -> {randomizeButtonPositions(random,allButtons);
        l1.setText("Score :"+(score--));exit.requestFocus();});
        desert6.setOnAction(mouseEvent -> {randomizeButtonPositions(random,allButtons);
        l1.setText("Score :"+(score--));exit.requestFocus();});
        desert7.setOnAction(mouseEvent -> {randomizeButtonPositions(random,allButtons);
        l1.setText("Score :"+(score--));exit.requestFocus();});
        //Adding anotherPane to pane
        exit.requestFocus();
        pane.setCenter(anotherPane);
        BorderPane.setAlignment(anotherPane,Pos.CENTER);
        Scene scene= new Scene(pane, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void randomizeButtonPositions(Random random, Button[] buttons){
        for(Button b : buttons){
            b.setLayoutX(random.nextInt(600));
            b.setLayoutY(random.nextInt(400));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
