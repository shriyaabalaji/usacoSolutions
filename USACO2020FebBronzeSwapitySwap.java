import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
class Main {
  public static int a1 = 0;
  public static int a2 = 0;
  public static int b1 = 0;
  public static int b2 = 0;
  public static int reverse(int pos) {
    if(pos >= a1 && pos <= a2) {
      pos = a1 + a2 - pos;
    }
    if(pos >= b1 && pos <= b2) {
      pos = b1 + b2 - pos;
    }
    return pos;
  }

  public static void main(String[] args) throws FileNotFoundException, IOException{
    BufferedReader in = new BufferedReader(new FileReader("swap.in"));
    PrintWriter out = new PrintWriter("swap.out");

    //read info
    StringTokenizer line1 = new StringTokenizer(in.readLine());
    int n = Integer.parseInt(line1.nextToken());
    int k = Integer.parseInt(line1.nextToken());

    StringTokenizer line2 = new StringTokenizer(in.readLine());
    a1 = Integer.parseInt(line2.nextToken());
    a2 = Integer.parseInt(line2.nextToken());

    StringTokenizer line3 = new StringTokenizer(in.readLine());
    b1 = Integer.parseInt(line3.nextToken());
    b2 = Integer.parseInt(line3.nextToken());

    //create empty result Array
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      result.add(-1);
    }

    //solve
    for(int i = 1; i <= n; i++) {
      int loopNum = i;
      int num = reverse(i);
      while(num != i) {
        num = reverse(num);
        loopNum++;
      }
      int remainder = k % loopNum;
      for(int j = 0; j < remainder; j++) {
        num = reverse(num);
      }
      result.set(num - 1, i);
    }

    //print result
    for(int i = 0; i < n; i++) {
      out.println(result.get(i));
    }

    in.close();
    out.close();
  }
}
