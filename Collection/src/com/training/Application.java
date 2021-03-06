package com.training;
import com.training.model.*;
import  com.training.services.*;

import java.util.List;

import com.training.Book;
public class Application {
	
	
	public static void print(List<Book> list) {
	
		for (Book eachBook : list)
		{
			System.out.println(eachBook);
		}
	
		
	}
	public static void main(String[] args) {
		Book java = new Book(101,"java","suba",450);
		Book spring = new Book(102,"spring","mad",650);
		Book maven = new Book(103,"maven","Harish",550);
		Book html = new Book(104,"html","priya",1450);
		Book python = new Book(105,"python","sathya",850);
		
		CrudRespository service = new BookService();
		
		service.add(java);
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		List<Book> bookList = service.findAll();
		print(bookList);
		
		System.out.println("=========================================");
		System.out.println ("FOUND BOOK :"+service.findByBookId(101));
		
		System.out.println("=========================================");
		System.out.println("REMOVED ONE :"+service.remove(python));
		print(bookList);
		
		System.out.println("=========================================");
		Book react = new Book(106,"ReactJs","Rahul",6800);
		service.add(react);
		
		
		System.out.println("-----------------Adding new Book----------------------------");
		print(service.findAll());
		
		Book reactNew = new Book(106,"ReactJs","Gowse",7000);
		
		service.update(react,reactNew);
		
		System.out.println("-------------------AFTER UPDATE-------------------");
		print(service.findAll());
	}
		
		
	}

