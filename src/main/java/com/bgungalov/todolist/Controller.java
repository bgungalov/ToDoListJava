package com.bgungalov.todolist;

import com.bgungalov.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card",
                "Buy a 30th birthday card",
                LocalDate.of(2021, Month.OCTOBER,25));
        TodoItem item2 = new TodoItem("Doctors appointment",
                "See doctor at 123 str",
                LocalDate.of(2021, Month.SEPTEMBER,15));
        TodoItem item3 = new TodoItem("Finish design",
                "Buy a 30th birthday card",
                LocalDate.of(2021, Month.MARCH,25));
        TodoItem item4 = new TodoItem("Mail birthday card",
                "Buy a 30th birthday card",
                LocalDate.of(2021, Month.OCTOBER,25));
        TodoItem item5 = new TodoItem("Mail birthday card",
                "Buy a 30th birthday card",
                LocalDate.of(2021, Month.OCTOBER,25));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(sb.toString());
    }
}