package sample._2Note_app;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class NotePad_Function implements Initializable {
    public TextField Input_feild;

    String path = "C:\\Users\\MF\\Desktop\\16_Project_Beginner-to-Expert\\Resources\\TXT\\";


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void clear(ActionEvent actionEvent) {
        Input_feild.setText("");
    }

    public void readFile() throws IOException {
        String value = null;
        File myObj = new File(path+"File.txt");
        if (myObj.exists()) {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
                value = myReader.nextLine();
            myReader.close();
        }

        Input_feild.setText(value);
    }


    public void Save_File(ActionEvent actionEvent) throws IOException {
        String Value =  Input_feild.getText();

        File myObj = new File(path+"File.txt");
        if (myObj.exists()) {
            FileWriter myWriter = new FileWriter(path+"File.txt");
            myWriter.write(Value);
            myWriter.close();
        }



    }


    public void SaveAS_File(ActionEvent actionEvent) {


    }
}
