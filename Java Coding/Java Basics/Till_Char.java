/* Concatenate till char */
import java.util.Scanner;

public class Till_Char{
    public static void main(String[] args){
        
        Scanner scanString = new Scanner(System.in);
        String stringValue = "";
        while (scanString.hasNextLine()){
            char ch = scanString.next().charAt(0);
            stringValue = stringValue + ch;
        }
    System.out.println("String Formed is: "+ stringValue);
    }

}