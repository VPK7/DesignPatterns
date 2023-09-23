package com.learn.java.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for (int i=0;i<=10;i++){
            Book b=new Book();
            b.setBid(i);
            b.setBname("Book "+i);
            getBooks().add(b);
        }
    }

    /**
     * this is for shallow cloning
     * @return
     * @throws CloneNotSupportedException
     */
    //@Override
    /*protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    /**
     * this is for deep cloning
     * @return
     * @throws CloneNotSupportedException
     *///bs, bs1
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs1=new BookShop();
        for (Book b:this.getBooks() ) {
            bs1.getBooks().add(b);
        }
        return bs1;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
