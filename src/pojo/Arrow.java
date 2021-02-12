package pojo;

import javafx.scene.shape.Line;

public class Arrow extends Line implements Props {

    public Arrow(double startX, double startY, double endX, double endY) {
        super(startX, startY, endX, endY);
        this.setStrokeWidth(strokeWidth);
        this.setStroke(stroke);
    }

    public static Arrow between(Node start, Node end) {
        final Coords coords = new Coords(start, end);
        final Arrow arrow = new Arrow(coords.sX, coords.sY, coords.eX, coords.eY);

        start.draggable.arrowsMap.put(arrow, Pos.START);
        end.draggable.arrowsMap.put(arrow, Pos.END);

        return arrow;
    }

    public void update(double x, double y, Pos pos) {
        if (pos == Pos.START) {
            this.setStartX(x + r);
            this.setStartY(y + r);
        } else {
            this.setEndX(x + r);
            this.setEndY(y + r);
        }
    }
}