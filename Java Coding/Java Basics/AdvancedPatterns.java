public class AdvancedPatterns {
    public static void main(String args[]) {
        for (int i =0; i <= 4; i++ ) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(4-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j-- ) {
                System.out.print("*");
            }
            for(int j = 0; j < 2*(i); j++){
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j-- ) {
                System.out.print("*");
            } 
            System.out.println();
        }

        // 2. Solid Rhombhus
    for (int i = 0; i <= 4; i++) {
        for (int j = 4; j > i; j--) {
            System.out.print(" ");
        }
        for(int j = 0; j<=4; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
