package pojo;

import javafx.scene.Cursor;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Props {

    Paint
            fill = Color.web("F1F5F9"),
            stroke = Color.web("A1A5A9");
    double
            r = 20,
            strokeWidth = 1;

    class Coords {
        final double sX, sY, eX, eY;

        public Coords(Node start, Node end) {
            final Circle
                    sc = (Circle) start.getChildren().get(0),
                    ec = (Circle) end.getChildren().get(0);

            this.sX = sc.getCenterX();
            this.sY = sc.getCenterY();
            this.eX = ec.getCenterX();
            this.eY = ec.getCenterY();
        }
    }

    enum Pos {START, END}

    class Draggable {
        double
                shapeX = 0,
                shapeY = 0,
                mouseX = 0,
                mouseY = 0;

        final Map<Arrow, Pos> arrowsMap;

        public Draggable(javafx.scene.Node shape) {
            arrowsMap = new HashMap<>();
            shape.setCursor(Cursor.HAND);

            shape.onMousePressedProperty().set(event -> {
                mouseX = event.getSceneX();
                mouseY = event.getSceneY();

                shapeX = shape.getLayoutX();
                shapeY = shape.getLayoutY();
            });

            //Event Listener for MouseDragged
            shape.onMouseDraggedProperty().set(event -> {
                shape.setLayoutX(shapeX += event.getSceneX() - mouseX);
                shape.setLayoutY(shapeY += event.getSceneY() - mouseY);

                // again set current Mouse shapeX AND shapeY position
                mouseX = event.getSceneX();
                mouseY = event.getSceneY();

                if (!arrowsMap.isEmpty()) arrowsMap.forEach((arrow, pos) -> arrow.update(shapeX, shapeY, pos));

                onDrag();
                event.consume();
            });
        }

        public void onDrag() {
        }
    }
}