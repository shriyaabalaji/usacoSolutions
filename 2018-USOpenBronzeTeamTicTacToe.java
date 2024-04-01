import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class Main {
  static boolean check1 = true;
  static boolean check2 = true;
  static boolean check3 = true;
  static boolean check4 = true;
  static boolean check5 = true;
  static boolean check6 = true;
  static boolean check7 = true;
  static boolean check8 = true;
  static ArrayList<String> twoList = new ArrayList();
  public static void two_cow(char[][] board, char ch1, char ch2) {
      if(((board[0][0] == ch1 || board[0][0] == ch2) & (board[0][1] == ch1 ||  board[0][1] == ch2) & (board[0][2] == ch1 || board[0][2] == ch2)) & ((board[0][0] == board[0][1] & board[0][1] == board[0][2])==false)){
        if(check1){
          if(twoList.contains("" + ch1 + ch2) == false) {
            twoList.add("" + ch1 + ch2);
          }
          check1 = false;
        }
      }
      else if(((board[1][0] == ch1 || board[1][0] == ch2) & (board[1][1] == ch1 ||  board[1][1] == ch2) & (board[1][2] == ch1 || board[1][2] == ch2)) & ((board[1][0] == board[1][1] & board[1][1] == board[1][2]) == false)) {
        if(check2){
          if(twoList.contains("" + ch1 + ch2) == false) {
            twoList.add("" + ch1 + ch2);
          }
          check2 = false;
        }
      }
      else if(((board[2][0] == ch1 || board[2][0] == ch2) & (board[2][1] == ch1 ||  board[2][1] == ch2) & (board[2][2] == ch1 || board[2][2] == ch2)) & ((board[2][0] == board[2][1] & board[2][1] == board[2][2])==false)){
        if(check3){
          if(twoList.contains("" + ch1 + ch2) == false) {
            twoList.add("" + ch1 + ch2);
          }
          check3 = false;
        }
      }
      else if(((board[0][0] == ch1 || board[0][0] == ch2) & (board[1][0] == ch1 ||  board[1][0] == ch2) & (board[2][0] == ch1 || board[2][0] == ch2)) & ((board[0][0] == board[1][0] & board[1][0] == board[2][0])==false)){
        if(check4){
          if(twoList.contains("" + ch1 + ch2) == false) {
            twoList.add("" + ch1 + ch2);
          }
          check4 = false;
        }
      }
      else if(((board[0][1] == ch1 || board[0][1] == ch2) & (board[1][1] == ch1 ||  board[1][1] == ch2) & (board[2][1] == ch1 || board[2][1] == ch2)) & ((board[0][1] == board[1][1] & board[1][1] == board[2][1])==false)){
        if(check5){
          if(twoList.contains("" + ch1 + ch2) == false) {
            twoList.add("" + ch1 + ch2);
          }
          check5 = false;
        }
      }
      else if(((board[0][2] == ch1 || board[0][2] == ch2) & (board[1][2] == ch1 ||  board[1][2] == ch2) & (board[2][2] == ch1 || board[2][2] == ch2)) & ((board[0][2] == board[1][2] & board[1][2] == board[2][2])==false)){
        if(check6){
          if(twoList.contains("" + ch1 + ch2) == false) {
            twoList.add("" + ch1 + ch2);
          }
          check6 = false;
        }
      }
      else if(((board[0][0] == ch1 || board[0][0] == ch2) & (board[1][1] == ch1 ||  board[1][1] == ch2) &(board[2][2] == ch1 || board[2][2] == ch2)) & ((board[0][0] == board[1][1] & board[1][1] == board[2][2])==false)){
        if(check7){
          if(twoList.contains("" + ch1 + ch2) == false) {
            twoList.add("" + ch1 + ch2);
          }
          check7 = false;
        }
      }
      else if(((board[0][2] == ch1 || board[0][2] == ch2) & (board[1][1] == ch1 ||  board[1][1] == ch2) &(board[2][0] == ch1 || board[2][0] == ch2)) & ((board[0][2] == board[1][1] & board[1][1] == board[2][0])==false)){
        if(check8){
          if(twoList.contains("" + ch1 + ch2) == false) {
            twoList.add("" + ch1 + ch2);
          }
          check8 = false;
        }
      }
  }
  public static int one_cow(char[][] board) {
    Set<String> ch = new TreeSet<>();
    if(board[0][0] == board[0][1] & board[0][1] == board[0][2]) {
      ch.add(String.valueOf(board[0][0]));
    }
    if(board[1][0] == board[1][1] & board[1][1] == board[1][2]) {
      ch.add(String.valueOf(board[1][0]));
    }
    if(board[2][0] == board[2][1] & board[2][1] == board[2][2]) {
      ch.add(String.valueOf(board[2][0]));
    }
    if(board[0][0] == board[1][0] & board[1][0] == board[2][0]) {
      ch.add(String.valueOf(board[0][0]));
    }
    if(board[0][1] == board[1][1] & board[1][1] == board[2][1]) {
     ch.add(String.valueOf(board[0][1]));
    }
    if(board[0][2] == board[1][2] & board[1][2] == board[2][2]) {
      ch.add(String.valueOf(board[0][2]));
    }
    if(board[0][0] == board[1][1] & board[1][1] == board[2][2]) {
      ch.add(String.valueOf(board[0][0]));
    }
    if(board[0][2] == board[1][1] & board[1][1] == board[2][0]) {
      ch.add(String.valueOf(board[0][2]));
    }
    return ch.size();
  }

  public static void main(String[] args) throws FileNotFoundException, IOException{
    BufferedReader input = new BufferedReader(new FileReader("tttt.in"));
    PrintWriter output = new PrintWriter("tttt.out");

    String line1 = input.readLine();
    String line2 = input.readLine();
    String line3 = input.readLine();

    char[][] board = {{line1.charAt(0), line1.charAt(1), line1.charAt(2)}, {line2.charAt(0), line2.charAt(1), line2.charAt(2)}, {line3.charAt(0), line3.charAt(1), line3.charAt(2)}};

    output.println(one_cow(board));
    for(char strt1 = 'A'; strt1 <='Y'; strt1++ )
    {
      for(char strt2 = (char)(strt1 + 1); strt2 <='Z'; strt2++) {
        two_cow(board, strt1, strt2);
      }
    }

    output.println(twoList.size());
    input.close();
    output.close();
  }
}
