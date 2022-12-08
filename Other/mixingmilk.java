package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*; 

public class mixingmilk {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader f = new BufferedReader(new FileReader("mixmilk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		
		int c1 = Integer.parseInt(st.nextToken());

		int m1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine()); 
		
		int c2 = Integer.parseInt(st.nextToken());
		
		
		int m2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine()); 
		
		int c3 = Integer.parseInt(st.nextToken()); 
		

		int m3 = Integer.parseInt(st.nextToken()); 
			

		
		int amountinbucket1 = 0; 
		int amountinbucket2 = 0; 
		int amountinbucket3 = 0; 
		
		for (int i = 0; i <= 33; i ++) {
			amountinbucket1 = Math.min(m1, c2 - m2); 
			m1 -= 	amountinbucket1;
		    m2 += 	amountinbucket1;
			amountinbucket2 = m1 - Math.min(m1, c2 - m2); 
			m1 -= 	amountinbucket2;
		    m2 += 	amountinbucket2;
			amountinbucket3 = m2 + Math.min(m1, c2 - m2); 
			m1 -= 	amountinbucket3;
		    m2 += 	amountinbucket3;
			
		}
		amountinbucket1 = Math.min(m1, c2 - m2); 
		amountinbucket2 = m1 - Math.min(m1, c2 - m2); 
		amountinbucket3 = m2 + Math.min(m1, c2 - m2); 
		
		
		out.println(amountinbucket1); 
		out.println(amountinbucket2); 
		out.println(amountinbucket3); 
		
		
	
		
		
		out.close(); 
		
		
		
	}
	
}