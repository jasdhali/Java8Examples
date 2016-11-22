package streams;

//Example copied from https://zeroturnaround.com/rebellabs/java-8-streams-cheat-sheet/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Author;
import model.Book;

public class BookStreamExample {
	

	public static List<Book> getData(){
		
		List<Book> list = new ArrayList<Book>();
		list.add( new Book("1234", 21.50f, "Jaspal","Dhaliwal","Singh",45));
		list.add( new Book("2345", 31.50f, "John","Victor","Benegal",55));
		list.add( new Book("3456", 41.50f, "Mohit","Kumar","Sharma",45));
		return list;
	}
	
	public static void main(String[] args) {
		//get list of all authors whoc are > 50 Uppercase
		
		
		//find average age of all the authors
		//(filter, reducing function , return type float)
	    Stream<Book> dataStream = getData().stream();
	    List listAges=dataStream.map( book-> book.getAuthor()).filter(author -> author.getAge() < 50).map(Author ::getAge).collect(Collectors.toList());
		System.out.println( "create new list of all author names who are > 50" +listAges );
		//find total number of books whose price is > $20
		
		//create new list of all author names who are > 50 , name should be in upper case.
	    Stream<Book> dataStreamNew = getData().stream();

	    List<String> namesUpper = dataStreamNew.map(book-> book.getAuthor()).filter(author->author.getAge()>=10).map(author->author.getFisrtName()).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Authors names in upper case====> " + namesUpper );
	}
}

