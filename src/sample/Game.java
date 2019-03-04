package sample;

import javafx.application.Application;


import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;



import static javafx.scene.paint.Color.BLUE;

public class Game extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Palette palette = new Palette(400, 585, 200, 15);
        Ball ball =new Ball(500,575,10);
        root.getChildren().add(palette);
        root.getChildren().add(ball);

        Scene scene = new Scene(root, 1000, 600, BLUE); //to ma zostac



        root.addEventHandler(MouseEvent.MOUSE_MOVED, palette.paletteMove);
        root.addEventHandler(MouseEvent.MOUSE_MOVED, palette.paletteMove);
        root.addEventHandler(MouseEvent.MOUSE_CLICKED, ball.ballMove);
        stage.setScene(scene);
        stage.setTitle("Sinoid");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);


    }
}
