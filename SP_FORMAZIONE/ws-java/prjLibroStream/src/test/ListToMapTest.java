package test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.ListToMap;
import model.Book;

class ListToMapTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testlistToMapOldStyle() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = List.of(new Book("A123", "book1", "author1",1.5,"it"),
				new Book("A456", "book2", "author2",2.5,"it"),
				new Book("A789", "book3", "author3",2.0,"en"));
		Map<String, Book> bookMap = ltm.listToMapOldStyle(bookList);
		String [] arr = bookMap.keySet()
				.stream().map(b->b)
				.collect(Collectors.toList())
				.toArray(new String[0]);
		assertTrue(arr.length==3);
		assertArrayEquals(arr, new String[] {"A789", "A456", "A123"});
	}
	
	@Test
	void testListToMapWithLambda() {
		ListToMap ltm = new ListToMap();
		List<Book> bookLasList = new LinkedList<>();
		bookLasList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookLasList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookLasList.add(new Book("A789", "book3", "author3",2.0,"en"));
		List<String> keyList = new ArrayList<>();
		Map<String, Book> bookMap = ltm.listToMapOldStyle(bookLasList);
		for(String str:bookMap.keySet()) {
			keyList.add(str);
		}
		assertTrue(keyList.size()==3);
		assertEquals("A789", keyList.get(0));
	}	
	
	@Test
	void testListToMapWithTheReference() {
	}	
	
	@Test
	void testListToMapWithFunctionIdentity() {
		
	}	
	
	@Test
	void testListToMapWithNoDuplicateList() {
		
	}	
	
	@Test
	void testListToMapIsbnGreaterThan() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = new LinkedList<>();
		bookList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookList.add(new Book("A789", "book3", "author3",2.0,"en"));
		Map<String, List<Book>> bookMap = ltm.listToMapIsbnGreaterThan(bookList, "A456");
		assertEquals("[A789]", bookMap.keySet().toString());
		
	}	
	
	@Test
	void testBookNamesJoined() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = new LinkedList<>();
		bookList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookList.add(new Book("A789", "book3", "author3",2.0,"en"));
		assertEquals("[book1,book2,book3]", ltm.bookNamesJoined(bookList));
	}	
	
	@Test
	void testAverageBookPrice() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = new LinkedList<>();
		bookList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookList.add(new Book("A789", "book3", "author3",2.0,"en"));
		assertEquals(2.0, ltm.averageBookPrice(bookList));
	}	
	
	@Test
	void testTotCost() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = new LinkedList<>();
		bookList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookList.add(new Book("A789", "book3", "author3",2.0,"en"));
		assertTrue(ltm.totCost(bookList)==6.0);
	}	
	
	@Test
	void testBookStatistics() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = new LinkedList<>();
		bookList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookList.add(new Book("A789", "book3", "author3",2.0,"en"));
		assertTrue(ltm.bookStatistics(bookList).getCount()==3);
		assertTrue(ltm.bookStatistics(bookList).getSum()==6.0);
		assertTrue(ltm.bookStatistics(bookList).getMin()==1.5);
		assertTrue(ltm.bookStatistics(bookList).getAverage()==2.0);
		assertTrue(ltm.bookStatistics(bookList).getMax()==2.5);
	}	
	
	@Test
	void testArrayBookAuthors() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = new LinkedList<>();
		bookList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookList.add(new Book("A789", "book3", "author3",2.0,"en"));
		String [] authors = {"author1", "author2", "author3"};
		assertArrayEquals(ltm.bookAuthors(bookList),authors );
		assertTrue(ltm.bookAuthors(bookList).length==3);
	}	
	
	@Test
	void testArrayBookAuthorsByNat() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = new LinkedList<>();
		bookList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookList.add(new Book("A789", "book3", "author3",2.0,"en"));
		assertEquals("author3", ltm.bookAuthorsNat(bookList,"en")[0]);
	}
	
	@Test
	void testPriceGreaterThen() {
		ListToMap ltm = new ListToMap();
		List<Book> bookList = new LinkedList<>();
		bookList.add(new Book("A123", "book1", "author1",1.5,"it"));
		bookList.add(new Book("A456", "book2", "author2",2.5,"it"));
		bookList.add(new Book("A789", "book3", "author3",2.0,"en"));
		Map<Boolean, List<Book>> mappaLibri = ltm.priceGreaterThen(bookList,1.5);
		assertEquals(mappaLibri.size(), 2);
		//assertArrayEquals(arrBul, lstK.toArray(new boolean[2]));
	}	

}
