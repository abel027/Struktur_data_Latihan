/*
	Program : lat1.java
	Pembuat : Muhammad Abbel Prasetya
	Tanggal : 17 September 2022
	Deskripsi : Tukar 2 variable

*/

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		int a,b,c;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Bilangan Pertama = ");
		a = input.nextInt();
		
		System.out.print("Masukkan Bilangan Kedua = ");
		b = input.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("Nilai a="+a);
		System.out.println("Nilai b="+b);
		
	}
}