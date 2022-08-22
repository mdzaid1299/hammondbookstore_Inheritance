package com;


import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthorName("JRR Tolkien");
        book.setTitle("Lords of Rings");
        book.setDescription("The Lord of the Rings is the saga of a group of sometimes reluctant heroes who set forth to save their world from consummate evil.");
        book.setISBN(55746794);
        book.setPrice(2200);
        book.setAuthorPenName("JRR");

        System.out.println(book);
        book.display();
    }
}
