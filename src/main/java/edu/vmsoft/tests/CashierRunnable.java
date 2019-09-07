package edu.vmsoft.tests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CashierRunnable implements Runnable {

    private Client client;
    private long initialTime;

    public CashierRunnable(Client client, long initialTime) {
        this.client = client;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        System.out.println("La cajera " + Thread.currentThread().getName()
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.client.getName()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");

        for (int i = 0; i < this.client.getShoppingCart().length; i++) {
            // Se procesa el pedido en X segundos
            this.waitPerSecond(client.getShoppingCart()[i]);
            System.out.println("Procesado el producto " + (i + 1) + " del " + this.client.getName() +
                    "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 10+ " seg");
        }

        System.out.println("La cajera " + Thread.currentThread().getName() + " HA TERMINADO DE PROCESAR "
                + this.client.getName() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 10 + "seg");

    }

    private void waitPerSecond(int second) {
        try {
            Thread.sleep(second * 10);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}