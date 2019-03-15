package com.vicente.springmvc.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.vicente.springmvc.model.Book;

/**
 * 
 * @author Vicente
 *
 */
@Transactional
@Repository
public class BookDaoImpl implements InterfaceBookDao {

	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public Book getBookById(int bookId) {
		return entityManager.find(Book.class, bookId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		String hql = "FROM Books as bo ORDER BY bo.bookId";
		return (List<Book>) entityManager.createQuery(hql).getResultList();
	}	
	
	@Override
	public void addBook(Book book) {
		entityManager.persist(book);
	}
	
	@Override
	public void updateBook(Book book) {
		Book book1 = getBookById(book.getBookId());
		book1.setTitle(book.getTitle());
		book.setCategory(book.getCategory());
		entityManager.flush();
	}
	@Override
	public void deleteBook(int bookId) {
		entityManager.remove(getBookById(bookId));
	}
	@Override
	public boolean bookExists(String title, String category) {
		String hql = "FROM books as bo WHERE bo.title = ? and bo.category = ?";
		int count = entityManager.createQuery(hql).setParameter(0, title)
		              .setParameter(1, category).getResultList().size();
		return count > 0 ? true : false;
	}

}
