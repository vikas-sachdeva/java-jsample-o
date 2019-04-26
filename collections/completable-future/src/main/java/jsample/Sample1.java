package jsample;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Sample1 {

	public void runAsyncSample() throws InterruptedException, ExecutionException {

		CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("runAsyncSample " + Thread.currentThread().getName());
		});
		completableFuture.get();
	}

	public void supplyAsyncSample() throws InterruptedException, ExecutionException {

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String message = "supplyAsyncSample " + Thread.currentThread().getName();
			System.out.println(message);
			return message;
		});
		String msg = completableFuture.get();
		System.out.println("supplyAsyncSample return value " + msg);
	}

	public void thenApplySample() throws InterruptedException, ExecutionException {

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String message = "supplyAsyncSample " + Thread.currentThread().getName();
			System.out.println(message);
			return message;
		});
		CompletableFuture<String> updatedCompletableFuture = completableFuture.thenApply(message -> {
			String updatedMessage = "thenApplySample " + Thread.currentThread().getName();
			System.out.println(updatedMessage);
			return updatedMessage;
		});
		String msg = updatedCompletableFuture.get();
		System.out.println("thenApplySample return value " + msg);
	}

	public void thenApplythenApplySample() throws InterruptedException, ExecutionException {

		CompletableFuture<String> updatedCompletableFuture = CompletableFuture.supplyAsync(() -> {

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String message = "supplyAsyncSample " + Thread.currentThread().getName();
			System.out.println(message);
			return message;
		}).thenApply(message -> {
			String updatedMessage = "thenApplythenApplySample1 " + Thread.currentThread().getName();
			System.out.println(updatedMessage);
			return updatedMessage;
		}).thenApply(message -> {
			String updatedMessage = "thenApplythenApplySample2 " + Thread.currentThread().getName();
			System.out.println(updatedMessage);
			return updatedMessage;
		});
		String msg = updatedCompletableFuture.get();
		System.out.println("thenApplySample return value " + msg);
	}

	public void thenAcceptSample() throws InterruptedException, ExecutionException {

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String message = "supplyAsyncSample " + Thread.currentThread().getName();
			System.out.println(message);
			return message;
		});
		CompletableFuture<Void> updatedCompletableFuture = completableFuture.thenAccept(message -> {
			String updatedMessage = "thenAcceptSample " + Thread.currentThread().getName();
			System.out.println(updatedMessage);
		});
		updatedCompletableFuture.get();
	}

	public void thenRunSample() throws InterruptedException, ExecutionException {

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String message = "supplyAsyncSample " + Thread.currentThread().getName();
			System.out.println(message);
			return message;
		});
		CompletableFuture<Void> updatedCompletableFuture = completableFuture.thenRun(() -> {
			String updatedMessage = "thenRunSample " + Thread.currentThread().getName();
			System.out.println(updatedMessage);
		});
		updatedCompletableFuture.get();
	}
}
