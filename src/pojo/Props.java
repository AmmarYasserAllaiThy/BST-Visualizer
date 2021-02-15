package pojo;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public interface Props {

    Paint
            fill = Color.web("F1F5F9"),
            stroke = Color.web("A1A5A9");
    double
            r = 20,
            strokeWidth = 1;

    enum Pos {START, END}

}