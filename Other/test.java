package Other;

/*
	ID: ansh.ny1
	LANG: JAVA
	TASK: test
*/

import java.io.*;
import java.util.*;
public class test {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int a = Integer.parseInt(st.nextToken()); 
		int b = Integer.parseInt(st.nextToken()); 
		
		out.println(a + b); 
		out.close(); 
		
		
		
	}

}
