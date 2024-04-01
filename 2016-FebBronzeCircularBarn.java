import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(new File("cbarn.in"));
    PrintWriter output = new PrintWriter("cbarn.out");
    int numberOfRooms = input.nextInt();
    int minDist = 0;
    ArrayList<Integer> cows = new ArrayList<Integer>();
    
    // Add cow numbers to ArrayList
    for(int i = 0; i < numberOfRooms; i++){
      cows.add(input.nextInt());
    }

    for(int i = 0; i < cows.size(); i++){
      int temp = cows.get(0);
      cows.remove(0);
      cows.add(temp);
      int distance = 0;
      if(i == 0){
        for(int j = 1; j < cows.size(); j++){
        distance += cows.get(j) * j;
        }
        minDist = distance;
      }
      else{
        for(int j = 1; j < cows.size(); j++){
          distance += cows.get(j) * j;
        }
        if(distance < minDist) {
          minDist = distance;
        }
      }
    }
    output.println(minDist);
    input.close();
    output.close();
  }
}
