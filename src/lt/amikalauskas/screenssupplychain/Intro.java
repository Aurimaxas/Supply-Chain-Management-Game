package lt.amikalauskas.screenssupplychain;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.beans.Visibility;
import java.io.File;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;  
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.EventHandler;

public class Intro extends Application  
{  
  
    @Override  
    public void start(Stage primaryStage){  

        
        Media media = new Media(new File("C:/Users/Aurimo PC/Java/eclipse-workspace/SupplyChainGame/src/lt/amikalauskas/Images/Intro.mp4").toURI().toString());
           
        MediaPlayer mediaPlayer = new MediaPlayer(media);
       
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(mediaView);
 
        borderPane.setStyle("-fx-background-color: Black");

        Scene scene = new Scene(borderPane, 1920, 1100);
        
        primaryStage.setTitle("Media Player!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        PauseTransition delay = new PauseTransition(Duration.seconds(5));
        delay.setOnFinished( event -> primaryStage.close() );
        delay.play();
          
    }
    public static void Pradeti(String[] args) {
    	
        launch(args);						
		
    	
        ScreenMain screenMain = new ScreenMain("");
        screenMain.ScreenMain();
       
        
        
        
    }  
      
} 