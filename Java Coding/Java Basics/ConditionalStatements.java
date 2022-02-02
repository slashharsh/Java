import java.util.Scanner;
public class ConditionalStatements {

    public static void main(String args[]){
        // Swtich Statement:
        int button;
        Scanner newInput = new Scanner(System.in);
        while(true){
            button = newInput.nextInt();
            switch(button){
                case 1: System.out.println("Hello");
                break;
                case 2: System.out.println("Hola");
                break;
                case 3: System.out.println("Bonjour");
                break;
                default: System.out.println("Nothing to greet");
            }
        }
        }
    
}
