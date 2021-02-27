package com.vektorel;

import java.util.Scanner;

public class Runner_If_Exam {

	public static void main(String[] args) {
		
		System.out.println("*****************************");
		System.out.println("***** HESAP MAKÝNESÝ  *******");
		System.out.println("*****************************");
		System.out.println();
		System.out.println("1. Toplama");
		System.out.println("2. Çýkartma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");
		System.out.println("Seçiniz...: ");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
		int s1=0,s2=0;
		if(secim==1) {
			System.out.println("Toplama yapýlacaktýr..");
			System.out.println("1. sayýyý giriniz...: ");
			s1 = sc.nextInt();
			System.out.println("2. sayýyý giriniz...: ");
			s2 = sc.nextInt();
			System.out.println("Ýki Sayýnýn Toplamý...: "+ (s1+s2));
		}
		else if(secim==2) {
			System.out.println("Çýkartma yapýlacaktýr.");
			System.out.println("Toplama yapýlacaktýr..");
			System.out.println("1. sayýyý giriniz...: ");
			s1 = sc.nextInt();
			System.out.println("2. sayýyý giriniz...: ");
			s2 = sc.nextInt();
			System.out.println("Ýki Sayýnýn Farký...: "+ (s1-s2));
		}
		else if(secim==3) {
			System.out.println("Çarpma yapýlacaktýr.");
			System.out.println("Toplama yapýlacaktýr..");
			System.out.println("1. sayýyý giriniz...: ");
			s1 = sc.nextInt();
			System.out.println("2. sayýyý giriniz...: ");
			s2 = sc.nextInt();
			System.out.println("Ýki Sayýnýn Çarpýmý...: "+ (s1*s2));
		}
		else if(secim==4) {
			System.out.println("Bölme yapýlacaktýr.");
			System.out.println("Toplama yapýlacaktýr..");
			System.out.println("1. sayýyý giriniz...: ");
			s1 = sc.nextInt();
			System.out.println("2. sayýyý giriniz...: ");
			s2 = sc.nextInt();
			System.out.println("Ýki Sayýnýn Bölümü...: "+ (s1/s2));
		}else {
			System.out.println("Geçersiz seçim program sonlandýrýlacaktýr.");
		}
		
				
		
		

	}

}
