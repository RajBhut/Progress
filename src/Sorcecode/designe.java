import java.util.Scanner;

public class designe {

        public static void main (String[]args){
        System.out.print("Enter Raw:");
        Scanner Input = new Scanner(System.in);
        int raw = Input.nextInt();
        int count = 1;
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }

            System.out.println();
        }
int num = 5;
        for (int i=0; i < raw ; i++)
        {
            for (int j = 0 ; j < raw; j++ )
            {
                if (j<i)
                {
                    System.out.print(" ");
                }
                else System.out.print(num);
                num--;
            }
            num = 5;
            System.out.println();
        }
        for (int i = 0; i < raw ; i++)
        {
            for(int j=0 ; j<= i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }
    }