module org.filippo.classtsaver {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.filippo.classtsaver to javafx.fxml;
    exports org.filippo.classtsaver;
}