import java.util.Scanner;

public class armstrong
{

    public static void main(String[] args) {
        int rem , sum = 0;
        System.out.println("Enter your number:");
        int num ;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int result = num;
        int len = (int) Math.log10(num) +1;
        for (int i = 0 ; i < len ; i++)
        {
            rem = num %10;
            sum += (int)Math.pow(rem, len);
            num = num /10;

        }
      if(sum == result)
      {
          System.out.println("This number is Armstrong Number!");
      }
      else System.out.println("This is not armstrong Number");


    }

}
