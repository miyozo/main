package chapter15_1;
import java.time.LocalDate;

public class WeatherInfo {
	private LocalDate date;
	private Weather weather;
	
	public WeatherInfo(LocalDate date, Weather weather) {
		this.date = date;
		this.weather = weather;
	}

	public LocalDate getDate() {
		return date;
	}

	public Weather getWeather() {
		return weather;
	}
	
	
}
