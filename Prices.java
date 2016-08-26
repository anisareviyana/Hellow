package hospitalstay;

import java.util.Scanner;

public class Prices {
	private static Scanner in;
	public static void main(String[]args){
		double[][] prices = new double[5][2];
		in = new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.print("Masukkan harga sebenarnya : ");
			prices[i][0]= in.nextDouble();
			prices[i][1]= prices[i][0]*.70;
		}
		for(int i=0;i<5;i++){
			System.out.println("Harga Sebenarnya Rp "+prices[i][0]+
					"\tHarga Diskon Rp "+prices[i][1]);
		}
	}

}
