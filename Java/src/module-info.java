module Java {
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;

    opens sample;
    opens sample._2Note_app;
    opens sample._3Telephone_diary;
}