module com.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bgungalov.todolist to javafx.fxml;
    exports com.bgungalov.todolist;
}