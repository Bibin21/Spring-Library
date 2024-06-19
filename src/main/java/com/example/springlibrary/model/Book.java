package com.example.springlibrary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String name;
   private long authorId;
    String genre;
    float price;
    int count;

    public Book() {
    }

    public Book(long id, String name, long authorId, String genre, float price, int count) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
        this.genre = genre;
        this.price = price;
        this.count = count;
    }

    public long getID() {
        return id;
    }

    public void setID(long ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
