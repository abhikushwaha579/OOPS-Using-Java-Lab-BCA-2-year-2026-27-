public class sumAvg {
     public static void main(String[] var0) {
      if (var0.length == 0) {
         System.out.println("Please enter 1st number :  ");
      }

      int var1 = 0;
      int var2 = Integer.parseInt(var0[0]);
      int var3 = Integer.parseInt(var0[1]);
      int var4 = Integer.parseInt(var0[2]);
      var1 = var2 + var3 + var4;
      int var5 = var1 / 3;
      System.out.println("Sum of given Number in command-line argument " + var1);
      System.out.println("Average of given Number in command-line argument " + var5);
   }
}


