package Dec2020;
import java.util.Random;
import java.util.Scanner;

public class ABC {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(); 
		
//		String input = scan.nextLine(); 
		
		
		int a, b, c, d, e, f, g; 
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt(); 
		d = scan.nextInt(); 
		e = scan.nextInt(); 
		f = scan.nextInt(); 
		g = scan.nextInt(); 


		
		int maximum = Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, Math.max(f, Math.max(g, Integer.MIN_VALUE))))))); 
		
		int finala = 0; 
		int finalb = 0; 
		int finalc = 0; 
		
		int randnum1 = 0; 
		int randnum2 = 0; 
		int randnum3 = 0; 
		
		while (true) {
			randnum1 = rand.nextInt(7) + 1; 
			randnum2 = rand.nextInt(7) + 1; 
			randnum3 = rand.nextInt(7) + 1; 
			
			
			if (randnum1 == 1) {
				randnum1 = a; 
			} else if (randnum1 == 2) {
				randnum1 = b; 
			} else if (randnum1 == 3) {
				randnum1 = c; 
			} else if (randnum1 == 4) {
				randnum1 = d; 
			} else if (randnum1 == 5) {
				randnum1 = e; 
			} else if (randnum1 == 6) {
				randnum1 = f; 
			} else {
				randnum1 = g; 
			} 
			//if (randnum1 == 7) 
			
			
			if (randnum2 == 1) {
				randnum2 = a; 
			} else if (randnum2 == 2) {
				randnum2 = b; 
			} else if (randnum2 == 3) {
				randnum2 = c; 
			} else if (randnum2 == 4) {
				randnum2 = d; 
			} else if (randnum2 == 5) {
				randnum2 = e; 
			} else if (randnum2 == 6) {
				randnum2 = f; 
			} else  {
				randnum2 = g; 
			} 
			//if (randnum2 == 7)
			
			if (randnum3 == 1) {
				randnum3 = a; 
			} else if (randnum3 == 2) {
				randnum3 = b; 
			} else if (randnum3 == 3) {
				randnum3 = c; 
			} else if (randnum3 == 4) {
				randnum3 = d; 
			} else if (randnum3 == 5) {
				randnum3 = e; 
			} else if (randnum3 == 6) {
				randnum3 = f; 
			} else  {
				randnum3 = g; 
			} 
			
			//if (randnum3 == 7)
					
			
			
			if (randnum1 + randnum2 + randnum3 == maximum) {
				finala = randnum1; 
				finalb = randnum2; 
				finalc = randnum3; 
				break; 
			}

		}
		
		if (finala <= finalb  && finalb <= finalc) {
			
			System.out.println(finala + " " + finalb + " " + finalc);
			
		} else if (finalb <= finalc  && finalc <= finala) {
			
			System.out.println(finalb + " " + finalc + " " + finala);
			
		} else if (finalc <= finala && finala <=finalb) {
			
			System.out.println(finalc + " " + finala + " " + finalb);
			
		} else if (finala <= finalc &&  finalc <= finalb) {
			
			System.out.println(finala + " " + finalc + " " + finalb);
			
		} else if (finalb <= finala && finala <= finalc) {
			
			System.out.println(finalb + " " + finala + " " + finalc);
			
		} else if (finalc <= finala && finala <= finalb) {
			System.out.println(finalc + " " + finala + " " + finalb);
		} 
		
		
		
	}

}
