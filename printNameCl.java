class printNameCl{
 public static void main(String[] args) {
       if (args.length == 0) {
         System.out.println("Please enter your name as a command-line argument.");
      } else if (args.length == 0) {
         System.out.println("Please enter your age as a command-line argument.");
      } else {
         System.out.println("Your name is: " + args[0]);
         System.out.println("Your age is: " + args[1]);
      }
 }
}