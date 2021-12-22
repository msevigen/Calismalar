package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*  ===============================PAZAR PROJEMIZ====================================
	 
	 	* Bir kitapci icin program yazalim, kitap no 1001'den baslayarak sirali no olsun
	 	
	 	* Program baslayinca menu isminde bir method calissin
		
		=================KITAP PROGRAMI=================
		1- Kitap ekle
		2- Numara ile kitap sil
		3- Tum kitaplari listele
		4- Bitir
		
		************************************
		
		1. olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait yazar adi olacak
		ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir list'te tutmamiz gerek
		
		2- Kitap numarasi 1000'den baslamali, 
		her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir count=1000; 
		menu isminde bir method olusturmaliyim,
		
		3- Kitap ekle diye bir method olusturmaliyim, bu method farkli bir class'da
		
		4- Kullanicidan kitap adi yazar adi ve fiyat bilgileri istenmeli
		
	*/

public class Kitapci {

	static List<Kitap> kitapListe = new ArrayList<>(); // Butun class'lardan ulasilabilmesi icin basina static
														// getiriyoruz.
														// Gokteki ay haline getiriyoruz :)

//	static Scanner scan = new Scanner(System.in); // Surekli kullanicidan bir veri isteyecegimiz icin (Kitabin ismini
//													// giriniz vs vs..)
//													// class level'da Scanner objesi olusturmamiz mantikli olacaktir.
//
//	static int kitapNo = 1000; // Kitap numarasini her method'da kullanabilmek icin buraya kitapNo objesi de
//								// olusturuyoruz.
//								// 1000'den baslayip artirabiliriz.

	public static void main(String[] args) {
		
		
	KitapMethod.kitaplarEkle(kitapListe);
	KitapMethod.menu(kitapListe);
	
	
		
		
	}

//	public static void menu(List<Kitap> liste) {
//
//		System.out.println("=================KITAP PROGRAMI==================" + 
//		 "\n1- Kitap ekle\n2- Numara ile kitap sil\n3- Tum kitaplari listele\n4- Bitir");
//
//		System.out.println("Isleminizi seciniz : ");
//		int tercih = scan.nextInt();
//
//		switch (tercih) {
//
//		case 1:
//			kitapEkle(liste);
//			break;
//
//		case 2:
//			noIleSil(liste);
//			break;
//			
//		case 3:
//			listele(liste);
//			break;
//			
//		case 4:
//			bitir();
//			break;
//			
//		default:
//			System.out.println("Yanlis giris yapildi tekrar deneyiniz");
//
//		}
//
//	}
//
//	private static void kitapEkle(List<Kitap> liste) {
//		System.out.println("Kitap ismi giriniz : ");
//		String kitapAdi = scan.nextLine();
//		scan.nextLine(); // dummy ---> kukla demek. Bos scan objesi. Bunu yazarak bos satir yapmis gibi oluyoruz.
//		System.out.println("Kitap yazarinin ismini giriniz : ");
//		String yazarAdi = scan.nextLine();
//		System.out.println("Yayin yilini giriniz : ");
//		int yayinYili = scan.nextInt();
//		System.out.println("Kitabin fiyatini giriniz");
//		double fiyat = scan.nextDouble();
//		
//		
//		Kitap kitap = new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinYili, fiyat);  // Kitap objesi creat ediyoruz.
//		liste.add(kitap);
//		
//		System.out.println(kitap.toString() + " Eklendi :) " + "\n");
//		menu(liste);  // Her method'dan sonra ana menu'ye donmek icin bunu yazmamiz gerekiyor.
//	}
//
//	private static void bitir() {
//		System.out.println("Bizi tercih ettiginiz tesekkur ederiz, yine bekleriz."); 
//
//	}
//
//	private static void listele(List<Kitap> liste) {
//		
//		for (Kitap k : liste) {
//			
//			System.out.println(k.toString());
//			
//		}
//		menu(liste);
//	}
//
//	private static void noIleSil(List<Kitap> liste) {
//		
//		System.out.println("Silinecek kitap no giriniz : ");
//		int silinecekNo = scan.nextInt();
//		
//		for (Kitap k : liste) {
//			
//			if (k.getNo() == silinecekNo ) {
//				liste.remove(k);
//				menu(liste);
//				
//			}
//			
//		}
//
//		System.out.println(silinecekNo + " ait kitap bulunamadi!");
//		menu(liste);
//		
//		
//	}

}
