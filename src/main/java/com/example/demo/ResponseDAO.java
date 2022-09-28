package com.example.demo;

public class ResponseDAO {
	public static ResponseTest list = new ResponseTest();
	//This static block is executed
	//before executing the main
	//block
 static
 {
	   // Creating a few employees
	    // and adding them to the list
	    list.getresponseList().add(new Response( 1,"Rajesh","PQRS",1234567));
	   list.getresponseList().add(new Response(2,"SUNIL","ABCD",456));
       list.getresponseList().add(new Response(3,"PRAKASH","XYZ",1234));
	   list.getresponseList().add(new Response(4, "CHARAN","ABCDE",467));    
	}

	//Method to return the list
	public ResponseTest getAllResponseTest()
	{
	   return list;
	}


}

