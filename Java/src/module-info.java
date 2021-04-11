module Java {
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
//    requires mysql.connector;
//    requires mssql.jdbc;

    requires java.sql;


    opens sample;
    opens sample._2Note_app;
    opens sample._3Telephone_diary;
    opens sample._4Tic_toc_toe;
}