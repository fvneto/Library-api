package com.vicente.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="books")
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_id")
    private int bookId;

	@NotEmpty
	@NotBlank
	@Column(name="TITLE", nullable=false)
	private String title;
	
	@Column(name="category")	
	private String category;
	
	@Column(name="AUTOR", nullable=false)
	private String autor;

	public String getTitle() {
		return title;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [id=" + bookId + ", Name=" + title + ", "
				+ "Category=" + category + "]";
	}
}
