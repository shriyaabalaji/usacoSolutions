import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.lang.Math;
class Main {
  public static void main(String[] args) throws FileNotFoundException, IOException{
    BufferedReader in = new BufferedReader(new FileReader("paint.in"));
    PrintWriter out = new PrintWriter("paint.out");
    StringTokenizer line1 = new StringTokenizer(in.readLine());
    StringTokenizer line2 = new StringTokenizer(in.readLine());
    int a = Integer.parseInt(line1.nextToken());
    int b = Integer.parseInt(line1.nextToken());
    int c = Integer.parseInt(line2.nextToken());
    int d = Integer.parseInt(line2.nextToken());

    //find difference
    int diff = Math.min(b, d) - Math.max(c, a);
    if(diff < 0){
      diff = 0;
    }

    //subtract from sum
    int answer = (b - a) + (d - c) - diff;

    out.print(answer);
    in.close();
    out.close();
  }
}
