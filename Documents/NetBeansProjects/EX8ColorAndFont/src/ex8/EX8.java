/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

/**
 *
 * @author Alex Thunderhunter
 */
public class EX8 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*Random rand = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random(); */
        
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        Text text1 = new Text(5, 35, "Java");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 22));
        text1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text1.setOpacity(Math.random());
        pane.getChildren().add(text1);
        text1.setRotate(90);
        
        Text text2 = new Text(45, 35, "Java");
        text2.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 22));
        text2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text2.setOpacity(Math.random());
        pane.getChildren().add(text2);
        text2.setRotate(90);
        
        Text text3 = new Text(85, 35, "Java");
        text3.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 22));
        text3.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text3.setOpacity(Math.random());
        text3.setUnderline(false);
        text3.setStrikethrough(false);
        pane.getChildren().add(text3);
        text3.setRotate(90);
        
        Text text4 = new Text(125, 35, "Java");
        text4.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 22));
        text4.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text4.setOpacity(Math.random());
        text4.setUnderline(false);
        text4.setStrikethrough(false);
        pane.getChildren().add(text4);
        text4.setRotate(90);
        
        Text text5 = new Text(165, 35, "Java");
        text5.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 22));
        text5.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text5.setOpacity(Math.random());
        text5.setUnderline(false);
        text5.setStrikethrough(false);
        pane.getChildren().add(text5);
        text5.setRotate(90);
        
        Scene scene = new Scene(pane, 210, 60);
        primaryStage.setTitle("ShowText");
        primaryStage.setScene(scene);
        primaryStage.show();
           
           
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
