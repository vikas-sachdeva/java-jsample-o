package jsample;

import java.util.concurrent.ExecutionException;

public class App {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Sample1 sample1 = new Sample1();
		sample1.runAsyncSample();
		sample1.supplyAsyncSample();
		sample1.thenApplySample();
		sample1.thenApplythenApplySample();
		sample1.thenAcceptSample();
		sample1.thenRunSample();
		
	}
}
