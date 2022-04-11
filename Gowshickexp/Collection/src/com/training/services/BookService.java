package com.training.services;
import com.training.*;

import java.util.ArrayList;
import java.util.List;

import com.training.model.CrudRespository;
import com.training.Book;


public class BookService implements CrudRespository {
	
	private ArrayList<Book> bookList;
 
	public BookService() {
		super();
	    this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}

	@Override
	public Book findByBookId(int id) {
		// TODO Auto-generated method stub
		Book found =null;
		for(Book eachBook:this.bookList)
		{
			if (eachBook.getBookNumber()==id)
			{
				found=eachBook;
			}
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook ,Book newBook) {
		if(this.bookList.contains(oldBook)) {
			//System.out.println("Inside Else block *********");
			
			int idxPos = this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos, newBook);
			
		}
		return newBook;
	}

}


