package jsample.model;

public class Fruit {

	public enum Season {
		WINTER, SUMMER, SPRING, AUTUMN
	}

	private String name;
	private Season fruitSeason;
	private double price;

	public Fruit(String name, Season fruitSeason, double price) {
		this.name = name;
		this.fruitSeason = fruitSeason;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Season getFruitSeason() {
		return fruitSeason;
	}

	public void setFruitSeason(Season fruitSeason) {
		this.fruitSeason = fruitSeason;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fruit [name=").append(name).append(", fruitSeason=").append(fruitSeason).append(", price=")
				.append(price).append("]");
		return builder.toString();
	}
}
