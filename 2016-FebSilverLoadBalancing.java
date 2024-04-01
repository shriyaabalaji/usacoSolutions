import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

class Main {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(new File("balancing.in"));
    PrintWriter output = new PrintWriter("balancing.out");
    int n = input.nextInt();
    int min_m = 1000;
    ArrayList<Integer> x_vals = new ArrayList<Integer>();
    ArrayList<Integer> y_vals = new ArrayList<Integer>();

    for(int i = 0; i < n ; i++){
      x_vals.add(input.nextInt());
      y_vals.add(input.nextInt());
    }
    for(int a = Collections.min(x_vals) - 1; a <= Collections.max(x_vals) + 1; a += 2){
      for(int b = Collections.min(y_vals) - 1; b <= Collections.max(y_vals) + 1; b += 2){
        ArrayList<Integer> counts = new ArrayList<Integer>();
        counts.add(0);
        counts.add(0);
        counts.add(0);
        counts.add(0);
        for(int i = 0; i < n; i++){
          if(x_vals.get(i) < a & y_vals.get(i) > b){
            counts.set(0, counts.get(0) + 1);
          }
          else if(x_vals.get(i) > a & y_vals.get(i) > b){
            counts.set(1, counts.get(1) + 1);
          }
          else if(x_vals.get(i) < a & y_vals.get(i) < b){
            counts.set(2, counts.get(2) + 1);
          }
          else if(x_vals.get(i) > a & y_vals.get(i) < b){
            counts.set(3, counts.get(3) + 1);
          }
        }
        int m = Collections.max(counts);
        if(m < min_m){
          min_m = m;
        }
      }
    }
    output.println(min_m);
    input.close();
    output.close();
  }
}
