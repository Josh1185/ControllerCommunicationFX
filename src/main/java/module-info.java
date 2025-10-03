module com.example.controllercommunicationfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controllercommunicationfx to javafx.fxml;
    exports com.example.controllercommunicationfx;
}