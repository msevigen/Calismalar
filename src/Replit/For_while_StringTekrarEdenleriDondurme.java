package Replit;

public class For_while_StringTekrarEdenleriDondurme {

	public static void main(String[] args) {

		/*
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazıniz.(mülakat Sorusu)
		 * 
		 * Input : String str = “Javaisalsoeasy”
		 * 
		 * Output: a s
		 */

		String str = "Javaisalsoeasy";

		String c = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.indexOf(str.substring(i, i + 1)) != str.lastIndexOf(str.substring(i, i + 1)) & !c.contains(str.substring(i, i + 1))) {  // a a s a s a s sadece if i calistirmis oluyoruz

//				if (!c.contains(str.substring(i, i + 1))) {

					c += str.substring(i, i + 1) + " "; 
					
//				}

			}

		}

		System.out.println(c);

	}

}
