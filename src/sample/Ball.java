package sample;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

import static javafx.scene.paint.Color.RED;

public class Ball extends Circle {

    public Ball(int x, int y, int radius) {
        super(x, y, radius);
        this.setFill(RED);
    }


    EventHandler<MouseEvent> ballMove = e ->
    {
        int xSpeed = 10;
        int ySpeed = 10;
        Line line = new Line();

        line.setStartX(this.getCenterX());
        line.setStartY(this.getCenterY());
        // if (this.getCenterY()<=0)
        //  ySpeed=-ySpeed;
//        if (this.getCenterX()<=0)
//            xSpeed=-xSpeed;
        this.setCenterX(line.getEndX() + xSpeed);
        this.setCenterY(line.getEndY() - ySpeed);

        line.setEndX(this.getCenterX());
        line.setEndY(this.getCenterY());

        PathTransition transition = new PathTransition();
        transition.setNode(this);
        transition.setDuration(Duration.seconds(3));
        transition.setPath(line);

        transition.play();


        // poczatkowa predkosc składowe Y stała jakas X zalezne od ruchu paletka
        // przy kolizj zmiana x na przeciwny gdy uderzy w pion y w przeciwny gdy uderzy w poziom
        //jak minie Y=600 looser


    };
}

