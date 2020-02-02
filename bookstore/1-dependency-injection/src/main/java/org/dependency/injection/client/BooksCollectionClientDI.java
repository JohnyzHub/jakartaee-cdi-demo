package org.dependency.injection.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.dependency.injection.BooksCollection;
import org.dependency.injection.BooksCollectionWithDI;

/**
 * @author johnybasha
 *
 */
public class BooksCollectionClientDI {

	public static void main(String[] args) {

		BooksCollectionClientDI client = new BooksCollectionClientDI();
		client.testBooksCollection();
		client.testBooksCollectionWithDI();
	}

	public void testBooksCollection() {

		BooksCollection booksCollection = new BooksCollection();

		for (int index = 0; index < 4; ++index) {
			booksCollection.addBook(String.format("Book%s", index));
		}

		booksCollection.showBooks();
	}

	public void testBooksCollectionWithDI() {

		List<String> listImpl = new ArrayList<>();
		BooksCollectionWithDI booksCollection = new BooksCollectionWithDI(listImpl);

		for (int index = 0; index < 4; ++index) {
			booksCollection.addBook(String.format("Book%s", index));
		}

		booksCollection.showBooks();

		listImpl = new Vector<String>(0);
		booksCollection = new BooksCollectionWithDI(listImpl);

		for (int index = 0; index < 4; ++index) {
			booksCollection.addBook(String.format("Book%s", index));
		}

		booksCollection.showBooks();
	}

}