module fr.univ.orleans.pnt {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.univ.orleans.pnt to javafx.fxml;
    exports fr.univ.orleans.pnt;
}