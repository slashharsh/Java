public class Loops {
    public static void main(String args[]) {

        // For Loop:
        for(int i=0; i<10; i++) { // if no confition then infinite loop.
            System.out.println("Hello "+i+" th Time..!!"); 
        }
        // While Loop:
        int i = 0;
        while(i < 10) {
            System.out.println("Hello from while loop"+i+"th Time..!!");
            i++;
        }
        // Do while loop:
        int j = 10;
        do {
            System.out.println(j);
            j++;
        }while(j < 10);
    }
    
}
