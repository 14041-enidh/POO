package com.livraria;

public class Book {
    private String title;
    private String author;
    private int editionYear;
    private double price;

    public Book(){
        this.title = "";
        this.author = "";
        this.editionYear = 2016;
        this.price = 0.0;

    }

    public Book (String initialTitle, String initialAuthor, int initialEditionYear){
        this.title = initialTitle;
        this.author = initialAuthor;
        this.editionYear = initialEditionYear;
        price = 0.0;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public double getPrice() {
        return price;
    }

    public void print (){
        System.out.println("Livro:");
        System.out.println("Titulo: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("Ano de Edição: " + this.editionYear);
        System.out.println("Preço: " + this.price);
    }
}