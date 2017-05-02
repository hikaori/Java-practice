package JAVA_FOUNDATION_4th_edition_PP5.PP5_7;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by kaorihirata on 2017-04-28.
 */
public class Book {
    private String title,author,publisher;
    int copyrightdate;

    public Book(String title,String author,String publisher,int copyrightdate){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.copyrightdate=copyrightdate;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
//        return title;
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setCopyrightdate(int copyrightdate){
        this.copyrightdate = copyrightdate;
    }

    public int getCopyrightdate(){
        return copyrightdate;
    }

    public String toString(){
        return "this book \ntitle : "+this.title+"\n"
                +"author : "+this.author+"\n"+
                "publisher : "+this.publisher+"\n"+
                "copyrightdate : "+this.copyrightdate;
    }
}
