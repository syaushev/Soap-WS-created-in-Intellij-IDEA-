package databases;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZipDB {
    public ZipDB() {
    }
    private static ZipDB instance;

    public static ZipDB getInstance() {
        if (instance == null) {
            instance = new ZipDB();
        }

        return instance;
    }

    public ResultSet getRS() throws SQLException {
        Connection conn = myDB.getInstance().getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM zipcodes");
        ResultSet rs = stmt.executeQuery();

        return rs;
    }






}
