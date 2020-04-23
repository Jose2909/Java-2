
/*Exercise 2 - Development Java
Create a new console app project.

Create a new class with the following:
	Constructor that will initialize a class variable.
	Apply constructor overloading.
	Apply method overloading.
	Create a property that returns a string.
	Create a method to separate a list of 20 numbers between odds and even
	Create a method to print numbers in the following pattern - from 0 to 20*/
package com.java.UnosquareJava.app.Ejercicio2;
import java.util.Random;
import java.util.ArrayList;
import java.util.*;

public class Ejercicio2{
	private int numaux = 0;
	private int len = 20;
	private int limit = 21;
	private int rdmnumber = 100;
	

	Ejercicio2(){
		this.numaux = numaux;
		
	}

	Ejercicio2(int largo, int limite, int rdmnumber){
		this.len = largo;
		this.limit = limite;
		this.rdmnumber = rdmnumber;
	}
	protected int  getNumaux(){
		return numaux;
	}
	protected void setNumaux(int numaux){
		this.numaux = numaux;
	}
	protected int getLen(){
		return len;
	}
	protected void setLen(int len){
		this.len = len;
	}
	protected int getLimit(){
		return limit;
	}
	protected void setLmit(int limit){
		this.limit = limit;
	}
	protected int getRdmnumber(){
		return rdmnumber;
	}
	protected void setRdmnumber(int rdmnumber){
		this.rdmnumber = rdmnumber;
	}


	



	
	public static void main(String[] args){

		       
		
		Ejercicio2 methodSepareteOddEvens = new Ejercicio2();
		methodSepareteOddEvens.separeOddsEvens();
		
		Ejercicio2 numbersFrom0to20 = new Ejercicio2();
		numbersFrom0to20.numbers0to20();

		Ejercicio2 numFrom0to20 = new Ejercicio2();
		numbersFrom0to20.numbers0to20(20);

	}

	public void separeOddsEvens(){
		Ejercicio2 encap = new Ejercicio2();
		encap.getNumaux();
		encap.getLen();
		
		encap.getRdmnumber();
		
		
		ArrayList <Integer> listEven = new ArrayList<Integer>();
		ArrayList <Integer> listOdd = new ArrayList<Integer>();
		Random rnd = new Random();
				
		
		int [] listRnd = new int [len];
		
		System.out.println("Arreglo : \n ");
		for(int numrnd=0; numrnd < listRnd.length; numrnd++){ 
          numaux = rnd.nextInt(rdmnumber); 
          listRnd[numrnd] = numaux;           
          System.out.println(listRnd[numrnd]);
        }
          for(int sepnum = 0; sepnum < listRnd.length; sepnum ++){
          	if (listRnd[sepnum] % 2 ==  0){
          		listEven.add(listRnd[sepnum]);
          		}
          	else {
          		listOdd.add(listRnd[sepnum]);
          		}
            } 

        System.out.println("Even numbers: \n ");
        for(Integer evens : listEven){
        	System.out.println(evens + " ");
           }
        System.out.println("Odd numbers: \n ");
        for(Integer odd : listOdd){
        	System.out.println(odd + " ");
           }
	
    }

    public void numbers0to20(){
    	Ejercicio2 encap2 = new Ejercicio2();		
		encap2.getLen();		
		encap2.getLimit();
		

    	System.out.println("\nNumeros del 0 al 20");
    	if (len < limit){
	    	for(int num = 0; num <= len; num ++)
	    		System.out.println(num);
	    }
	}

	public String numbers0to20(int len){
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(0,"zero"); 
        hmap.put(1,"one");
        hmap.put(2,"two");
        hmap.put(3,"three");
        hmap.put(4,"four");
        hmap.put(5,"five");
        hmap.put(6,"six");
        hmap.put(7,"seven");
        hmap.put(8,"eight");
        hmap.put(9,"nine");
        hmap.put(10,"ten");
        hmap.put(11,"eleven");
        hmap.put(12,"twelve");
        hmap.put(13,"thirteen");
        hmap.put(14,"fourteen");
        hmap.put(15,"fifteen");
        hmap.put(16,"sixteen");
        hmap.put(17,"seventeen");
        hmap.put(18,"eighteen");
        hmap.put(19,"nineteen");
        hmap.put(20,"twenty");

    	System.out.println("\nNumeros del 0 al 20");
    		if(hmap.get(len).equals("twenty")){
    	  	for(Integer zerto : hmap.keySet())
	    		System.out.println(hmap.get(zerto));	   
	    	return hmap.get(numaux);
	    	}
	    	else return "is bigger than 20";


	}

}


