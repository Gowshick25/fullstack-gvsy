package com.example;

import java.sql.*;

import com.example.ifaces.*;


public class App 
{
    public static void main( String[] args )
    {
    	Connection con ;
    	try {
    		con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
    		System.out.println(con);
    		
    		//LocalDate date = LocalDate.of(2022,4,12);
    		//Date sqlDate = Date.valueOf(date);
    		//LocalDate date2 = sqlDate.toLocalDate();
    		
    		MemberRepository service = new MemberRepository(con);
    		Member toAdd = new Member(108,"yo","Chennai12",null,"Lifetime",600,3,560);
    		 int rowAdded = service.add(toAdd);
    		 System.out.println("Row Added : "+rowAdded);

    		
    		
		} catch (SQLException e) {
			e.printStackTrace();
			
        
    }
    }
}


