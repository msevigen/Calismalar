package Replit;

import java.util.Scanner;

public class For_while_EBOB_EKOK {

	public static void main(String[] args) {

		/*
		 * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti: Beklenen Cikti: 30 ve 40 icin GCD = 10
		 * 
		 * 30 ve 40 icin LCM = 120
		 */

		Scanner scan = new Scanner(System.in);
		int ebob = 0;

		System.out.print("1. Sayıyı giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.print("2. Sayıyı giriniz: ");
		int sayi2 = scan.nextInt();

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0 && sayi2 % i == 0) {
				ebob = i;
			}
		}
		System.out.println("Ebob = " + ebob);

		
		int ekok = 0;
		int max;
		
		max = sayi1 * sayi2;
		
		/*
		 * 2 sayı eger aralarında asal ise ekoku çarpımlarıdır. Yanı 2 sayının ekoku
		 * maximum çarpımlarıdır.
		 */

		for (int i = max; i > 0; i--) {
			if (i % sayi1 == 0 && i % sayi2 == 0) {
				ekok = i;
			}
		}
		System.out.println("Ekok = " + ekok);

	}

}
