package com.vektorel;

public class Runner_If {

	public static void main(String[] args) {
		
		// Burada eksiklik olmu� bukodsonradan eklendi
		String ifade ="var";
		int durum =1;
		// if(condition){}
		//1. kullan�m
		if(durum==1) {
			
		}
		//2. kullan�m
		if(durum==1) {
			
		}else {
			
		}
		//3.kullan�m
		if(durum==1) {
			
		}else if(durum>12) {
			
		}else {
			
		}
				
		
		// syntax -> grammer
		int ortalama = 10;
		if(ortalama>50) { // e�er durum do�ru ise �al��
			System.out.println("Ge�ti");
		}else { // e�er durum do�ru de�il ise �al��
			System.out.println("Kald�");
		}

		// ortalama = 10
		
		if(ortalama<= 10) {
			System.out.println("FF");
		}else if(ortalama<=20){
			System.out.println("FD");
		}else if(ortalama<=30) {
			System.out.println("DD");
		}else if(ortalama<=40) {
			System.out.println("DC");			
		}else if(ortalama<=50) {
			System.out.println("CC");
		}else if(ortalama<=60) {
			System.out.println("CB");
		}else if(ortalama<=70) {
			System.out.println("BB");
		}else if(ortalama<=85) {
			System.out.println("BA");
		}else{
			System.out.println("AA");
		}
		
		if(ortalama<=10) {
			System.out.println("FF");
		}
		if(ortalama>10 && ortalama<=20) {
			System.out.println("DF");
		}
		if(ortalama<=30) {
			System.out.println("DD");
		}
		if(ortalama<=40) {
			System.out.println("DC");
		}
		if(ortalama<=50) {
			System.out.println("CC");
		}
		
		
		
		
		
		
		
		System.out.println("PROGRAM SONU.");
	}

}
