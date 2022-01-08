/* Taking input from command line and console */
public class CommandInput {

    public static void main(String[] args){
        // For a console type of input
        // String name = System.console().readLine();
        // System.out.println("Hello "+ name);

        // From CLI
        if(args.length >0){
            for(String val: args)
                System.out.println(val);
        }
        else{
            System.out.println("No Arguments Entered..!!");
        }
    }

    
}
