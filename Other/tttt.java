package Other;
import java.io.*;

// http://www.usaco.org/index.php?page=viewproblem2&cpid=831
public class tttt {
    static int single = 0;
    static int two = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));
        char[] game = new char[9];
        for (int i = 0; i < 3; i++) {
            String s = f.readLine();
            for (int j = 0; j < 3; j++) {
                game[i * 3 + j] = s.charAt(j);
            }
        }

        
        // check diagonals
        count(0, 4, 8, game);
        count(2, 4,  6, game);

        // check per rows
        for (int i = 0; i < 3; i++) {
            count(i * 3, i * 3 + 1, i * 3 + 2, game);
        }
        // check per columns
        for (int i = 0; i < 3; i++) {
            count(i, i + 3, i + 6, game);
        }

        System.out.println(single);
        System.out.println(two);
        out.println(single);
        out.println(two);
        out.close();
    }

    public static void count(int one, int twoArray, int three, char[] game) {
        char[] cows = new char[3];
        cows[0] = game[one];
        cows[1] = game[twoArray];
        cows[2] = game[three];

        if(cows[0] == cows[1] && cows[1] == cows[2]) {
            single++;
        } else if (cows[0] == cows[1] || cows[0] == cows[2] || cows[1] == cows[2]) {
            two++;
         }
    }
}