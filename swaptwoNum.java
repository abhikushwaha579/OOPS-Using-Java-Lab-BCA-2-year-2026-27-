public class swaptwoNum {
     public static void main(String[] var0) {
      int var1 = 12;
      int var2 = 77;
      System.out.println("Before Swap : " + var1);
      System.out.println("Before Swap : " + var2);
      var1 += var2;
      var2 = var1 - var2;
      var1 -= var2;
      System.out.println("After Swap : " + var1);
      System.out.println("After Swap : " + var2);
   }
}
