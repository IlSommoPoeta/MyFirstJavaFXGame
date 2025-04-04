module it.ilsommopoeta.myfirstjavafxgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.ilsommopoeta.myfirstjavafxgame to javafx.fxml;
    exports it.ilsommopoeta.myfirstjavafxgame;
}