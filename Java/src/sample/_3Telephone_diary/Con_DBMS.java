package sample._3Telephone_diary;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Con_DBMS {
//    public Connection connection;
//    public Statement statement;
//    public ResultSet result;

    // Replace below database url, username and password with your actual database credentials
//    private static final String DATABASE_URL = "jdbc:mysql://localhost/javalogin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//    private static final String DATABASE_USERNAME = "root";
//    private static final String DATABASE_PASSWORD = "";
//    private static final String INSERT_QUERY = "INSERT INTO `resultofquiz` (`id`,`UserId`, `QuizName`, `TotalQuestion`, `NoOfQuestionCorrect`, `Percentage`, `Time`) VALUES (NULL,?,?, ?, ?, ?, ?)";
//    private static final String SELECT_QUERY_LOGIN = "SELECT * FROM login WHERE email_id = ? and password = ?";

    public Con_DBMS(){
//        // load and register JDBC driver for MySQL
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
//            statement = connection.createStatement();
//        } catch (ClassNotFoundException | SQLException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
//        }
    }
}

class JdbcSQLServerConnection {

    public static void main(String[] args) {

        Connection conn = null;

        try {

            String dbURL = "jdbc:sqlserver://localhost\\sqlexpress;dataName=TODO_list";
            String user = "M_Fahad";
            String pass = "123456";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}