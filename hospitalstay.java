package hospitalstay;

import java.util.Scanner;

public class hospitalstay {

	private static Scanner in;
	private static Scanner in2;
	public static void main(String[] args){
		in2 = new Scanner(System.in);
		double medCharges=0, labCharges=0, hospitalCharges=0, totalCost;
		String  response = "";
		do{
			if(checkForOvernight()== true){
				System.out.println("Masukkan pembayaran rawat inap : ");
				hospitalCharges = in2.nextDouble();
			}
			else
			{
				hospitalCharges = 0;
			}
			System.out.println("Masukkan harga obat : ");
			medCharges = in2.nextDouble();
			System.out.println("Masukkan pembayaran lab : ");
			labCharges = in2.nextDouble();
			totalCost = hospitalCharges + medCharges + labCharges;
			printTotal(totalCost);
			System.out.println("Apakah ada pasien lain? (y/t)");
			response = in2.next();
			
		}while(response.equalsIgnoreCase("y"));
	}
	public static boolean checkForOvernight()
	{
		in = new Scanner(System.in);
		String response="";
		System.out.println("Apakah rawat inap? (y/t)");
		response = in.next();
		if(response.equalsIgnoreCase("y"))
			return true;
		else
			return false;
	}
	public static void printTotal(double totalCost)
	{
		System.out.println("Total pembayaran : "+totalCost);
	}
}
