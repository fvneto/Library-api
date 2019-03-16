package com.vicente.springmvc.service;

import java.util.List;
import com.vicente.springmvc.model.Book;

/**
 * 
 * @author Vicente
 *
 */
public interface InterfaceBookService {

	List<Book> getAllBooks();
	Book getBookById(int bookId);
	boolean addBook(Book book);
	void updateBook(Book book);
	void deleteBook(int bookId);
}
