package ua.bondar.hw36;

import java.util.concurrent.*;

public class PrimeNumberCounter {
    private static final int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    private static final int THREAD_COUNT = 2;
    private static final CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
    private static int totalPrimeCount = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            final int startIndex = i * (numbers.length / THREAD_COUNT);
            final int endIndex = (i == THREAD_COUNT - 1) ? numbers.length : (i + 1) * (numbers.length / THREAD_COUNT);

            executorService.submit(() -> {
                int localPrimeCount = countPrimesInRange(startIndex, endIndex);
                updateTotalPrimeCount(localPrimeCount);
                latch.countDown();
            });
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        System.out.println("Total prime count: " + totalPrimeCount);
    }

    private static int countPrimesInRange(int start, int end) {
        int primeCount = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(numbers[i])) {
                primeCount++;
            }
        }
        return primeCount;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static synchronized void updateTotalPrimeCount(int localPrimeCount) {
        totalPrimeCount += localPrimeCount;
    }
}
