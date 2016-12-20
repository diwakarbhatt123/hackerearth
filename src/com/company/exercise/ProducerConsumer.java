package com.company.exercise;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();
        Producer producer = new Producer(dataStorage);
        Consumer consumer = new Consumer(dataStorage);
        producer.start();
        consumer.start();
    }
}
class Producer extends Thread{

    private DataStorage storage;

    public Producer(DataStorage storage){
        super("Producer");
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int number = random.nextInt(101);
            storage.putElement(number);
        }
    }
}
class Consumer extends Thread{

    private DataStorage dataStorage;

    public Consumer(DataStorage dataStorage){
        super("Consumer");
        this.dataStorage = dataStorage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(dataStorage.getElement());
        }
    }
}
class DataStorage{
   private BlockingQueue<Integer> dataQueue;
    public DataStorage(){
        dataQueue = new LinkedBlockingQueue<>(10);
    }
    public Integer getElement(){
        try {

            Integer item = dataQueue.take();
            return item;
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        return null;
    }
    public void putElement(Integer element){
        try {
            dataQueue.put(element);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}