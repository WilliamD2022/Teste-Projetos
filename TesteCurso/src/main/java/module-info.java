module com.example.testecurso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testecurso to javafx.fxml;
    exports com.example.testecurso;
}