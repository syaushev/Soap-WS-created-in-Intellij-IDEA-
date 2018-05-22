package databases;

import references.CityStatus;
import references.CityWeather;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SavedWeatherDB {
    public SavedWeatherDB() {
    }


    public CityStatus SaveWeather(CityWeather cityWeather, String ZIP)  {
        Connection conn = myDB.getInstance().getConnection();
        CityStatus cityStatus=new CityStatus();


        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO weather_info (city, weatherid, zip, state, description, relativehumid, success, response_text, temp, date, wind) VALUES (?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1,cityWeather.getCity());
            stmt.setInt(2, cityWeather.getWeatherID());
            stmt.setString(3,ZIP);
            stmt.setString(4,cityWeather.getState());
            stmt.setString(5,cityWeather.getDescription());
            stmt.setString(6,cityWeather.getRelativeHumidity());
            stmt.setString(7,cityWeather.getStatus().getSuccess());
            stmt.setString(8,cityWeather.getStatus().getResponseText());
            stmt.setString(9,cityWeather.getTemperature());
            stmt.setString(10,cityWeather.getDateCity());
            stmt.setString(11,cityWeather.getWindDirectionAndSpeed());

            stmt.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
            cityStatus.setSuccess("false");
            cityStatus.setResponseText("Smth went wrong");

        }

        return cityStatus;


    }



}
