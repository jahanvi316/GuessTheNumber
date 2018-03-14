import java.util.Scanner;
import java.awt.Component;
import javax.swing.JOptionPane;

public class guessTheNumber{
   public static void main(String[] args){
     // Scanner input = new Scanner( System.in );
      int answer = 0;
      
      JOptionPane.showMessageDialog(null, "Think of a number 0 through 31. Don't tell me, I'll know it anyways.");
     // int input = JOptionPane.showConfirmDialog(null, "Think of a number 0 through 31. Keep it to yourself.");
      
      int input1 = JOptionPane.showConfirmDialog(null, "Is your number one of the following: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31?");  
      if (input1 == JOptionPane.YES_OPTION) {
         answer += 1;
      }
            
      int input2 = JOptionPane.showConfirmDialog(null, "Is your number one of the following: 8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 31?");  
      if (input2 == JOptionPane.YES_OPTION) {
         answer += 8;
      }
      
      int input3 = JOptionPane.showConfirmDialog(null, "Is your number one of the following: 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31?");  
      if (input3 == JOptionPane.YES_OPTION) {
         answer += 16;
      }    
      
      int input4 = JOptionPane.showConfirmDialog(null, "Is your number one of the following: 4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31?");  
      if (input4 == JOptionPane.YES_OPTION) {
         answer += 4;
      }
      
      int input5 = JOptionPane.showConfirmDialog(null, "Is your number one of the following: 2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31?");  
      if (input5 == JOptionPane.YES_OPTION) {
         answer += 2;
      }
      
      JOptionPane.showMessageDialog(null, "Your number was " + answer + ". Right?");
      //System.out.println("Was your number " + answer + "?");
   }
}