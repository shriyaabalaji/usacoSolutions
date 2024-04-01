import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.IOException;
import java.util.Scanner;

class Main {
  
  static HashSet<Integer> measures = new HashSet<Integer>();

  static void fri(int amount, ArrayList<Integer> barn1, ArrayList<Integer> barn2) {
    for(int i = 0; i < barn2.size(); i++) {
      int bucket = barn2.get(i);
      int y = bucket + amount;
      measures.add(y);
    }
  }

  static void thu(int amount, ArrayList<Integer> barn1, ArrayList<Integer> barn2) {
    for(int i = 0; i < barn1.size(); i++) {
      int bucket = barn1.get(i);
      ArrayList<Integer> new_barn2 = new ArrayList<>(barn2);
      new_barn2.add(bucket);
      ArrayList<Integer> new_barn1 = new ArrayList<>(barn1);
      new_barn1.remove(barn1.indexOf(bucket));
      fri(amount - bucket, new_barn1, new_barn2);
    } 
  }

  static void wed(int amount, ArrayList<Integer> barn1, ArrayList<Integer> barn2) {
    for(int i = 0; i < barn2.size(); i++) {
      int bucket = barn2.get(i);
      ArrayList<Integer> new_barn1 = new ArrayList<>(barn1);
      new_barn1.add(bucket);
      ArrayList<Integer> new_barn2 = new ArrayList<>(barn2);
      new_barn2.remove(barn2.indexOf(bucket));
      thu(amount + bucket, new_barn1, new_barn2);
    }
  }

  static void tue(int amount, ArrayList<Integer> barn1, ArrayList<Integer> barn2) {
    for(int i = 0; i < barn1.size(); i++) {
      int bucket = barn1.get(i);
      ArrayList<Integer> new_barn2 = new ArrayList<>(barn2);
      new_barn2.add(bucket);
      ArrayList<Integer> new_barn1 = new ArrayList<>(barn1);
      new_barn1.remove(barn1.indexOf(bucket));
      wed(amount - bucket, new_barn1, new_barn2);
    } 
  }

  public static void main(String[] args) throws FileNotFoundException, IOException{
    Scanner input = new Scanner(new File("backforth.in"));
    PrintWriter output = new PrintWriter("backforth.out");
    ArrayList<Integer> barn1 = new ArrayList<Integer>();
    ArrayList<Integer> barn2 = new ArrayList<Integer>();
    int amount = 1000;
    int count = 0;
    for(int i = 0; i < 10; i++) {
      barn1.add(input.nextInt());
    }
    for(int i = 0; i < 10; i++) {
      barn2.add(input.nextInt());
    }

    tue(1000, barn1, barn2);

    for(int i = 0; i < measures.size(); i++) {
      count++;
    }

    output.println(count);
    input.close();
    output.close();
  }
}
