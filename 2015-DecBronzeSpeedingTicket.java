import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
class Main {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(new File("speeding.in"));
    PrintWriter output = new PrintWriter("speeding.out");
    ArrayList<Integer> n_miles = new ArrayList<Integer>();
    ArrayList<Integer> n_speeds = new ArrayList<Integer>();
    ArrayList<Integer> m_miles = new ArrayList<Integer>();
    ArrayList<Integer> m_speeds = new ArrayList<Integer>();
    int n = input.nextInt();
    int m = input.nextInt();
    int speed = 0;
    int limit = 100;
    int greatest = 0;

    for (int i = 0; i < n; i++){
      n_miles.add(input.nextInt());
      n_speeds.add(input.nextInt());
    }

    for (int i = 1; i < n; i++){
      n_miles.set(i, n_miles.get(i) + n_miles.get(i-1));
    }

    for (int i = 0; i < m; i++){
      m_miles.add(input.nextInt());
      m_speeds.add(input.nextInt());
    }

    for (int i = 1; i < m; i++){
      m_miles.set(i, m_miles.get(i) + m_miles.get(i-1));
    }

    for (int i = 0; i < 100; i++){
      for (int j = 0; j < n; j++) {
        if (j == 0) {
          if (i <= n_miles.get(j) & i > 0){
            limit = n_speeds.get(j);
          }
        }
        else {
          if (i <= n_miles.get(j) & i > n_miles.get(j-1)){
            limit = n_speeds.get(j);
          }
        }
      }
      for (int k = 0; k < m; k++) {
        if (k == 0) {
          if (i <= m_miles.get(k) & i >= 0){
            speed = m_speeds.get(k);
          }
        }
        else {
          if (i <= m_miles.get(k) & i > m_miles.get(k-1)){
            speed = m_speeds.get(k);
          }
        }
      }
      if (speed > limit) {
        if (speed - limit > greatest) {
          greatest = speed - limit;
        }
      }
    }

    output.println(greatest);
    input.close();
    output.close();
  }
}
