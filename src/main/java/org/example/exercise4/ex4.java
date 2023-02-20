package org.example.exercise4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ex4 {
    public static void main(String[] args) {
        class Impl implements ExecutorService{
            final ExecutorService executor;

            public Impl(int threadsNum) {
                executor = Executors.newFixedThreadPool(threadsNum);
            }

            @Override
            public void shutdown() {
                executor.shutdown();
            }

            @Override
            public List<Runnable> shutdownNow() {
                return executor.shutdownNow();
            }

            @Override
            public boolean isShutdown() {
                return executor.isShutdown();
            }

            @Override
            public boolean isTerminated() {
                return executor.isTerminated();
            }

            @Override
            public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
                return executor.awaitTermination(timeout, unit);
            }

            @Override
            public <T> Future<T> submit(Callable<T> task) {
                return executor.submit(task);
            }

            @Override
            public <T> Future<T> submit(Runnable task, T result) {
                return executor.submit(task, result);
            }

            @Override
            public Future<?> submit(Runnable task) {
                return executor.submit(task);
            }

            @Override
            public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
                return executor.invokeAll(tasks);
            }

            @Override
            public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
                return executor.invokeAll(tasks, timeout, unit);
            }

            @Override
            public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
                return executor.invokeAny(tasks);
            }

            @Override
            public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                return executor.invokeAny(tasks, timeout, unit);
            }

            @Override
            public void execute(Runnable command) {
                executor.execute(command);
            }
        }

        Impl exec = new Impl(2);
        exec.execute(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("two");
        });

        exec.execute(() -> System.out.println("one"));
        exec.shutdown();

    }
}
