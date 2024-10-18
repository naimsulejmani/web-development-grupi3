package dev.naimsulejmani.webdevelopmentgrupi3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    // book properties isbn, title, author, yearpublished,  and price
    private String isbn;
    private String title;
    private String author;
    private int yearPublished;
    private double price;
}
