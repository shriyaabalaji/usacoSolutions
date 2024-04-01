import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.lang.Math;
class Main {
  public static void main(String[] args) throws FileNotFoundException, IOException{
    BufferedReader in = new BufferedReader(new FileReader("square.in"));
    PrintWriter out = new PrintWriter("square.out");
    StringTokenizer l1 = new StringTokenizer(in.readLine());
    StringTokenizer l2 = new StringTokenizer(in.readLine());
    int lx1 = Integer.parseInt(l1.nextToken());
    int ly1 = Integer.parseInt(l1.nextToken());
    int rx1 = Integer.parseInt(l1.nextToken());
    int ry1 = Integer.parseInt(l1.nextToken());

    int lx2 = Integer.parseInt(l2.nextToken());
    int ly2 = Integer.parseInt(l2.nextToken());
    int rx2 = Integer.parseInt(l2.nextToken());
    int ry2 = Integer.parseInt(l2.nextToken());

    //get x diff and y diff
    int xDiff = Math.max(Math.max(lx1, lx2), Math.max(rx1, rx2)) - Math.min(Math.min(lx1, lx2), Math.min(rx1, rx2));
    int yDiff = Math.max(Math.max(ly1, ly2), Math.max(ry1, ry2)) - Math.min(Math.min(ly1, ly2), Math.min(ry1, ry2));

    //square the largest difference
    int answer = (int)Math.pow(Math.max(xDiff, yDiff), 2);

    System.out.println(answer);
    in.close();
    out.close();
  }
}
