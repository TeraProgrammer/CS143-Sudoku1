import java.util.*;
import java.io.*;

public class SudokuBoard{
   private char[][] board = new char[9][9];
   
   public SudokuBoard(String fileName) {
      try {
         Scanner fileIn = new Scanner(new File(fileName));
        
         for (int r = 0; r < board.length; r++) {
            String line = fileIn.nextLine();
            for (int c = 0; c < board[0].length; c++){
               board[r][c] = line.charAt(c);
            }
         }
      } catch (FileNotFoundException e) {
         System.out.println("Unknown name, file not found.");
      }
   }
   
   public String toString(){
      StringBuilder build = new StringBuilder();
      build.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
      
      for (int r = 0; r < board.length; r++) {
         build.append("{ } { ");
         for (int c = 0; c < board[0].length; c++){
            build.append(board[r][c] + " }{ ");
         }
         build.append("}\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
      }
      
      return build.toString();
   }
}