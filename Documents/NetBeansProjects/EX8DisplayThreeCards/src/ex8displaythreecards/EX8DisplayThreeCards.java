/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8displaythreecards;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Alex Thunderhunter
 */
public class EX8DisplayThreeCards extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        ArrayList<Integer> list = new ArrayList<>();
        for (int card = 1; card <= 52; card++){
            list.add(card);            
        }
        java.util.Collections.shuffle(list);
           
        
        Pane pane = new HBox();
        pane.setPadding(new Insets(5,5,5,5));
        
        Image image = new Image("cards/"+list.get(0)+".png",150,200,false,false);
        pane.getChildren().add(new ImageView(image));
        
        Image image2 = new Image("cards/"+list.get(1)+".png",150,200,false,false);
        pane.getChildren().add(new ImageView(image2));
        
        Image image3 = new Image("cards/"+list.get(2)+".png",150,200,false,false);
        pane.getChildren().add(new ImageView(image3));
        
        
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Cards");
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
