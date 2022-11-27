import java.io.File;
import java.io.FileInputStream;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;

public class fishAquarium extends Application {
	
	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{

		//Play Music
		Media nemoSong = new Media (new File("Finding Nemo Song.mp3").toURI().toString());
		MediaPlayer aquariumMusic = new MediaPlayer(nemoSong);  
		aquariumMusic.setAutoPlay(true); 
		
		//Add a ground at the bottom of the aquarium
		Rectangle ground = new Rectangle (0, 600, 1500, 200);
		ground.setFill(Paint.valueOf("#F0DFD3"));
		
        //Add Rock
        Image rockpng = new Image(new FileInputStream("rock.png"));
        ImageView rock = new ImageView(rockpng); 
        //Setting the position/size of image 
        rock.setX(1000); //x position
        rock.setY(200); //y position
        rock.setFitHeight(500); //height 
        rock.setFitWidth(500); //width
        
        //Add Rock2
        Image rock2png = new Image(new FileInputStream("rock2.png"));
        ImageView rock2 = new ImageView(rock2png); 
        //Setting the position/size of image 
        rock2.setX(60); //x position
        rock2.setY(340); //y position
        rock2.setFitHeight(500); //height 
        rock2.setFitWidth(500); //width
        
        //Add Rock3
        Image rock3png = new Image(new FileInputStream("rock3.png"));
        ImageView rock3 = new ImageView(rock3png); 
        //Setting the position/size of image
        rock3.setX(650); //x position
        rock3.setY(220); //y position
        rock3.setFitHeight(650); //height 
        rock3.setFitWidth(550); //width
        
        //Add coral
        Image coralpng = new Image(new FileInputStream("coral.png"));
        ImageView coral = new ImageView(coralpng); 
        //Setting the position/size of image
        coral.setX(240); //x position
        coral.setY(350); //y position
        coral.setFitHeight(400); //height 
        coral.setFitWidth(400); //width
        //Setting the preserve ratio of the image view 
        coral.setPreserveRatio(true);

        //To move coral
        TranslateTransition translateCoral = new TranslateTransition();  
        //shifting the X coordinate
        translateCoral.setByX(5);  
        //setting the duration for the Translate transition   
        translateCoral.setDuration(Duration.millis(6000));  
        //setting cycle count for the Translate transition   
        translateCoral.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        translateCoral.setAutoReverse(true);  
        //setting Cloud to transition  
        translateCoral.setNode(coral);  
        //playing the transition   
        translateCoral.play();
        
        //Add seaweed
		Image seaweedpng = new Image(new FileInputStream("seaweed.png"));
        ImageView seaweed = new ImageView(seaweedpng); 
        //Setting the position/size of image
        seaweed.setX(950); //x position
        seaweed.setY(250); //y position
        seaweed.setFitHeight(500); //height 
        seaweed.setFitWidth(400); //width
        //Setting the preserve ratio of the image view 
        seaweed.setPreserveRatio(true);
        
        //To move seaweed
        TranslateTransition translateSeaweed = new TranslateTransition();  
        //shifting the X coordinate
        translateSeaweed.setByX(-10);  
        //setting the duration for the Translate transition   
        translateSeaweed.setDuration(Duration.millis(6000));  
        //setting cycle count for the Translate transition   
        translateSeaweed.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        translateSeaweed.setAutoReverse(true);  
        //setting Cloud to transition  
        translateSeaweed.setNode(seaweed);  
        //playing the transition   
        translateSeaweed.play();
        
        //Add seaweed2
		Image seaweed2png = new Image(new FileInputStream("seaweed2.png"));
        ImageView seaweed2 = new ImageView(seaweed2png); 
        //Setting the position/size of image
        seaweed2.setX(600); //x position
        seaweed2.setY(100); //y position
        seaweed2.setFitHeight(500); //height 
        seaweed2.setFitWidth(400); //width
        //Setting the preserve ratio of the image view 
        seaweed2.setPreserveRatio(true);
        
        //To move seaweed 2
        TranslateTransition translateSeaweed2 = new TranslateTransition();  
        //shifting the X coordinate
        translateSeaweed2.setByX(-10);  
        //setting the duration for the Translate transition   
        translateSeaweed2.setDuration(Duration.millis(3000));  
        //setting cycle count for the Translate transition   
        translateSeaweed2.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        translateSeaweed2.setAutoReverse(true);  
        //setting Cloud to transition  
        translateSeaweed2.setNode(seaweed2);  
        //playing the transition   
        translateSeaweed2.play();
        
        //Add seaweed3
		Image seaweed3png = new Image(new FileInputStream("seaweed3.png"));
        ImageView seaweed3 = new ImageView(seaweed3png); 
        //Setting the position/size of image
        seaweed3.setX(1280); //x position
        seaweed3.setY(250); //y position
        seaweed3.setFitHeight(500); //height 
        seaweed3.setFitWidth(400); //width
        //Setting the preserve ratio of the image view 
        seaweed3.setPreserveRatio(true);
        
        //To move seaweed 3
        TranslateTransition translateSeaweed3 = new TranslateTransition();  
        //shifting the X coordinate
        translateSeaweed3.setByX(10);  
        //setting the duration for the Translate transition   
        translateSeaweed3.setDuration(Duration.millis(3000));  
        //setting cycle count for the Translate transition   
        translateSeaweed3.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        translateSeaweed3.setAutoReverse(true);  
        //setting Cloud to transition  
        translateSeaweed3.setNode(seaweed3);  
        //playing the transition   
        translateSeaweed3.play();
        
        //Add Bubble
        Image bubblepng = new Image(new FileInputStream("bubble.png"));
        ImageView bubble = new ImageView(bubblepng); 
        //Setting the position/size of image
        bubble.setX(850); //x position
        bubble.setY(500); //y position
        bubble.setFitHeight(40); //height 
        bubble.setFitWidth(40); //width
        //Setting the preserve ratio of the image view 
        bubble.setPreserveRatio(true);
        
        //To move bubble
        TranslateTransition translatebubble = new TranslateTransition();  
        //shifting the X coordinate
        translatebubble.setByY(-800);  
        //setting the duration for the Translate transition   
        translatebubble.setDuration(Duration.millis(1500));  
        //setting cycle count for the Translate transition   
        translatebubble.setCycleCount(200);  
        //the transition will set to be auto reversed by setting this to true   
        //translatebubble.setAutoReverse(true);  
        //setting Cloud to transition  
        translatebubble.setNode(bubble);  
        //playing the transition   
        translatebubble.play();
        
        //Add Bubble
        Image bubblepng2 = new Image(new FileInputStream("bubble.png"));
        ImageView bubble2 = new ImageView(bubblepng2); 
        //Setting the position/size of image
        bubble2.setX(870); //x position
        bubble2.setY(400); //y position
        bubble2.setFitHeight(30); //height 
        bubble2.setFitWidth(30); //width
        //Setting the preserve ratio of the image view 
        bubble2.setPreserveRatio(true);
        
        //To move bubble 2
        TranslateTransition translatebubble2 = new TranslateTransition();  
        //shifting the X coordinate
        translatebubble2.setByY(-900);  
        //setting the duration for the Translate transition   
        translatebubble2.setDuration(Duration.millis(1500));  
        //setting cycle count for the Translate transition   
        translatebubble2.setCycleCount(200);  
        //the transition will set to be auto reversed by setting this to true   
        //translatebubble.setAutoReverse(true);  
        //setting Cloud to transition  
        translatebubble2.setNode(bubble2);  
        //playing the transition   
        translatebubble2.play();
		
        //Add Bubble 3
        Image bubblepng3 = new Image(new FileInputStream("bubble.png"));
        ImageView bubble3 = new ImageView(bubblepng3); 
        //Setting the position/size of image
        bubble3.setX(840); //x position
        bubble3.setY(400); //y position
        bubble3.setFitHeight(20); //height 
        bubble3.setFitWidth(20); //width
        //Setting the preserve ratio of the image view 
        bubble3.setPreserveRatio(true);
        
        //To move bubble
        TranslateTransition translatebubble3 = new TranslateTransition();  
        //shifting the X coordinate
        translatebubble3.setByY(-700);  
        //setting the duration for the Translate transition   
        translatebubble3.setDuration(Duration.millis(2000));  
        //setting cycle count for the Translate transition   
        translatebubble3.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        //translatebubble.setAutoReverse(true);  
        //setting Cloud to transition  
        translatebubble3.setNode(bubble3);  
        //playing the transition   
        translatebubble3.play();
        
        //Add Bubble 4
        Image bubblepng4 = new Image(new FileInputStream("bubble.png"));
        ImageView bubble4 = new ImageView(bubblepng4); 
        //Setting the position/size of image
        bubble4.setX(890); //x position
        bubble4.setY(500); //y position
        bubble4.setFitHeight(25); //height 
        bubble4.setFitWidth(25); //width
        //Setting the preserve ratio of the image view 
        bubble4.setPreserveRatio(true);
        
        //To move bubble 4
        TranslateTransition translatebubble4 = new TranslateTransition();  
        //shifting the X coordinate
        translatebubble4.setByY(-800);  
        //setting the duration for the Translate transition   
        translatebubble4.setDuration(Duration.millis(2000));  
        //setting cycle count for the Translate transition   
        translatebubble4.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        //translatebubble.setAutoReverse(true);  
        //setting Cloud to transition  
        translatebubble4.setNode(bubble4);  
        //playing the transition   
        translatebubble4.play();
        
        //Add Bubble 5
        Image bubblepng5 = new Image(new FileInputStream("bubble.png"));
        ImageView bubble5 = new ImageView(bubblepng5); 
        //Setting the position/size of image
        bubble5.setX(920); //x position
        bubble5.setY(450); //y position
        bubble5.setFitHeight(30); //height 
        bubble5.setFitWidth(30); //width
        //Setting the preserve ratio of the image view 
        bubble5.setPreserveRatio(true);
        
        //To move bubble 5
        TranslateTransition translatebubble5 = new TranslateTransition();  
        //shifting the X coordinate
        translatebubble5.setByY(-1000);  
        //setting the duration for the Translate transition   
        translatebubble5.setDuration(Duration.millis(1000));  
        //setting cycle count for the Translate transition   
        translatebubble5.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        //translatebubble.setAutoReverse(true);  
        //setting Cloud to transition  
        translatebubble5.setNode(bubble5);  
        //playing the transition   
        translatebubble5.play();
        
        //Add Bubble 6
        Image bubblepng6 = new Image(new FileInputStream("bubble.png"));
        ImageView bubble6 = new ImageView(bubblepng6); 
        //Setting the position/size of image
        bubble6.setX(850); //x position
        bubble6.setY(400); //y position
        bubble6.setFitHeight(30); //height 
        bubble6.setFitWidth(30); //width
        //Setting the preserve ratio of the image view 
        bubble6.setPreserveRatio(true);
        
        //To move bubble 6
        TranslateTransition translatebubble6 = new TranslateTransition();  
        //shifting the X coordinate
        translatebubble6.setByY(-800);  
        //setting the duration for the Translate transition   
        translatebubble6.setDuration(Duration.millis(1000));  
        //setting cycle count for the Translate transition   
        translatebubble6.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        //translatebubble.setAutoReverse(true);  
        //setting Cloud to transition  
        translatebubble6.setNode(bubble6);  
        //playing the transition   
        translatebubble6.play();
        
        //Add Bubble 7
        Image bubblepng7 = new Image(new FileInputStream("bubble.png"));
        ImageView bubble7 = new ImageView(bubblepng7); 
        //Setting the position/size of image
        bubble7.setX(860); //x position
        bubble7.setY(470); //y position
        bubble7.setFitHeight(30); //height 
        bubble7.setFitWidth(30); //width
        //Setting the preserve ratio of the image view 
        bubble7.setPreserveRatio(true);
        
        //To move bubble 7
        TranslateTransition translatebubble7 = new TranslateTransition();  
        //shifting the X coordinate
        translatebubble7.setByY(-1300);  
        //setting the duration for the Translate transition   
        translatebubble7.setDuration(Duration.millis(3000));  
        //setting cycle count for the Translate transition   
        translatebubble7.setCycleCount(Timeline.INDEFINITE);  
        //the transition will set to be auto reversed by setting this to true   
        //translatebubble.setAutoReverse(true);  
        //setting Cloud to transition  
        translatebubble7.setNode(bubble7);  
        //playing the transition   
        translatebubble7.play();
        
		//Add Blue Tang
		Image blueTangpng = new Image(new FileInputStream("Blue Tang.png"));
        ImageView blueTang = new ImageView(blueTangpng); 
        //Setting the position/size of the image 
        blueTang.setX(2700); //x position
        blueTang.setY(50); //y position
        blueTang.setFitHeight(200); //height 
        blueTang.setFitWidth(200); //width
        //Setting the preserve ratio of the image view 
        blueTang.setPreserveRatio(true);
        
        /*//To move the blue tang
        TranslateTransition translateBlueTang = new TranslateTransition();  
        //shifting the X coordinate
        translateBlueTang.setByX(-3500);  
        //setting the duration for the Translate transition   
        translateBlueTang.setDuration(Duration.millis(23000));  
        //setting cycle count for the Translate transition   
        translateBlueTang.setCycleCount(2);  
        //the transition will set to be auto reversed by setting this to true   
        //translateBlueTang.setAutoReverse(true);  
        //setting Cloud to transition  
        translateBlueTang.setNode(blueTang);  
        //playing the transition   
        translateBlueTang.play(); */
        
		//Add Blue fish
		Image blueFishpng = new Image(new FileInputStream("blueFish.png"));
        ImageView blueFish = new ImageView(blueFishpng); 
        //Setting the position/size of the image 
        blueFish.setX(-150); //x position
        blueFish.setY(200); //y position
        blueFish.setFitHeight(150); //height 
        blueFish.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        blueFish.setPreserveRatio(true);  
        
		//Add Angle fish
		Image angleFishpng = new Image(new FileInputStream("angleFish.png"));
        ImageView angleFish = new ImageView(angleFishpng); 
        //Setting the position/size of the image 
        angleFish.setX(1200); //x position
        angleFish.setY(500); //y position
        angleFish.setFitHeight(150); //height 
        angleFish.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        angleFish.setPreserveRatio(true);
        
        //Add Second Angle fish
        Image angleFishpng2 = new Image(new FileInputStream("angleFish.png"));
        ImageView angleFish2 = new ImageView(angleFishpng2); 
        //Setting the position/size of the image 
        angleFish2.setX(-1000); //x position
        angleFish2.setY(250); //y position
        angleFish2.setFitHeight(150); //height 
        angleFish2.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        angleFish2.setPreserveRatio(true);
        
        //Add Red Angle Fish
        Image redAngleFishpng = new Image(new FileInputStream("redAngleFish.png"));
        ImageView redAngleFish = new ImageView(redAngleFishpng); 
        //Setting the position/size of the image 
        redAngleFish.setX(1700); //x position
        redAngleFish.setY(390); //y position
        redAngleFish.setFitHeight(150); //height 
        redAngleFish.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        redAngleFish.setPreserveRatio(true);
        
        //Add Yellow Tang
		Image yellowTangpng = new Image(new FileInputStream("yellowTang.png"));
        ImageView yellowTang = new ImageView(yellowTangpng); 
        //Setting the position/size of the image 
        yellowTang.setX(-800); //x position
        yellowTang.setY(340); //y position
        yellowTang.setFitHeight(200); //height 
        yellowTang.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        yellowTang.setPreserveRatio(true);    
        
        //Add Blue yellow Fish
		Image blueYellowFishpng = new Image(new FileInputStream("blueYellowFish.png"));
        ImageView blueYellowFish = new ImageView(blueYellowFishpng); 
        //Setting the position/size of the image 
        blueYellowFish.setX(-3000); //x position
        blueYellowFish.setY(200); //y position
        blueYellowFish.setFitHeight(200); //height 
        blueYellowFish.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        blueYellowFish.setPreserveRatio(true);    
        
        //Add clownFish
        Image clownFishpng = new Image(new FileInputStream("clownFish.png"));
        ImageView clownFish = new ImageView(clownFishpng); 
        //Setting the position/size of the image 
        clownFish.setX(590); //x position
        clownFish.setY(470); //y position
        clownFish.setFitHeight(150); //height 
        clownFish.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        clownFish.setPreserveRatio(true);
        
        //Add clownFish
        Image clownFishpng2 = new Image(new FileInputStream("clownFish.png"));
        ImageView clownFish2 = new ImageView(clownFishpng2); 
        //Setting the position/size of the image 
        clownFish2.setX(2000); //x position
        clownFish2.setY(470); //y position
        clownFish2.setFitHeight(150); //height 
        clownFish2.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        clownFish2.setPreserveRatio(true); 
        
        //Add TriggerFish
        Image triggerFishpng = new Image(new FileInputStream("triggerFish.png"));
        ImageView triggerFish = new ImageView(triggerFishpng); 
        //Setting the position/size of the image 
        triggerFish.setX(1900); //x position
        triggerFish.setY(100); //y position
        triggerFish.setFitHeight(150); //height 
        triggerFish.setFitWidth(150); //width
        //Setting the preserve ratio of the image view 
        triggerFish.setPreserveRatio(true);
        
        //Move blue tang   
        Path blueTangPath = new Path();  
        blueTangPath.getElements().add (new MoveTo (4000f, 50f));  
        blueTangPath.getElements().add (new CubicCurveTo (200f, 500f, 600f, 50f, -2500, 0f));  
        PathTransition blueTangPathTransition = new PathTransition(); 
        blueTangPathTransition.setDuration(Duration.millis(35000));  
        blueTangPathTransition.setNode(blueTang); 
        blueTangPathTransition.setPath(blueTangPath);
        blueTangPathTransition.setCycleCount(2);
        blueTangPathTransition.play();  
        
        //To move the blue fish 
        TranslateTransition translateBlueFish = new TranslateTransition();  
        //shifting the X coordinate
        translateBlueFish.setByX(1700);  
        //setting the duration for the Translate transition   
        translateBlueFish.setDuration(Duration.millis(13000));  
        //setting cycle count for the Translate transition   
        translateBlueFish.setCycleCount(2);  
        //the transition will set to be auto reversed by setting this to true   
        //translateBlueFish.setAutoReverse(true);  
        //setting Cloud to transition  
        translateBlueFish.setNode(blueFish);  
        //playing the transition   
        translateBlueFish.play();
        
        //To move the angle fish 
        TranslateTransition translateAngleFish = new TranslateTransition();  
        //shifting the X coordinate
        translateAngleFish.setByX(350);  
        //setting the duration for the Translate transition   
        translateAngleFish.setDuration(Duration.millis(10000));  
        //setting cycle count for the Translate transition   
        translateAngleFish.setCycleCount(1);  
        //the transition will set to be auto reversed by setting this to true   
        translateAngleFish.setAutoReverse(true);  
        //setting Cloud to transition  
        translateAngleFish.setNode(angleFish);  
        //playing the transition   
        translateAngleFish.play();
        
        //To move the angle fish 
        TranslateTransition translateAngleFish2 = new TranslateTransition();  
        //shifting the X coordinate
        translateAngleFish2.setByX(3400);  
        //setting the duration for the Translate transition   
        translateAngleFish2.setDuration(Duration.millis(25000));  
        //setting cycle count for the Translate transition   
        translateAngleFish2.setCycleCount(2);  
        //the transition will set to be auto reversed by setting this to true   
        //translateAngleFish2.setAutoReverse(true);  
        //setting Cloud to transition  
        translateAngleFish2.setNode(angleFish2);  
        //playing the transition   
        translateAngleFish2.play();
        
        //To move the red angle fish 
        TranslateTransition translateRedAngleFish = new TranslateTransition();  
        //shifting the X coordinate
        translateRedAngleFish.setByX(-3000);  
        //setting the duration for the Translate transition   
        translateRedAngleFish.setDuration(Duration.millis(18000));  
        //setting cycle count for the Translate transition   
        translateRedAngleFish.setCycleCount(3);  
        //the transition will set to be auto reversed by setting this to true   
        //translateRedAngleFish.setAutoReverse(true);  
        //setting Cloud to transition  
        translateRedAngleFish.setNode(redAngleFish);  
        //playing the transition   
        translateRedAngleFish.play();  
        
        //Move Yellow Tang   
        Path yellowTangPath = new Path();  
        yellowTangPath.getElements().add (new MoveTo (-600f, 700f));  
        yellowTangPath.getElements().add (new CubicCurveTo (600f, 200f, 400f, 600f, 3000, 800f));  
        PathTransition yellowTangPathTransition = new PathTransition(); 
        yellowTangPathTransition.setDuration(Duration.millis(22000));  
        yellowTangPathTransition.setNode(yellowTang); 
        yellowTangPathTransition.setPath(yellowTangPath);  
        yellowTangPathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
        //setting up the cycle count   
        yellowTangPathTransition.setCycleCount(2);  
        //setting auto reverse to be true   
        //pathTransition.setAutoReverse(true);
        yellowTangPathTransition.play();
        
        //Move Blue Yellow Fish   
        Path blueYellowFishPath = new Path();  
        blueYellowFishPath.getElements().add (new MoveTo (-500f, 700f));  
        blueYellowFishPath.getElements().add (new CubicCurveTo (200f, 50f, 50f, 300f,2600, 0f));  
        PathTransition blueYellowFishPathTransition = new PathTransition(); 
        blueYellowFishPathTransition.setDuration(Duration.millis(20000));  
        blueYellowFishPathTransition.setNode(blueYellowFish); 
        blueYellowFishPathTransition.setPath(blueYellowFishPath);  
        blueYellowFishPathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
        //setting up the cycle count   
        blueYellowFishPathTransition.setCycleCount(5);  
        //setting auto reverse to be true   
        //pathTransition.setAutoReverse(true);
        blueYellowFishPathTransition.play();
        
        //To move clownfish1
        TranslateTransition translateClownFish = new TranslateTransition();  
        //shifting the X coordinate
        translateClownFish.setByX(-800);  
        //setting the duration for the Translate transition   
        translateClownFish.setDuration(Duration.millis(7000));  
        //setting cycle count for the Translate transition   
        translateClownFish.setCycleCount(1);  
        //setting Cloud to transition  
        translateClownFish.setNode(clownFish);  
        //playing the transition   
        translateClownFish.play();
        
        //Move clown fish 2   
        Path ClownFish2Path = new Path();  
        ClownFish2Path.getElements().add (new MoveTo (3500f, 600f));  
        ClownFish2Path.getElements().add (new CubicCurveTo (200f, 50f, 50f, 800f,-2500, 800f));  
        PathTransition ClownFish2PathTransition = new PathTransition(); 
        ClownFish2PathTransition.setDuration(Duration.millis(35000));  
        ClownFish2PathTransition.setNode(clownFish2); 
        ClownFish2PathTransition.setPath(ClownFish2Path);
        ClownFish2PathTransition.setCycleCount(2);
        ClownFish2PathTransition.play(); 
        
        //To move the trigger fish 
        TranslateTransition translatetriggerFish = new TranslateTransition();  
        //shifting the X coordinate
        translatetriggerFish.setByX(-8000);  
        //setting the duration for the Translate transition   
        translatetriggerFish.setDuration(Duration.millis(35000));  
        //setting cycle count for the Translate transition   
        translatetriggerFish.setCycleCount(2);  
        //the transition will set to be auto reversed by setting this to true   
        //translatetriggerFish.setAutoReverse(true);  
        //setting Cloud to transition  
        translatetriggerFish.setNode(triggerFish);  
        //playing the transition   
        translatetriggerFish.play(); 
		
        Group root = new Group(blueFish, ground, bubble, bubble2, bubble3, bubble4, bubble5, bubble6, bubble7, angleFish2, rock, rock3, 
        						coral, rock2, blueTang, seaweed2, clownFish2, seaweed3, yellowTang, seaweed, clownFish, angleFish, 
        						blueYellowFish, redAngleFish, triggerFish);
        
        //Can also use this line to add items into the scene:
        //root.getChildren().addAll(blueFish);
        Scene scene = new Scene(root, 1500, 800);
        // set background 
        scene.setFill(Paint.valueOf("#3873d9"));
        
        stage.setTitle("Emily's Aquarium");
        stage.setScene(scene);
        stage.show();
	}
}
