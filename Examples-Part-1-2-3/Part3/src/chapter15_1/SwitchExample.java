package chapter15_1;
import java.time.LocalDate;

public class SwitchExample {

	public static void main(String[] args) {
		
		var info = new WeatherInfo(LocalDate.now(), Weather.SUNNY);
		
		String message = switch(info.getWeather()) {
			case SUNNY	->	info.getDate() + "晴れ";
			case CLOUDY ->	info.getDate() + "曇り";
			default		->	info.getDate() + "雨";
		};
		System.out.println(message);
	}

}
