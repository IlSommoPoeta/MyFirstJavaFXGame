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
    public static long prev = 0;
    public static int mousex = 0, mousey = 0;

    @Override
    public void start(Stage primaryStage) {
        HBox h = new HBox();
        Scene s = new Scene(h, 1280, 720);
        Canvas c = new Canvas(s.getWidth(), s.getHeight());
        primaryStage.setScene(s);

        GraphicsContext gc = c.getGraphicsContext2D();
        gc.setFill(Color.RED);
        AnimationTimer t = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (now - prev > 1) {
                    gc.clearRect(0, 0, s.getWidth(), s.getHeight());
                    n = n + 5;
                    gc.fillOval(mousex-25, mousey-25, 50, 50);
                    System.out.println(((now - prev)/1000)/1000);
                    prev = now;

                }

            }
        };

        c.setOnMouseMoved(f -> {
            mousex = (int) f.getX();
            mousey = (int) f.getY();
        });

        t.start();

        primaryStage.show();
        h.getChildren().addAll(c);
    }
}
