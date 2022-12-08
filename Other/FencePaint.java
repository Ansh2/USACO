package Other;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FencePaint {
	
	public static void main(String[] args) throws IOException {
		Scanner st = new Scanner(new File("paint.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
	 
		int a = st.nextInt();
	    int b = st.nextInt();
   	 	int c = st.nextInt();
   	 	int d = st.nextInt();
    
   	 int[] arr = new int[101];

   	 for (int i = a; i < b; i++) {
   		 arr[i] = 1; 
   	 }
   	 for (int i = c; i < d; i++) {
   		 arr[i] = 1;
   	 }
   	 int answer = 0;
   	 for (int i = 0; i <= 100; i++) {
   		 if (arr[i] == 1) {
   			 answer++; 
   		 }
   	 }
   	out.println(answer); 	  
	out.close();
   }
}

