package com.vektorel;

public class Runner_switch_case {

	public static void main(String[] args) {
		
		
		//fvfdgdd 
		
		// if... else if ... else if... else if.... else

		// 40 ..  
		// iþlem basamaðý seçiniz.
		// 1. toplama
		// 2. çýkartma
		// 3.
		// 4. 
		// 5.
		// 99. çýkýþ
		
		int secim = 13;
		String secim_sozel = "toplama";
		switch (secim) {
		case 1: System.out.println("Toplama iþlemi yapýlacak"); break; // break; gördüðünüz yerde süslü parantezden çýkarsýnýz.
		case 2: System.out.println("Çýkartma iþlemi yapýlacak");break;
		case 3: System.out.println("Çarpma iþlemi yapýlacak");break;
		case 4: System.out.println("Bölme iþlemi yapýlacak");break;
		case 5: System.out.println("Mod Alma iþlemi yapýlacak");break;
		case 99: System.out.println("UYGULAMADAN ÇIKILDI");break;
		default: System.out.println("Lütfen geçerli bir seçim yapýnýz");break;
		}

	}

}
