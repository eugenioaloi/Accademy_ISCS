package manipolazioneStream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EsempiVari {
	
	
	public static void main(String[] args) {
		
		String str = "Questo\n e\n un\n esempio\n";
		
		List<String> listFromStream = str.lines().collect(Collectors.toList());
		
		System.out.println(listFromStream);
		
		str = "Questo è un altro esempio";
		str.chars().forEach(s->{System.out.print((char)s);});
		
		List<Product>
		productList = Arrays.asList(
			new Product(23 , " potatoes"),
			new Product( 14 , " orange"),
			new Product (13 , " lemon"),
			new Product (23 , " bread"),
			new Product (13 , "sugar"));
		
		Collector<Product, ?, LinkedList <Product>> toLinkedList=
		Collector.of(LinkedList::new , LinkedList::add ,
			(first, second)-> {
				first.addAll(second);
				return first;
			});
		LinkedList <Product> linkedListOfPersons =productList.stream().collect(toLinkedList);
		
		linkedListOfPersons.forEach(System.out::println);
		
		
		
		
	}

}
