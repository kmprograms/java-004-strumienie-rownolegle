package pl.kmprograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        int licznik[] = {0};
        for (int i = 0; i < 10; i++) {
            Runnable runnable = () -> {
                for (int j = 0; j < 1000000; j++) {
                    ++licznik[0];
                }
                System.out.println(licznik[0]);
            };
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }
}
