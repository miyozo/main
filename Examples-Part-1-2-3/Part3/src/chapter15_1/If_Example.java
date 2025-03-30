package chapter15_1;
import java.time.LocalDate;

public class If_Example {

	public static void main(String[] args) {
		
		var info = new WeatherInfo(LocalDate.now(), Weather.SUNNY);
		
		if(info.getWeather()==Weather.SUNNY) {
			System.out.println(info.getDate() + ": 晴れ");
		}
	}

}
