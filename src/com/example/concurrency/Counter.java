package com.example.concurrency;

public class Counter {
    public int count = 0;
    
    public synchronized void increment(){
        count++;
    }
    
    public synchronized void decrement(){
        count--;
    }
    
    public synchronized int value(){
        return count;
    }
    
    public static class CounterThread implements Runnable{

        private Counter counter;
        
        public CounterThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            System.out.println("Counter : " + counter.value());
        }
        
    }

    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        Thread t = new Thread(new CounterThread(counter));
        t.start();
        //t.join();
        //Thread.sleep(100);
        counter.increment();
        
        System.out.println("Counter : " + counter.value());
    }
}
