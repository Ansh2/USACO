package UsacoGuideBronze;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class blockedbillboard {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int a, b, c, d; 
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(f.readLine());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());

		out.close(); 
	}


}
