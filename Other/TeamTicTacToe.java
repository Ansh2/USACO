package Other;

import java.io.*;
import java.util.*;

public class TeamTicTacToe {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("paint.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int a, b, c, d;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(f.readLine());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		Random rand = new Random(); 
		int count = 0;
		// insert some code here to calculate count


		boolean gameplay = false;
		String[][] board = new String[3][3];
		
		
//		for (int i = 1; i<=3; i++) {
//			StringTokenizer st = new StringTokenizer(f.readLine())
//			board[i][] += st.toString(); 
//		}
		
		while (gameplay == false) {
		
			
			if (board[1].equals(board[2])) {
				
			}
			
			
		}
		
		
		
		System.out.println(count);
		out.println(count);
		out.close();
	}

}
