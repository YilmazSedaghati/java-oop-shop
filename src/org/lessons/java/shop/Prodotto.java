package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    private static Random randValueGen = new Random( );
    
    public Prodotto (String name, String description) {

        this.code = randValueGen.nextInt(10000);
        this.name = name;
        this.description = description;
        this.price = randValueGen.nextDouble(0.0,10000.0);
        this.iva = (0.22);
        this.priceIva = price * ( 1 + iva);

    }

    public int getCode( ) {
        return code;
    }

    public void setCode( int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price * ( 1 + iva );
    }

    public static Random getRandValueGen() {
        return randValueGen;
    }

    public static void setRandValueGen(Random randValueGen) {
        Prodotto.randValueGen = randValueGen;
    }

}


/*Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisca i prodotti di uno shop.
Un prodotto sarà caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
Buon lavoro e buon primo Maggio!*/