import java.io.*;
import java.util.Scanner;
import java.lang.Math.*;
public class Solution{
	public static void main(String[] args){
		Scanner sc2 = new Scanner(System.in);
		int freeway_length = sc2.nextInt(),test_cases = sc2.nextInt(),entry,exit,min,prevMin=-1,i=0;
		int[] width = new int[freeway_length]; 
		
		while(sc2.hasNextInt() && i<freeway_length)
			width[i] = sc2.nextInt(); i++; 
		
		while( sc2.hasNextInt() ){
			entry = sc2.nextInt(); 
			exit = sc2.nextInt();
			prevMin = Math.min( width[entry], width[exit] );
			
			for(int j=entry+1;j<exit;j++){
				min = Math.min(width[j],width[exit]);
				if(min<prevMin){ prevMin = min; }
			} System.out.println(prevMin);
			
		}
	}
}