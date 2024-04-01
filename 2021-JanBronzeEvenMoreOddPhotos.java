import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws FileNotFoundException, IOException{
    BufferedReader in = new BufferedReader(new FileReader("input.txt"));
    PrintWriter out = new PrintWriter("output.txt");
    int n = Integer.parseInt(in.readLine());
    int even = 0;
    int odd = 0;

    //read into ArrayList
    ArrayList<Integer> id = new ArrayList<Integer>();
    StringTokenizer line = new StringTokenizer(in.readLine());
    for(int i = 0; i < n; i++) {
      id.add(Integer.parseInt(line.nextToken()));
    }

    //count even and odd numbers
    for(int i = 0; i < n; i++) {
      if(id.get(i) % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }

    //check if each cow has own group
    if(even == odd || even == odd + 1) {
      out.println(n);
    //check if more even
    } else if(odd + 1 < even) {
      out.println(odd + odd + 1);
    //check if more odd
    } else if(odd > even) {
      while(odd > even) {
        even++;
        odd -= 2;
        if(even == odd || even == odd + 1) {
          out.println(odd + even);
        } else 
        if(odd + 1 < even) {
          out.println(odd + odd + 1);
        }
      }
    }

    in.close();
    out.close();
  }
}
