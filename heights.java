package hospitalstay;
import java.util.Scanner;
public class heights {

	private static Scanner in;

	public static void main(String[]args){
		in = new Scanner(System.in);
		int numStudents;
		double [] heights;
		System.out.print("Banyak siswa : ");
		numStudents = in.nextInt();
		heights = new double[numStudents];
		for(int i=0; i<numStudents; i++){
			System.out.print("Masukkan tinggi siswa : ");
			heights[i]=in.nextDouble();
		}
		double maxHeight = heights[0];
		for(int i=1; i<heights.length;i++){
			if(maxHeight<heights[i])
				maxHeight = heights[i];
		}
		double minHeight = heights[0];
		for(int i=1; i<heights.length;i++){
			if(minHeight>heights[i])
				minHeight = heights[i];
		}
		double total=0;
		for(int i=0;i<heights.length;i++){
			total +=heights[i];
		}
		System.out.println("Tinggi siswa maksimal "+maxHeight+" cm");
		System.out.println("Tinggi siswa maksimal "+minHeight+" cm");
		System.out.println("Rata-rata tinggi siswa adalah "+(total/numStudents)+" cm");
	}
}
