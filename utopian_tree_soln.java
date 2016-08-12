import java.io.*;
import java.util.Scanner;
public class Solution{
	public static int utopian(int N){
		if(N==0) return 1;
		else if(N%2==0) return utopian(N-1)+1;
		else return 1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(sc.hasNextInt()){
			System.out.println(utopian(sc.nextInt()));
		}
	}
}
