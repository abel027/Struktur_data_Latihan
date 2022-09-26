
/*
	Program : Tugas1.java
	pembuat : Muhammad Abbel Prasetya
	Tanggal : 24 September 2022
	Deskripsi : Menentukan Program Bilangan 3
*/

import java.util.Scanner;
public class Lat2 {
	public static void main(String[] args) {
		
		int ganjil,genap,bil;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan bilangan = ");
		bil = in.nextInt();
		
		if (bil % 3 == 0){
			
			System.out.println("Bilangan "+bil+" adalah bilangan kelipatan 3");
			if( bil % 2 == 0){
				System.out.println("Bilangan "+bil+" adalah bilangan genap");
			}else{
				System.out.println("Bilangan "+bil+" adalah bilangan Ganjil");
			}
		}
		else{
			System.out.println("Bilangan "+bil+" Bukan bilangan kelipatan 3");
		}
		
	}
}
