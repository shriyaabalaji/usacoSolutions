import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

class Main {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(new File("input.txt"));
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    for(int i = 0; i < 7; i++) {
      numbers.add(input.nextInt());
    }
    Collections.sort(numbers);
    int a = numbers.get(0);
    int b = numbers.get(1);
    int c = numbers.get(6) - (a + b);
    System.out.print(a + " " + b + " " + c);
  }
}
