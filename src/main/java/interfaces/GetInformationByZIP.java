package interfaces;

import references.CityForecast;
import references.CityStatus;
import references.CityWeather;
import references.WeatherInformation;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface GetInformationByZIP {


    @WebMethod
    CityForecast GetCityForecastByZIP(String ZIP);
    @WebMethod
    CityWeather GetCityWeatherByZIP(String ZIP);

    WeatherInformation GetWeatherInformation(int ID);
    int getWeatherDescFromJson(String weatherJson) throws Exception;
    @WebMethod
    CityStatus SaveCityWeatherByZIPandDate(String ZIP, String date);





}
