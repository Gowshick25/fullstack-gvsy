package com.training.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import com.training.model.Book;
import com.training.model.CrudRespository;
import static java.util.stream.Collectors.*;



public class BookService implements CrudRespository {
	
private ArrayList<Book> bookList;
	
@Override
public boolean add(Book book) {
	
	return bookList.add(book);
}

@Override
public Book findByBookId(int id) {
	
	return null;
}

@Override
public boolean remove(Book book) {
	return bookList.remove(book);
}


	public BookService() {
		super();
		this.bookList=new ArrayList<>();
	}

	
	@Override
	public Book findById(int id) {
		Book found = null;
		for(Book eachBook : bookList) {
			
			if(eachBook.getBookNumber()==id) {
				found = eachBook;
			}
		}
		return found;
	}

	
	@Override
	public List<Book> findAll() {
		return this.bookList;
	}

    
	@Override
	public Book update(Book oldBook, Book newBook) {
		if(this.bookList.contains(oldBook)) {
			//System.out.println("Inside Else block *********");
			
			int idxPos = this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos, newBook);
			
		}
		return newBook;
	}
	
	
	
public List<Book> findBookGrtThan(double price){
		
		return this.bookList
			.stream()
				.filter(e -> e.getPrice()>price)
					.collect(toList());
}


public List<String> getBookNames () {

return this.bookList.stream().
		map(e -> e.getBookName()).collect(toList());

}
public List<String> getBookNameGrtThanPrice (double price) {

return this.bookList.stream().
		filter (e-> e.getPrice() >price) .
		map(e-> e.getBookName()).collect(toList());
}
	
	public List<Book> getBookGrtThan(double price){
		// write using predicate and forEach
		
		Predicate<Double> grtThan=(value)->value>price;
		List<Book>list=new ArrayList<>();
		
		
	this.bookList.forEach(book ->
	{
		
		double bookPrice=book.getPrice();
		if(grtThan.test(bookPrice)) {
			list.add(book);
		}
	});
	return list;

	
}

	
}