package com.vicente.springmvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vicente.springmvc.dao.InterfaceBookDao;
import com.vicente.springmvc.model.Book;

/**
 * @author Francisco Vicente
 */
@Service
public class BookService implements InterfaceBookService {

	@Autowired
	private InterfaceBookDao bookDAO;

	@Override
	public Book getBookById(int bookId) {
		Book obj = bookDAO.getBookById(bookId);
		return obj;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDAO.getAllBooks();
	}

	@Override
	public synchronized boolean addBook(Book article) {
		if (bookDAO.bookExists(article.getTitle(), article.getCategory())) {
			return false;
		} else {
			bookDAO.addBook(article);
			return true;
		}
	}

	@Override
	public void updateBook(Book book) {
		bookDAO.updateBook(book);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDAO.deleteBook(bookId);
	}

}
