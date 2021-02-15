package pojo;

import javafx.scene.shape.Circle;

public class Coords {

    final double sX, sY, eX, eY;

    public Coords(Node start, Node end) {
        final Circle
                sc = start.getCircle(),
                ec = end.getCircle();

        this.sX = sc.getCenterX();
        this.sY = sc.getCenterY();
        this.eX = ec.getCenterX();
        this.eY = ec.getCenterY();
    }
}