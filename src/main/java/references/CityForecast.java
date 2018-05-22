package references;

import java.util.Calendar;


public class CityForecast{
    private CityStatus status;
    private String state;
    private String city;
    private String weatherStationCity;
    private String date;

    @Override
    public String toString() {
        return "CityForecast{" +
                "status=" + status +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", weatherStationCity='" + weatherStationCity + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public CityStatus getStatus() {
        return status;
    }

    public void setStatus(CityStatus status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeatherStationCity() {
        return weatherStationCity;
    }

    public void setWeatherStationCity(String weatherStationCity) {
        this.weatherStationCity = weatherStationCity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
