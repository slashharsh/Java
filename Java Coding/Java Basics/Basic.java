import java.util.Scanner;

public class Basic {

    public static void main(String args[]){
       System.out.println("Enter 2 Numbers");
       Scanner inputNumbers = new Scanner(System.in);
       int a = inputNumbers.nextInt();
       int b = inputNumbers.nextInt();
       System.out.println("Their Sum is "+a+b);

    
    }   

}