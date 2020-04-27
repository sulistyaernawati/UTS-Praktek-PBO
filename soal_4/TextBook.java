/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_4;

/**
 *
 * @author Sulistya Ernawati
 */
public class TextBook {
    private String title;
    private String author;
    private String publisher;
    
    public TextBook(String textTitle, String auth, String pub) {
        title = textTitle;
        author = auth;
        publisher = pub;
    }
    
    public TextBook(TextBook object2) {
        title = object2.title;
        author = object2.author;
        publisher = object2.publisher;
    }
    
    public void set(String textTitle, String auth, String pub) {
        title = textTitle;
        author = auth;
        publisher = pub;
    }
    
    public String toString() {
        String str = "Title: " + title +
                "\nAuthor: " + author +
                "\nPublisher: " + publisher;
        return str;
    }
}
