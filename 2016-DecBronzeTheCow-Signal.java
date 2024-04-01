import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    File myObj = new File("cowsignal.in");
    Scanner file = new Scanner(myObj);
    PrintWriter output = new PrintWriter("cowsignal.out");
    String fline = file.nextLine();
    String[] dimensions = fline.split(" ");
    int m = Integer.parseInt(dimensions[0]);
    int n = Integer.parseInt(dimensions[1]);
    int k = Integer.parseInt(dimensions[2]);
    for(int i = 0; i < m; i++) {
      String row = file.nextLine();
      for(int h = 0; h < k; h++){

        for(int j = 0; j < n; j++) {
          for(int l = 0; l < k; l++) {
            output.print(row.charAt(j));
          }
        }
        output.print("\n");
      }
      }
      file.close();
      output.close();
    }
  }
