import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(new File("billboard.in"));
    int area = 0;

    int x1 = input.nextInt();
    int y1 = input.nextInt();
    int x2 = input.nextInt();
    int y2 = input.nextInt();

    int x3 = input.nextInt();
    int y3 = input.nextInt();
    int x4 = input.nextInt();
    int y4 = input.nextInt();

    // All 4 Corners Covered
    if(x4 >= x2 & y4 >= y2 & x3 <= x1 & y3 <= y1) {
      area = 0;
    }
    // Any 2 Corners Covered
    else if(x3 <= x2 & y4 >= y2 & y3 <= y1) {
      int dist_y = Math.abs(y2 - y1);
      int dist_x = Math.abs(x3 - x1);
      area = dist_x * dist_y;
    }
    else if(x4 >= x1 & y4 >= y2 & y3 <= y1) {
      int dist_y = Math.abs(y2 - y1);
      int dist_x = Math.abs(x2 - x4);
      area = dist_x * dist_y;
    }
    else if(y3 <= y2 & x3 <= x1 & x4 >= x2) {
      int dist_y = Math.abs(y3 - y1);
      int dist_x = Math.abs(x2 - x1);
      area = dist_x * dist_y;
    }
    else if(y4 >= y1 & x3 <= x1 & x4 >= x2) {
      int dist_y = Math.abs(y2 - y4);
      int dist_x = Math.abs(x2 - x1);
      area = dist_x * dist_y;
    }
    // Any 1 Corner Covered
    else if((x3 <= x2 & y4 >= y1) | (x4 >= x1 & y4 >= y1) | (x4 >= x1 & y2 >= y3) | (x2 >= x3 & y2 >= y3)) {
      int dist_y = Math.abs(y2 - y1);
      int dist_x = Math.abs(x2 - x1);
      area = dist_x * dist_y;
    }

    System.out.println(area);


  }
}

/*
Test Case 1
Input:
2 1 7 4
5 -1 10 3
Output:
15

Test Case 2
Input:
-8 7 5 9
-3 -2 -2 -1
Output:
26
*/
