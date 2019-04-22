package jsample;

public class App {
	public static void main(String[] args) {
		Sample1 sample1 = new Sample1();

		sample1.getFruitesGroupBySeason().entrySet().forEach(x -> System.out.println(x));
		System.out.println("\n");
		sample1.getAveragePriceGroupBySeason().entrySet().forEach(x -> System.out.println(x));

	}
}