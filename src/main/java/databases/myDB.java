package databases;

import javax.activation.DataSource;
import javax.naming.InitialContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myDB {
    private static Connection conn;
    private static InitialContext ic;
    private static DataSource ds;
    static  final String url="jdbc:postgresql://localhost:5432/weather?currentSchema=weather";
    static   final String name="postgres";
    static  final String password="100987";

    private myDB() {
    }
    private static myDB instance;

    public static myDB getInstance() {
        if (instance == null) {
            instance = new myDB();
        }

        return instance;
    }

    public Connection getConnection() {

        try {

            if (conn == null || conn.isClosed()) {

                conn= DriverManager.getConnection(url,name,password);
//                System.out.println("We are connected");
            }

        } catch (SQLException ex) {
          ex.printStackTrace();
        }

        return conn;
    }
    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
//                System.out.println("Connection is closed");

            } catch (SQLException ex) {
              ex.printStackTrace();
            }
        }
    }

}
