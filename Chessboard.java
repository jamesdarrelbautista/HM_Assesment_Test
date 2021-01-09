import java.lang.*;
import java.util.*;
/**
 * Write a description of class Chessboard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chessboard
{
   
   static int letter_to_index(String location){
       String letters = "abcdefgh";
       for(int x=0;x<=letters.length();x++){
           if(location.charAt(0) == letters.charAt(x)){
               return x;
           }
       }
       return -1;
   }
    
    static String black_or_white(String location){
       int index = letter_to_index(location);
       int position = Character.getNumericValue(location.charAt(1));
       if(index % 2 == 0 && position % 2 !=0){
           return "black";
       }
       else if(index % 2 == 0 && position % 2 ==0){
           return "white";
       }
       else if (index % 2 != 0 && position % 2 !=0){
           return "white";
       }
       else{
           return "black";
       }
   }
    
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter chess location: ");
       String location = input.nextLine();
       System.out.println(black_or_white(location));
   }
}
