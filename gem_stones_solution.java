import java.io.*;
import java.util.Scanner;
public class Solution{	
    public static boolean exists(char a,String[] array){
		for (int i = 0; i < array.length; i++) {
			if( array[i].indexOf(a) >= 0 ) continue;
			else return false;
		} return true;
	}
	public static String removeDuplicated(String s){
		StringBuilder noDupes = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String si = s.substring(i, i+1);
			if(noDupes.indexOf(si) == -1)
				noDupes.append(si);			
		} return noDupes.toString();
	}
    public static void main(String[] args){
        Scanner sc3 = new Scanner(System.in);
		int length = sc3.nextInt();
		String ts = removeDuplicated(sc3.next());
		String[] rocks = new String[length-1];
		int i=0,count=0;
		
		while(i<length-1){ rocks[i] = removeDuplicated(sc3.next()); i++; }
        sc3.close();
        for (int j = 0; j < ts.length(); j++) {
			if(exists(ts.charAt(j), rocks))
				count++;
		}System.out.println(count);
	}
}