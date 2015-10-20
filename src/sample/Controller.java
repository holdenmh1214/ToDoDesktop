package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<TodoItem> items = FXCollections.observableArrayList();

    @FXML
    TextField textField;

    @FXML
    ListView listView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(items);

    }

    public void addItem(){
        TodoItem item = new TodoItem(textField.getText(),false);
        items.add(item);
        textField.setText("");
    }

    public void toggleItem() {
        TodoItem item = (TodoItem) listView.getSelectionModel().getSelectedItem();
        if (item != null) {

            item.isDone = !item.isDone;

            //force listview to refresh
            listView.setItems(null);
            listView.setItems(items);
        }
    }
}
