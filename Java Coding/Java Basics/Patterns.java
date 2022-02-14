public class Patterns {
    public static void main(String args []) {
        int i, j, m=5, n=5;
        // 1. NORMAL ROW-COlUMN

        // for (i=0; i<5; i++){
        //     for (j = 0; j<=i; j++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }

        // 2. Hollow Sqaure

        // for(i = 0; i<=m; i++){
        //     for(j=0; j<=n; j++){
        //         if(i == 0 || i == m || j == 0 || j==n){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println();
        // }

        // 3. Half Pyramid (Right angle triangle)

        // for(i=0; i<=m; i++){
        //     for(j=0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4. Inverted of Above

        // for(i=0; i<=m; i++){
        //     for(j=m; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 5. Rotation of above:

        for(i=0; i<m; i++){
            for(j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
