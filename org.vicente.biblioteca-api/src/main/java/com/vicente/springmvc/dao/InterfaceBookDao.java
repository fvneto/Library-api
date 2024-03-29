package com.vicente.springmvc.dao;

import java.util.List;

import com.vicente.springmvc.model.Book;

/**
 * 
 * @author Vicente
 *
 */
public interface InterfaceBookDao {
	
	List<Book> getAllBooks();
    Book getBookById(int bookId);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(int bookId);
    boolean bookExists(String title, String category);

}
