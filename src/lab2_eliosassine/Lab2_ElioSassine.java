/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_eliosassine;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 2493512
 */
public class Lab2_ElioSassine extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        Random rand = new Random();
        stage.setTitle("Java Games");
        
        Label top = new Label("Random Game");
        Label bot = new Label("Waiting");
        
        root.setTop(top);
        root.setBottom(bot);
        
        String imgLink = String.format("file:images/1%02d.jpg", rand.nextInt(1, 21));
        Image img = new Image(imgLink);
        ImageView imgView = new ImageView(img);
        Label imgLabel = new Label();
        imgLabel.setGraphic(imgView);
        
        StackPane middle = new StackPane();
        
        middle.getChildren().addAll(imgLabel);

        root.setCenter(middle);
        
        Scene scene = new Scene(root, 250, 300);
        stage.setScene(scene);
        
        stage.show();
    }
    
}
