package org.lessons.java.shop;

public class Main {
    
    public static void main(String[] args) {

        Prodotto product1 = new Prodotto("Monitor", "Qualità dell'immagine eccezionale con schermo VA di ultima generazione", 59.00);

        Prodotto product2 = new Prodotto("Drone", "Lunga durata batteria, materiale resistente, capacità di volo di 12h", 1200.00);

        System.out.println("Il codice del prodotto è " + product1.getCode());
        System.out.println("Il nome del prodotto è " + product1.getName());
        System.out.println("La descrizione è " + product1.getDescription());
        System.out.println("Il prezzo del prodotto è " + product1.getPrice());
        System.out.println(product1.getExtName());

        System.out.println("Il codice del prodotto è " + product2.getCode());
        System.out.println("Il nome del prodotto è " + product2.getName());
        System.out.println("La descrizione è " + product2.getDescription());
        System.out.println("Il prezzo del prodotto è " + product2.getPrice());
        System.out.println(product2.getExtName());
    }

}
