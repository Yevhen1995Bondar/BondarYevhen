package ua.bondar.hw36;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class task1 {
    private static final int THREAD_COUNT = 50;
    private static final CountDownLatch latch = new CountDownLatch(THREAD_COUNT);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            final int threadNumber = i;
            executorService.submit(() -> {
                try {
                    latch.await(); // Ждем, пока все потоки запустятся
                    System.out.println("Hello from thread " + threadNumber);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            latch.countDown(); // Уменьшаем счетчик, чтобы потоки могли начать выполнение
        }

        executorService.shutdown();
    }
}
