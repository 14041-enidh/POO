package com.livraria;

public class Livraria {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.print();
        
        book1.setTitle("Teste1");
        book1.print();

        book1.setEditionYear(2023);
        book1.print();

        book1.setPrice(15.99);
        book1.print();
    }
}
