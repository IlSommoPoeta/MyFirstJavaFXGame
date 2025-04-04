package it.ilsommopoeta.myfirstjavafxgame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GiocoSommico extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public static int n = 0;

    @Override
    public void start(Stage primaryStage) {
        HBox h = new HBox();
        Scene s = new Scene(h, 1280, 720);
        Canvas c = new Canvas(s.getWidth(), s.getHeight());
        primaryStage.setScene(s);

        GraphicsContext gc = c.getGraphicsContext2D();
        AnimationTimer t = new AnimationTimer() {
            @Override
            public void handle(long now) {
                gc.clearRect(0, 0, 800, 800);
                gc.setFill(Color.RED);
                n = n + 1;
                gc.fillOval(n, 50, 50, 50);
            }
        };
        t.start();

        primaryStage.show();
        h.getChildren().addAll(c);
    }
}
