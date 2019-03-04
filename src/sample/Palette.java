package sample;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;;
import static javafx.scene.paint.Color.MAGENTA;
import static javafx.scene.paint.Color.TOMATO;

public class Palette extends Rectangle {

    public Palette(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.setFill(MAGENTA);
    }

    EventHandler<MouseEvent> paletteMove = e -> {
       this.setX(e.getX());

        if (this.getX()>800) this.setX(800);
    };

}



