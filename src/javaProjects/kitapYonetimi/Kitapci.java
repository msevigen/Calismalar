package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*  ===============================PAZAR PROJEMIZ====================================
	 
	 	* Bir kitapci icin program yazalim, kitap no 1000'den baslayarak sirali no olsun
	 	
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
	
	
	
	static List<Kitap>kitapListe = new ArrayList<>(); // Butun class'lardan ulasilabilmesi icin basina static getiriyoruz.
													  // Gokteki ay haline getiriyoruz :)
	
	static Scanner scanner = new Scanner(System.in);  // Surekli kullanicidan bir veri isteyecegimiz icin (Kitabin ismini giriniz vs vs..) 
													  // class level'da Scanner objesi olusturmamiz mantikli olacaktir.
	
	static int kitapNo = 1000;                        // Kitap numarasini her method'da kullanabilmek icin buraya kitapNo objesi de olusturuyoruz.
													  // 1000'den baslayip artirabiliriz. 
	
	public static void main(String[] args) {
		
		
	}
	
	public static void menu(List<Kitap> list) {
		
		System.out.println("=================KITAP PROGRAMI=================\n1- Kitap ekle\n2- Numara ile kitap sil\n3- Tum kitaplari listele\n4- Bitir");
		
	}
	
}


