package com.example;

import java.sql.*;
import java.time.LocalDate;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.example.ifaces.*;
import com.example.util.ConnectionFactory;


public class App 
{
    public static void main( String[] args )
    {
    	Connection con ;
    	try {
    		
//    		con = ConnectionFactory.getOracleConnection();
//   		
//    		System.out.println(con);
    		
    		con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
    		System.out.println(con);
    		
    		LocalDate date = LocalDate.of(2022,4,12);
    		Date sqlDate = Date.valueOf(date);
    		//LocalDate date2 = sqlDate.toLocalDate();
    		
    		MemberRepository service = new MemberRepository(con);
//    		Member toAdd = new Member(121,"Lifetime","gowshick","Cuddalore",sqlDate,700,23,901);
//    		int rowAdded = service.add(toAdd);
//    		System.out.println("Row Added : "+rowAdded);
    		System.out.println(service.findById(121));
    		//service.remove(121);
    		//service.update(121, "Ram");

    		service.findAll().forEach(System.out::println);

    		
    		
		} catch (Exception e) {
			e.printStackTrace();
			
        
			
			
		  			
			
			
			
			
    }
    }
}


