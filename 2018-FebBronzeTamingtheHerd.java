import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
  static int answer = 0;
  static int min = 0;
  static int max = 0;
  static int n = 0;
  static ArrayList<Integer> log = new ArrayList<Integer>();
  public static void solve() {
    if(log.get(0) > 0) {
      answer = -1;
      return;
    } else {
      log.set(0, 0);
    }

    for(int i = 1; i < n; i++) {
      if(log.get(i) > 0) {
        for(int j = i; j > 0; j--) {
          if(log.get(j) != 0) {
            if((log.get(j - 1) != (log.get(j) - 1)) &log.get(j - 1) != -1) {
              if(j != 1) {
                answer = -1;
                return;
              }
            } else {
              log.set(j - 1, log.get(j) - 1);
            }
          }
        }
      }
    }

  }

  public static void main(String[] args) throws FileNotFoundException, IOException{
    BufferedReader input = new BufferedReader(new FileReader("taming.in"));
    PrintWriter output = new PrintWriter("taming.out");
    n = Integer.parseInt(input.readLine());

    //read into list
    StringTokenizer in = new StringTokenizer(input.readLine());
    for(int i = 0; i < n; i++) {
      log.add(Integer.parseInt(in.nextToken()));
    }

    solve();

    if(answer == -1) {
      output.println(-1);
    } else {
      for(int i = 0; i < n; i++) {
      if(log.get(i) == 0) {
        min++;
      }
    }

    max = min;

    for(int i = 0; i < n; i++) {
      if(log.get(i) == -1) {
        max++;
      }
    }

    output.println(min + " " + max);
    }
  
    input.close();
    output.close();
  }
}
