public class Greeting {

    public static void main(String[] args) {
        // Check if arguments were provided
        if (args.length > 0) {
            // args[0] is the first argument
            String name = args[0];
            System.out.println("Hello, " + name + "!");
            
            // Print all arguments
            System.out.println("You provided " + args.length + " argument(s):");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  args[" + i + "] = " + args[i]);
            }
        } else {
            System.out.println("Hello, Stranger!");
            System.out.println("Usage: java Greeting <your-name>");
        }
    }
}