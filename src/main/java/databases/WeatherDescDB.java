package databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WeatherDescDB {
    public WeatherDescDB() {
    }

    public String getWeatherDesc(int id) throws SQLException {
        Connection conn = myDB.getInstance().getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM weatherimages WHERE id=?");
        stmt.setInt(1,id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getString("description");
    }
}
