package jsample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import jsample.model.Fruit;
import jsample.model.Fruit.Season;

public class Sample1 {

	private final List<Fruit> fruites = new ArrayList<>();

	public Sample1() {
		fruites.add(new Fruit("fruit-1", Fruit.Season.AUTUMN, 20.0));
		fruites.add(new Fruit("fruit-2", Fruit.Season.SPRING, 25.0));
		fruites.add(new Fruit("fruit-3", Fruit.Season.SUMMER, 22.0));
		fruites.add(new Fruit("fruit-4", Fruit.Season.AUTUMN, 10.0));
		fruites.add(new Fruit("fruit-4", Fruit.Season.AUTUMN, 12.0));

	}

	public Map<Season, List<Fruit>> getFruitesGroupBySeason() {
		return fruites.stream().collect(Collectors.groupingBy((x) -> x.getFruitSeason()));
	}

	public Map<Season, Double> getAveragePriceGroupBySeason() {
		return fruites.stream().collect(
				Collectors.groupingBy((x) -> x.getFruitSeason(), Collectors.averagingDouble(y -> y.getPrice())));

	}
}
