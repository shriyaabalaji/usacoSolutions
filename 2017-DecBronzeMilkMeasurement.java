import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(new File("measurement.in"));
    PrintWriter output = new PrintWriter("measurement.out");

    int lines = input.nextInt();

    int bessie = 7;
    int elsie = 7;
    int mildred = 7;

    int max = 0;
    int counter = 0;
    ArrayList<String> old_max_cow = new ArrayList<String>();
    ArrayList<String> new_max_cow = new ArrayList<String>();
    ArrayList<Integer> measures = new ArrayList<Integer>();
    ArrayList<Integer> new_measures = new ArrayList<Integer>();
    ArrayList<Integer> days = new ArrayList<Integer>();
    ArrayList<String> cows = new ArrayList<String>();
    ArrayList<String> changes = new ArrayList<String>();
    ArrayList<Integer> nums = new ArrayList<Integer>();

    old_max_cow.add("Bessie");
    old_max_cow.add("Elsie");
    old_max_cow.add("Mildred");

    for(int i = 0; i < 3; i++) {
      measures.add(7);
      new_measures.add(0);
    }

    for(int i = 0; i < lines; i++){
      days.add(input.nextInt());
      cows.add(input.next());
      changes.add(input.next());
    }

    for(int i = 0; i < lines; i++){
      if(changes.get(i).contains("+")){
        String temp = changes.get(i).replace("+", "");
        changes.set(i, temp);
      }
      int temp2 = Integer.parseInt(changes.get(i));
      nums.add(temp2);
    }
    System.out.println(days);
    System.out.println(cows);
    System.out.println(changes);

    for(int i = 0; i < lines; i++){
      int minimum = Collections.min(days);
      int index = days.indexOf(minimum);
      String cow = cows.get(index);
      if(cow.equals("Bessie")){
        new_measures.set(0, bessie + nums.get(index));
        bessie += nums.get(index);
      }
      else if(cow.equals("Elsie")){
        new_measures.set(1, elsie + nums.get(index));
        elsie += nums.get(index);
      }
      else if(cow.equals("Mildred")){
        new_measures.set(2, mildred + nums.get(index));
        mildred += nums.get(index);
      }
      measures.set(0, bessie);
      measures.set(1, elsie);
      measures.set(2, mildred);
      days.remove(index);
      cows.remove(index);
      nums.remove(index);

      max = (Collections.max(measures));

      if(measures.get(0) == max) {
        new_max_cow.add("Bessie");
      }
      if(measures.get(1) == max) {
        new_max_cow.add("Elsie");
      }
      if(measures.get(2) == max) {
        new_max_cow.add("Mildred");
      }
      
      Set set1 = new HashSet(old_max_cow);
      Set set2 = new HashSet(new_max_cow);
      if(set1.equals(set2) == false){
        counter += 1;
      }

      old_max_cow.clear();
      for(int j = 0; j < new_max_cow.size(); j++){
        old_max_cow.add(new_max_cow.get(j));
      }
      new_max_cow.clear();

    }
    System.out.println(measures);
    output.println(counter);

    input.close();
    output.close();
  }
}

//The cruel prince    the good girl's guy to murder
