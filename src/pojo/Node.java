package pojo;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;

public class Node extends StackPane implements Props {

    private final String value;
    final Draggable draggable;

    public Node(double cx, double cy, String value) {
        this.value = value;

        Circle circle = new Circle(cx, cy * 2 * r, r, fill);
        circle.setStrokeWidth(strokeWidth);
        circle.setStroke(stroke);

        Text text = new Text(getValue());
        text.setBoundsType(TextBoundsType.VISUAL);
        text.setFont(Font.font(16));

        setLayoutX(circle.getCenterX() - r);
        setLayoutY(circle.getCenterY() - r);
        getChildren().addAll(circle, text);

        draggable = new Draggable(this);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{value='" + value + "'}";
    }
}