package org.example.deepCopyPrototype;

public class Book {
    private Integer id;
    private String bookName;

    public Integer getId(){
        return id;
    }
    public Book(Integer id, String bookName){
        this.id = id;
        this.bookName = bookName;
    }
    public Book(){}

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String toStringBook() {
        return bookName + "\n";
    }
}
