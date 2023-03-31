package observer.main;

import observers.consumers.NewsPaper;
import observers.consumers.TvChannel;
import subject.impl.WeatherStation;

public class TestObserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvChannel observer1 = new TvChannel(); // subscriber
		NewsPaper observer2 = new NewsPaper(); // subscriber
		TvChannel observer3 = new TvChannel();
	
		WeatherStation weatherStation = new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		weatherStation.addObserver(observer3);

		weatherStation.setTemparature(30);

		// weatherStation.removeObserver(observer1);

	}

}
