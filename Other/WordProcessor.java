package Other;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*; 

public class WordProcessor {
	
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in); 
		
		int n, k; 
		n = scan.nextInt(); //next is same thing as next toekn
		k = scan.nextInt();
		System.out.println();
		scan.nextLine();
		String input = scan.nextLine();
		
		String[] words = input.split(" "); 
		
		int i = 0; 
		boolean sameLine = true; 
		System.out.print(words[i]);
		int addedLength = words[i].length(); 
		while (true) {
			if (addedLength + words[i+1].length() <= k) {
				System.out.print(" " + words[i + 1]);
				addedLength += words[i+1].length(); 
			} else {
				System.out.println(words[i+1]);
			}
			i++;  	
			
			if (i == n) {
				break; 
			}
 		}
			
		
//	}
//
//	public static String removeWhite(String s) {
//		String clone = ""; 
//		for (int i = 0; i < s.length(); i ++) {
//			if (s.charAt(i) == ' ') {
//				continue; 
//			}
//			clone += s.charAt(i); 
//		}
//		return clone; 
//				
//				
//	}
//	
//	
//	public static void main(String[] args) throws IOException {
////		BufferedReader f = new BufferedReader(new FileReader("paint.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));		
//		Scanner sc = new Scanner(new FileReader("word.in"));
//		
//		sc.nextLine()
//		
//		int max = Integer.parseInt(sc.nextLine().split(" ")[1]); 
//		String[] given = sc.nextLine().split(" "); 
//		List<String> essay = new ArrayList(Arrays.asList(given)); 
//		
//		String toWrite = ""; 
//		while (essay.size() > 0) {
//			if (((removeWhite(toWrite)) + essay.get(0)).length() <= max) {
//				if (toWrite.length() > 0) {
//					toWrite += (" " + essay.get(0)); 
//				} else {
//					toWrite += (" " + essay.get(0)); 
//				}
//			} else {
//				out.println(toWrite); 
//				out.flush(); 
//			}
//		}
//		
//		if (toWrite.length() > 0) {
//			out.println(toWrite); 
//			out.flush(); 
//		}
//		out.close(); 
//				
//	}
	
	}
	
}
