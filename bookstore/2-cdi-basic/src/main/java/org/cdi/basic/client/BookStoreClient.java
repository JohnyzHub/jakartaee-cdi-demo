package org.cdi.basic.client;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.cdi.basic.entity.Book;
import org.cdi.basic.service.BookService;

/**
 * @author johnybasha
 *
 */
public class BookStoreClient {

	public static void main(String[] args) {
		try (SeContainer cdiContainer = SeContainerInitializer.newInstance().initialize()) {
			BookService bookService = cdiContainer.select(BookService.class).get();
			Book book = bookService.createBook();
			System.out.println(book);
		}
	}
}