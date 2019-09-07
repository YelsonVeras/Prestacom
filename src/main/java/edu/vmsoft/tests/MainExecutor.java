package edu.vmsoft.tests;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutor {
    private static final int cashierNum = 4;

    public static void main(String[] args) {

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("Client 1", new int[]{2, 2, 1, 5, 2})); // 12 Seg
        clients.add(new Client("Client 2", new int[]{1, 1, 5, 1, 1})); //  9 Seg
        clients.add(new Client("Client 3", new int[]{5, 3, 1, 5, 2})); // 16 Seg
        clients.add(new Client("Client 4", new int[]{2, 4, 3, 2, 5})); // 16 Seg
        clients.add(new Client("Client 5", new int[]{1, 3, 2, 2, 3})); // 11 Seg
        clients.add(new Client("Client 6", new int[]{3, 3, 2, 4, 7})); // 19 Seg
        clients.add(new Client("Client 7", new int[]{4, 2, 1, 3, 1})); // 11 Seg
        clients.add(new Client("Client 8", new int[]{6, 1, 3, 1, 3})); // 14 Seg
        // Tiempo total en procesar todos los pedidos = 108 segundos

        long init = System.currentTimeMillis();  // Instante inicial del procesamiento

        ExecutorService executor = Executors.newFixedThreadPool(cashierNum);
        for (Client client : clients) {
            Runnable cashier = new CashierRunnable(client, init);
            executor.execute(cashier);
        }
        executor.shutdown();    // Cierro el Executor
//        while (!executor.isTerminated()) {
//            // Espero a que terminen de ejecutarse todos los procesos
//            // para pasar a las siguientes instrucciones
//        }

        long fin = System.currentTimeMillis();    // Instante final del procesamiento
        System.out.println("Tiempo total de procesamiento: " + (fin - init) / 1000 + " Segundos");
    }
}
