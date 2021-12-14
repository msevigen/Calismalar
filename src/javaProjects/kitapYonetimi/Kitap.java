package javaProjects.kitapYonetimi;

public class Kitap {

	private int no; // Bunlar intance variable'lar deger atamak zorunda degiliz.
	private String kitapAdi;
	private String yazarAdi;
	private int yayimYili;
	private double fiyat;
	

	// Bu olusturdugumuz field'ler yani variable'lar default oldugu icin butun
	// package'den ulasilabilir.
	// Encapsulation yaparsak koruma altına almıs oluruz. Bu yuzden private yapalim.
	// Eger private yaparsak mecburen get/set yapmamiz gerekir.


	public Kitap(int no, String kitapAdi, String yazarAdi, int yayimYili, double fiyat) {  // Bu constructor'u otomatik search'den de olusturabiliriz
		super();
		this.no = no;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayimYili = yayimYili;
		this.fiyat = fiyat;
		
	}
		
		public Kitap() {  // Bu parametresiz constructor'i yukarda olusturdugumuz constructor'dan dolayi olusturuyouz.
						  // Cunku yukardaki constructor default constructor'i eziyor. Bu yuzden bi tane parametresiz constructor olusturuyoruz
			
		}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public int getYayimYili() {
		return yayimYili;
	}

	public void setYayimYili(int yayimYili) {
		this.yayimYili = yayimYili;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}