package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import pojo.Arrow;
import pojo.Node;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        int level = 1;
        double w = 1000, pr = 2.0, f = 1.0;
        final Node node11 = new Node(w / pr * f, 1, "1");

        level++;
        f = 1.0;
        final Node
                node21 = new Node(w / (pr *= 2) * f, 2 * level - 1, "2.1"),
                node22 = new Node(w / pr * (f += 2), 2 * level - 1, "2.2");

        level++;
        f = 1.0;
        final Node
                node31 = new Node(w / (pr *= 2) * f, 2 * level - 1, "3.1"),
                node32 = new Node(w / pr * (f += 2), 2 * level - 1, "3.2"),
                node33 = new Node(w / pr * (f += 2), 2 * level - 1, "3.3"),
                node34 = new Node(w / pr * (f += 2), 2 * level - 1, "3.4");

        level++;
        f = 1.0;
        final Node
                node41 = new Node(w / (pr *= 2) * f, 2 * level - 1, "4.1"),
                node42 = new Node(w / pr * (f += 2), 2 * level - 1, "4.2"),
                node43 = new Node(w / pr * (f += 2), 2 * level - 1, "4.3"),
                node44 = new Node(w / pr * (f += 2), 2 * level - 1, "4.4"),
                node45 = new Node(w / pr * (f += 2), 2 * level - 1, "4.5"),
                node46 = new Node(w / pr * (f += 2), 2 * level - 1, "4.6"),
                node47 = new Node(w / pr * (f += 2), 2 * level - 1, "4.7"),
                node48 = new Node(w / pr * (f += 2), 2 * level - 1, "4.8");

        level++;
        f = 1.0;
        final Node
                node51 = new Node(w / (pr *= 2) * f, 2 * level - 1, "5.1"),
                node52 = new Node(w / pr * (f += 2), 2 * level - 1, "5.2"),
                node53 = new Node(w / pr * (f += 2), 2 * level - 1, "5.3"),
                node54 = new Node(w / pr * (f += 2), 2 * level - 1, "5.4"),
                node55 = new Node(w / pr * (f += 2), 2 * level - 1, "5.5"),
                node56 = new Node(w / pr * (f += 2), 2 * level - 1, "5.6"),
                node57 = new Node(w / pr * (f += 2), 2 * level - 1, "5.7"),
                node58 = new Node(w / pr * (f += 2), 2 * level - 1, "5.8"),
                node5A = new Node(w / pr * (f += 2), 2 * level - 1, "5.A"),
                node5B = new Node(w / pr * (f += 2), 2 * level - 1, "5.B"),
                node5C = new Node(w / pr * (f += 2), 2 * level - 1, "5.C"),
                node5D = new Node(w / pr * (f += 2), 2 * level - 1, "5.D"),
                node5E = new Node(w / pr * (f += 2), 2 * level - 1, "5.E"),
                node5F = new Node(w / pr * (f += 2), 2 * level - 1, "5.F"),
                node5G = new Node(w / pr * (f += 2), 2 * level - 1, "5.G"),
                node5H = new Node(w / pr * (f += 2), 2 * level - 1, "5.H");


        final Arrow
                arr11 = Arrow.between(node11, node21),
                arr12 = Arrow.between(node11, node22),

                arr21 = Arrow.between(node21, node31),
                arr22 = Arrow.between(node21, node32),
                arr23 = Arrow.between(node22, node33),
                arr24 = Arrow.between(node22, node34),

                arr31 = Arrow.between(node31, node41),
                arr32 = Arrow.between(node31, node42),
                arr33 = Arrow.between(node32, node43),
                arr34 = Arrow.between(node32, node44),
                arr35 = Arrow.between(node33, node45),
                arr36 = Arrow.between(node33, node46),
                arr37 = Arrow.between(node34, node47),
                arr38 = Arrow.between(node34, node48),

                arr41 = Arrow.between(node41, node51),
                arr42 = Arrow.between(node41, node52),
                arr43 = Arrow.between(node42, node53),
                arr44 = Arrow.between(node42, node54),
                arr45 = Arrow.between(node43, node55),
                arr46 = Arrow.between(node43, node56),
                arr47 = Arrow.between(node44, node57),
                arr48 = Arrow.between(node44, node58),
                arr4A = Arrow.between(node45, node5A),
                arr4B = Arrow.between(node45, node5B),
                arr4C = Arrow.between(node46, node5C),
                arr4D = Arrow.between(node46, node5D),
                arr4E = Arrow.between(node47, node5E),
                arr4F = Arrow.between(node47, node5F),
                arr4G = Arrow.between(node48, node5G),
                arr4H = Arrow.between(node48, node5H);

        Label label = new Label("BST Visualizer");
        label.setFont(Font.font(30));
        label.setPadding(new Insets(10));

        //Creating a Group object
        Group root = new Group(
                label,
                arr11, arr12,
                arr21, arr22, arr23, arr24,
                arr31, arr32, arr33, arr34, arr35, arr36, arr37, arr38,
                arr41, arr42, arr43, arr44, arr45, arr46, arr47, arr48, arr4A, arr4B, arr4C, arr4D, arr4E, arr4F, arr4G, arr4H,

                node11,
                node21, node22,
                node31, node32, node33, node34,
                node41, node42, node43, node44, node45, node46, node47, node48,
                node51, node52, node53, node54, node55, node56, node57, node58, node5A, node5B, node5C, node5D, node5E, node5F, node5G, node5H);


        primaryStage.setTitle("BST Visualizer");
        primaryStage.setScene(new Scene(root, w, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
    50, 26, 66, 52, 81, 80, 56, 33, 87, 49, 79, 44, 40, 72, 46, 83, 58, 13, 25, 42, 8, 74, 11, 35, 22, 4,
    78, 82, 31, 23, 90, 76, 99, 2, 21, 85, 37, 7, 71, 88, 51, 64, 60, 12, 5, 10, 28, 54, 53, 97, 96, 69,
    30, 14, 3, 65, 57, 38, 48, 77, 47, 43, 68, 18, 19, 15, 27, 67, 59
*/