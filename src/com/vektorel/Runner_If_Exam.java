package com.vektorel;

import java.util.Scanner;

public class Runner_If_Exam {

	public static void main(String[] args) {
		
		System.out.println("*****************************");
		System.out.println("***** HESAP MAK�NES�  *******");
		System.out.println("*****************************");
		System.out.println();
		System.out.println("1. Toplama");
		System.out.println("2. ��kartma");
		System.out.println("3. �arpma");
		System.out.println("4. B�lme");
		System.out.println("Se�iniz...: ");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
		int s1=0,s2=0;
		if(secim==1) {
			System.out.println("Toplama yap�lacakt�r..");
			System.out.println("1. say�y� giriniz...: ");
			s1 = sc.nextInt();
			System.out.println("2. say�y� giriniz...: ");
			s2 = sc.nextInt();
			System.out.println("�ki Say�n�n Toplam�...: "+ (s1+s2));
		}
		else if(secim==2) {
			System.out.println("��kartma yap�lacakt�r.");
			System.out.println("Toplama yap�lacakt�r..");
			System.out.println("1. say�y� giriniz...: ");
			s1 = sc.nextInt();
			System.out.println("2. say�y� giriniz...: ");
			s2 = sc.nextInt();
			System.out.println("�ki Say�n�n Fark�...: "+ (s1-s2));
		}
		else if(secim==3) {
			System.out.println("�arpma yap�lacakt�r.");
			System.out.println("Toplama yap�lacakt�r..");
			System.out.println("1. say�y� giriniz...: ");
			s1 = sc.nextInt();
			System.out.println("2. say�y� giriniz...: ");
			s2 = sc.nextInt();
			System.out.println("�ki Say�n�n �arp�m�...: "+ (s1*s2));
		}
		else if(secim==4) {
			System.out.println("B�lme yap�lacakt�r.");
			System.out.println("Toplama yap�lacakt�r..");
			System.out.println("1. say�y� giriniz...: ");
			s1 = sc.nextInt();
			System.out.println("2. say�y� giriniz...: ");
			s2 = sc.nextInt();
			System.out.println("�ki Say�n�n B�l�m�...: "+ (s1/s2));
		}else {
			System.out.println("Ge�ersiz se�im program sonland�r�lacakt�r.");
		}
		
				
		
		

	}

}
