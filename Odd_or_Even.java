import java.util.Scanner;
import java.lang.String;
/**
 * Write a description of class odd_or_even here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Odd_or_Even
{
    static String odd_or_even(int num){
        if(num % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int num = input.nextInt();
        System.out.println(odd_or_even(num));
    }
}
