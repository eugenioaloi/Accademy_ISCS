package solution;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.sampled.Line;

import service.IParole;

public class SolutionParole implements IParole{
	
	/*viene fornito un file su cui fare delle statistiche*/
	
	String nomeFile;
	int countAll=0;
	
	public SolutionParole(String nomeFile) {
		this.nomeFile = nomeFile;
	}
	

	@Override
	public int countAll() {
		return (int) generaStream(nomeFile)//crea lo stream
				.filter(s->!s.isEmpty())// filtralo
				.flatMap(line -> Stream.of(line.split(" +")))//fai una mappa, passaandole uno stream di line.split
				.count();
	}
	
	public int countAll2() {
		generaStream(nomeFile)
				.filter(s->!s.isEmpty())
				.collect(Collectors.toList())
				.forEach(o->{
					Stream<String> streamRow = Stream.of(o.split(" +"));
					countAll += streamRow.count();
				});
		return countAll;
	}
	

	@Override
	public String[] parole() {
		return generaStream(nomeFile)
			.flatMap(line->Stream.of(line.split(" +")))
			.filter(s->!s.isEmpty())
			.collect(Collectors.toList())
			.toArray(new String[0]);
	}

	@Override
	public long count(String parola) {
		return generaStream(nomeFile)
			.flatMap(line -> Stream.of(line.split(" +")))
			.filter(s->s.equalsIgnoreCase(parola))
			.collect(Collectors.counting());
	}

	@Override
	public String parolaMax() {
		return  generaStream(nomeFile)
					.flatMap(line->Stream.of(line.split(" +")))
					.filter(s->!s.isEmpty())
					.sorted((o1,o2)->o2.compareTo(o1))
					.findFirst()
					.get();//si dovrebbe passare nel metodo un Optional per poi testare direttamente l'obj
	}

	@Override
	public String[] parolaPiuPiccola(int numChar) {
		return generaStream(nomeFile)
				.flatMap(line->Stream.of(line.split(" +")))
				.filter(s->!s.isEmpty()&&s.length()<numChar)
				.distinct()
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}
	
	/*Generazione Stream di righe dal file fornito*/
	private Stream<String> generaStream(String nomeFile){
		File file = new File(nomeFile);
		Path path = file.toPath();
		Stream<String> streamFile = null;
		try {
			streamFile = Files.lines(path);//crea lo stream iniziale partendo dal file fornito
		} catch (IOException e) {
			System.out.println("File " + nomeFile + " non trovato");
			e.printStackTrace();
		}
		
		return streamFile;
		
		
	}
	

}
