/*
	Program : lat1.java
	pembuat : Muhammad Abbel Prasetya
	Tanggal : 24 September 2022
	Deskripsi : Program bernilai Ganjil atau genap
*/

import java.util.Scanner;

public class Lat1{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int bil;
        System.out.print("Masukan Bilangan = ");
        bil=input.nextInt();
        
        if (bil%2==0){
            System.out.println("Bilangan "+bil+" adalah bilangan genap");
        }else {
             System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
        }
    
  }
}
