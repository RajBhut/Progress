import java.util.Scanner;

 public class F_L_sum {


     public static int sum1(int num) {


         int count, rem,  sum = 0;
         System.out.println("Enter a number: ");
         Scanner Input = new Scanner(System.in);
         num = Input.nextInt();
         count = (int) Math.log10(num) + 1;
         int lastcount = count;
         while (num != 0) {
             rem = num % 10;
             if (lastcount == count || count == 1) {
                 sum += rem;
             }
             num = num / 10;
             count--;

         }


return sum;
     }
 }
