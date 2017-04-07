/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbook;

/**
 *
 * @author hiratakaori
 */
// textbook 5_7

public class Book {
    private String title,author,publisher;
    private int copyright_data;
    
    public Book(String title,String author,String publisher,int copyright_data){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyright_data = copyright_data;
    }
    
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public int getCopyright_data(){
        return this.copyright_data;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void Copyright_data(int copyright_data){
        this.copyright_data = copyright_data;
    }
    
    public String toString(){
//        return "Title: " + title + "\nAuthor: " + author + "" +
//                "\nPublisher: " + publisher + "\nCopyright: " + copyright_data;

        // same mean as the upper sentence
        String description ="Title: " + this.title + "\nAuthor: " + this.author + "" +
                "\nPublisher: " + this.publisher + "\nCopyright: " + this.copyright_data;
        return description;
    }
    
    
}
