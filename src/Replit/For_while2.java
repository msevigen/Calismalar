package Replit;

public class For_while2 {

	public static void main(String[] args) {

//		Write a return method that accepts an integer as input and calculates factorial and prints like output.
//
//		Input : 6
//
//		Output: 6!=6*5*4*3*2*1=720
//
		
		int num = 6;
		
		int c = 1;
		
		System.out.print(num + "!=");
		
		for (int i = num; i >= 2; i--) {
			
			c*=i;
			
			System.out.print(i+"*");
		}
			System.out.print("1=" + c);
		
	}

}
