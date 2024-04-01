import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IndexOutOfBoundsException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws FileNotFoundException, IndexOutOfBoundsException{
    Scanner input = new Scanner(new File("cownomics.in"));
    PrintWriter output = new PrintWriter("cownomics.out");
    int n = input.nextInt();
    int m = input.nextInt();
    int count = 0;
    ArrayList<String> spotty = new ArrayList<String>();
    ArrayList<String> plain = new ArrayList<String>();
    for(int i = 0; i < n; i++){
      spotty.add(input.next());
    }
    for(int i = 0; i < n; i++){
      plain.add(input.next());
    }
    for(int i = 0; i < m; i++){
      boolean possible = true;
      ArrayList<String> in_spotty = new ArrayList<String>();
      ArrayList<String> in_plain = new ArrayList<String>();
      for(int j = 0; j < n; j++){
        in_spotty.add(String.valueOf(spotty.get(j).charAt(i)));
        in_plain.add(String.valueOf(plain.get(j).charAt(i)));
      }
      for(int j = 0; j < in_spotty.size(); j++){
        if(in_plain.contains(in_spotty.get(j))){
          possible = false;
          break;
        }
      }
      if(possible == true){
        count += 1;
      }
    }
    output.println(count);
    input.close();
    output.close();
  }
}
