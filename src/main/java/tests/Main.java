package tests;


import com.google.gson.*;

import com.google.gson.reflect.TypeToken;
import interfaces.GetInformationByZIPImpl;
import references.CityForecast;
import references.CityWeather;

import java.util.HashMap;
import java.util.Map;



public class Main {

    public static Map<String, Object> jsonToMap(String str){
        Map<String ,Object> map=new Gson().fromJson(str,new TypeToken<HashMap<String,Object>>(){}.getType());
        return map;
    }



    public static void main(String[] args) {


        GetInformationByZIPImpl getInformationByZIP=new GetInformationByZIPImpl();

        //Тест метода GetCityForecastByZIP
//        CityForecast myweather=getInformationByZIP.GetCityForecastByZIP("12345");
//         System.out.println(myweather);


//        //Тест метода GetCityWeatherByZip
//        CityWeather cityWeather=getInformationByZIP.GetCityWeatherByZIP("11111");
//        System.out.println(cityWeather);


        //Тест метода SaveCityWeatherByZipAndDate
        System.out.println(getInformationByZIP.SaveCityWeatherByZIPandDate("11111","2018-03-29 00:00:00"));









    }


    }

