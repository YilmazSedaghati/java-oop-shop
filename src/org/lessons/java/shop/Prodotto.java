package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    private static Random randValueGen = new Random();

    public Prodotto(String name, String description, double price) {

        this.code = randValueGen.nextInt(10000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = (0.22);

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
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
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Il prezzo inserito non è valido!!! Inserirlo nuovamente!!!");
        }
    }

    public double getIvaPrice() {
        double ivaPrice = price * ( 1 + iva );
        return ivaPrice;
    }

    public String getExtName() {
        String getExtName = ("Il codice numerico " + code + " fa riferimento al prodotto " + name + " che costa " + getIvaPrice() + " euro comprensivo di Iva!");
        return getExtName;
    }

}
