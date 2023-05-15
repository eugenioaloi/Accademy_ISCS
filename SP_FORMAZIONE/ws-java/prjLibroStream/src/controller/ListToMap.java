package controller;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


import model.Book;
import service.IListToMap;

public class ListToMap implements IListToMap {
	
	@Override
	public Map<String, Book> listToMapOldStyle(List<Book> bookList) {
		Map<String, Book> bookMap = new HashMap<>();
		for(Book b:bookList) {
			bookMap.put(b.getIsbn(), b);
		}
		return bookMap;
	}

	@Override
	public Map<String, Book> listToMapWithLambda(List<Book> bookList) {
		return bookList.stream()
				.collect(Collectors.toMap(Book::getIsbn, b->b));
	}

	@Override
	public Map<String, Book> listToMapWithTheReference(List<Book> bookList) {
		return bookList.stream()
				.collect(Collectors.toMap(Book::getIsbn, b->b));
	}

	@Override
	public Map<String, Book> listToMapWithFunctionIdentity(List<Book> bookList) {
		return bookList.stream()
				.collect(Collectors.toMap(Book::getIsbn, Function.identity()));
	}

	@Override
	public Map<String, Book> listToMapWithNoDuplicateList(List<Book> bookList) {
		return bookList.stream()
				.collect(Collectors.toMap(Book::getIsbn, Function.identity(),(first,second)->first));
	}

	@Override
	public Map<String, List<Book>> listToMapWithNoDuplicate(List<Book> bookList) {
		return bookList.stream()
				.collect(Collectors.groupingBy(Book::getIsbn));
	}

	@Override
	public Map<String, List<Book>> listToMapIsbnGreaterThan(List<Book> bookList, String isbn) {
		return bookList.stream()
				.filter(b->b.getIsbn().compareToIgnoreCase(isbn)>0)
				.collect(Collectors.groupingBy(Book::getIsbn));
	}

	@Override
	public String bookNamesJoined(List<Book> bookList) {
		return bookList.stream()
			.map(Book::getDesc)
			.collect(Collectors.joining(","));
	}

	@Override
	public double averageBookPrice(List<Book> bookList) {
		return bookList.stream()
				.collect(Collectors.averagingDouble(Book::getPrice));
	}
	
	@Override
	public double totCost(List<Book> bookList) {
		return bookList.stream()
				.collect(Collectors.summingDouble(Book::getPrice));
	}

	@Override
	public DoubleSummaryStatistics bookStatistics(List<Book> bookList) {
		return bookList.stream()
                .collect(Collectors.summarizingDouble(Book::getPrice));
	}

	@Override
	public String[] bookAuthors(List<Book> bookList) {
		return bookList.stream()
				.map(Book::getAuthor)
				.toArray(String[]::new);
	}

	@Override
	public String[] bookAuthorsNat(List<Book> bookList, String nazione) {
		return bookList.stream()
				.filter(el->el.getNationality().contentEquals(nazione))
				.map(Book::getAuthor)
				.toArray(String[]::new);
	}


}
