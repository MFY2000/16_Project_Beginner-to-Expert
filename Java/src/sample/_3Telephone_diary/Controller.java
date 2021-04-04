package sample._3Telephone_diary;

import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TreeTableColumn NO;
    public TreeTableColumn Full_Name;
    public TreeTableColumn TypeOFData;
    public TreeTableColumn Phone_Number;

    public TextField F_name;
    public TextField L_name;
    public TextField Cell_Number;
    public ComboBox Type;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
