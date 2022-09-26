/*
	Program 	: lat5.java
	pembuat 	: Muhammad Abbel Prasetya
	Tanggal 	: 24 September 2022
	Deskripsi 	: if-else-if
*/
import java.util.Scanner;

public class Lat5{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int grade = 68;
		if( grade > 90 ){
		System.out.println("Very good!");
		}
		else if( grade > 60 ){
		System.out.println("Very good!");
		}
		else{
		System.out.println("Sorry you failed");
		}
	}
}