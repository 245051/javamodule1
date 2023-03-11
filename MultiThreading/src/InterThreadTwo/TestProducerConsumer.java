package InterThreadTwo;

import java.util.ArrayList;
import java.util.List;

public class TestProducerConsumer
{
   public static void main(String[] args)
   {
      List<Integer> taskQueue = new ArrayList<Integer>(); //If we make them thread then only we can call them as function.
      int MAX_CAPACITY = 5;
      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
      Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");  //Two types of threds either implemennt using runnable or extends thread class.
      tProducer.start();
      tConsumer.start();
   }
}

