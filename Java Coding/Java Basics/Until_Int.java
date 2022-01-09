/* To caluculate mean until the number is integer */
 
import java.util.Scanner;

public class Until_Int {
    public static void main(String [] args){
        Scanner scanInt = new Scanner(System.in);
        int sum = 0; int count = 0;
        while (scanInt.hasNextInt()) {
            int num = scanInt.nextInt();
            sum += num;
            count++;
        }
        System.out.println("Mean is: "+ sum/count);
    }
}
