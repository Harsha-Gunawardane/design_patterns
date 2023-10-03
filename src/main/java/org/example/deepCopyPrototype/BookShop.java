package org.example.deepCopyPrototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String shopName;
    private List<Book> books;

    public BookShop(){
        this.books = new ArrayList<>();
    }
    public BookShop(String shopName) {
        this.shopName = shopName;
        this.books = new ArrayList<>();
    }
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    private void addNewBook(Book book){
        books.add(book);
    }

    public void removeBook(Integer id){

        for(Book book : this.books){
            if(book.getId() == id){
                books.remove(book);
                break;
            }
        }
    }

    public void getBooks(){
        for (int i=0; i<5; i++){
            Book newBook = new Book(i, "Harry Potter " + i);
            addNewBook(newBook);
        }
    }

    public void showBooks(){
        String bookShopString = "";

        for(Book book: books){
            bookShopString += book.toStringBook();
        }
        System.out.println(bookShopString);
    }

    public BookShop clone() throws CloneNotSupportedException{
        BookShop newBookShop = new BookShop();

        for(Book book : this.books){
            newBookShop.addNewBook(book);
        }

        return newBookShop;
    }

}
