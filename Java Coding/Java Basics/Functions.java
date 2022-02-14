import java.util.Scanner;

public class Functions {
    public static void printMyName(String name) {
        System.out.println("This is sample function to print my name ");
        System.out.println(name);
        return;
    }
    public static int addTwoNumbers(int x, int y) {
        return x + y;
    }
    public static int calculateProduct(int x, int y){
        return x * y;
    }
    public static void main(String args[]){ 
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // printMyName(name);
        int sum = addTwoNumbers(12, 12);
        System.out.println("Sum is: "+ sum);
        // 
        System.out.println("Product is: "+ calculateProduct(12, 12));
        
    }
}
