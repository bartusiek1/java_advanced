package threads;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        WykonywalnyObiekt wo = new WykonywalnyObiekt();
//        Thread watek = new Thread(wo);
//        watek.start();

 //       Thread watek = new Thread(() -> {
 //           for (int i = 0; i < 10000000; i++) {
//                System.out.println("Hello world!");

                // processing
 //               try {
 //                   Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
 //           }
 //       });
//        watek.start();

        // pula watkow "przyjmuje do realizacji zlecenia"
        ExecutorService pulaWatkow = Executors.newFixedThreadPool(5);

        while (scanner.hasNext()){
            String slowo = scanner.next();
            System.out.println(slowo);
        }
    }
}
