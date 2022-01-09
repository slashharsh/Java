/* Type casting in Java */
public class Casting {
    public static void main(String[] args){
        double rate = 4.5, quantity = 11.2, cost;
        cost = rate*quantity;
        System.out.println("Actual Cost: "+cost);
        // Casting to Integer for an approx rate
        int approxCost = (int)cost;
        System.out.println("Approx Cost: "+approxCost);
        // Casting to double.
        int x=32, y=5;
        double division = (double)x/y;
        System.out.println("After Cast from Int to Double: "+division);

    }
}
