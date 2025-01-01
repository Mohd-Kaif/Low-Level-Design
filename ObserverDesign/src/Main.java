import Observer.*;
import Subject.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new phoneDisplay();
        Observer TVDisplay = new TVDisplay();

        weatherStation.addObserver(TVDisplay);
        weatherStation.addObserver(phoneDisplay);

        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
    }
}
