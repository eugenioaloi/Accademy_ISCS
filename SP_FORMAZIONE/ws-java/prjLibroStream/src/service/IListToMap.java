package service;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

import model.Book;

public interface IListToMap {
	
	//utilizza loop old style sulla lista
	Map<String, Book> listToMapOldStyle(List<Book> list);
	
	//utilizza la notazione lambda
	Map<String, Book> listToMapWithLambda(List<Book> list);
	
	//utilizza il metodo reference operator invece di Lambda
	Map<String, Book> listToMapWithTheReference(List<Book> list);
	
	//non gestisce i duplicati
	Map<String, Book> listToMapWithFunctionIdentity(List<Book> list);
	
	//Gestisce i duplicati con una lista come value
	Map<String, Book> listToMapWithNoDuplicateList(List<Book> list);

	//Gestisce i duplicati senza una lista come value
	Map<String, List<Book>> listToMapWithNoDuplicate(List<Book> list);
	
	//restituisce i Book con isbn > di uno fornito
	Map<String, List<Book>> listToMapIsbnGreaterThan(List<Book> bookList, String isbn);
	
	//restituisce i nomi dei Book in un'unica Stringa
	String bookNamesJoined(List<Book> bookList);
	
	//restituisce la media dei prezzi di tutti i libri
	double averageBookPrice(List<Book> bookList);
	
	//restituisce il prezzo medio di tutti i libri
	double totCost(List<Book> bookList);
	
	//restituisce le statistiche dei libri in input
	DoubleSummaryStatistics bookStatistics(List<Book> bookList);
	
	//restituisce tutti gli autori
	String [] bookAuthors(List<Book> bookList);

	//restituisce tutti gli autori di una determinata nazione
	String [] bookAuthorsNat(List<Book> bookList, String nazione);
	
	
	
	
	
	
}
