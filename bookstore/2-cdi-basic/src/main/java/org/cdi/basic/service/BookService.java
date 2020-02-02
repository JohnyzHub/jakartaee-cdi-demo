package org.cdi.basic.service;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.cdi.basic.entity.Book;

public class BookService {

	@Inject
	private Book book;
	
	public Book createBook() {
		book.setNumber(1);
		book.setTitle("New Book");
		book.setDescription("Java Book");
		book.setBookFormat("e-book");
		book.setBookPrice(BigDecimal.TEN);
		return book;
	}
}