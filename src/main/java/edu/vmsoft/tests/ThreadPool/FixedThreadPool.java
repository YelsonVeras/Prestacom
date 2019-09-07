package edu.vmsoft.tests.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    private ExecutorService executor = Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws InterruptedException {
        FixedThreadPool t1 = new FixedThreadPool();
        for (int i = 0; i < 100; i++) {
            t1.asyncTask(i);
        }
        System.out.println("---------------");
    }

    public void asyncTask(final int i) throws InterruptedException {
        executor.submit(() -> {
            try {
                Thread.sleep(1000);//方便观察结果
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第" + i);
        });

    }
}
