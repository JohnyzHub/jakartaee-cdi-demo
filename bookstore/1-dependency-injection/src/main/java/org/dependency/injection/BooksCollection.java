package org.dependency.injection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author johnybasha
 *
 */
public class BooksCollection {

	private List<String> books;

	public BooksCollection() {
		books = new ArrayList<String>(0);
	}

	public void addBook(String book) {
		books.add(book);
	}

	public void showBooks() {
		System.out.println("Collection Impl:: " + books.getClass().getSimpleName());
		books.forEach(System.out::println);
	}

}
