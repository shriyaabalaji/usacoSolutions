import java.lang.String.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(new File("input.txt"));
    int n = input.nextInt();
    int k = input.nextInt();
    int count = 0;
    for(int i = 0; i < n; i++) {
      String word = input.next();
      int temp = count + word.length();
      if(temp <= k) {
        if(i == 0) {
          System.out.print(word);
          count = temp;
        }
        else {
          System.out.print(" " + word);
          count = temp;
        }
      }
      else {
        count = word.length();
        System.out.print("\n" + word);
      }
    }
    input.close();
  }
}
