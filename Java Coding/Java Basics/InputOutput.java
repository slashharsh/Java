/* Scanner vs BufferedReader in this program.
Scanner is decent but slower than BufferedReader */
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args){
        // Scanner defination
        Scanner scanThings = new Scanner(System.in);
        // Input is string then readline()
        // String str = str.readLine();
        // Input is integer then 
        System.out.println("Integer: ");
        int x = scanThings.nextInt();
        System.out.println("Integer Value: "+ x);

        // Input is float then 
        System.out.println("Flaot");
        float fx = scanThings.nextFloat();
        System.out.println("Float Value: "+ fx);

        // Long Value
        System.out.println("Long");
        long longValue = scanThings.nextLong();
        System.out.println("Long Value: "+ longValue);

        // Double Value
        System.out.println("Double");
        double doubleValue = scanThings.nextDouble();
        System.out.println("Double Value: "+ doubleValue);

        // String Value
        System.out.println("String");
        String stringValue = scanThings.nextLine();
        System.out.println("String is: "+ stringValue);

        // Character Value
        System.out.println("Char");
        char charValue = scanThings.next().charAt(0);
        System.out.println("Char Value: "+ charValue);

    }

}
