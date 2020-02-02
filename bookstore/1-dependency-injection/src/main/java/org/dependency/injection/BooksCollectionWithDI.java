package org.dependency.injection;

import java.util.List;

/**
 * @author johnybasha
 *
 */
public class BooksCollectionWithDI {

	private List<String> books;

	public BooksCollectionWithDI(List<String> books) {
		this.books = books;
	}

	public void addBook(String book) {
		books.add(book);
	}

	public void showBooks() {
		System.out.println("\nWith DI::\nCollection Impl:: " + books.getClass().getSimpleName());
		books.forEach(System.out::println);
	}

}
