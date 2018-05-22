package references;

public class CityWeather {
    private CityStatus status;
    private String state;
    private String city;
    private String weatherStationCity;
    private int weatherID;
    private String description;
    private String temperature;
    private String relativeHumidity;
    private String windDirectionAndSpeed;
    private String pressure;
    private String dateCity;

    public String getDateCity() {
        return dateCity;
    }

    public void setDateCity(String dateCity) {
        this.dateCity = dateCity;
    }

    @Override
    public String toString() {
        return "CityWeather{" +
                "status=" + status +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", weatherStationCity='" + weatherStationCity + '\'' +
                ", weatherID=" + weatherID +
                ", description='" + description + '\'' +
                ", temperature='" + temperature + '\'' +
                ", relativeHumidity='" + relativeHumidity + '\'' +
                ", windDirectionAndSpeed='" + windDirectionAndSpeed + '\'' +
                ", pressure='" + pressure + '\'' +
                ", dateCity='" + dateCity + '\'' +
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

    public int getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getWindDirectionAndSpeed() {
        return windDirectionAndSpeed;
    }

    public void setWindDirectionAndSpeed(String windDirectionAndSpeed) {
        this.windDirectionAndSpeed = windDirectionAndSpeed;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}
