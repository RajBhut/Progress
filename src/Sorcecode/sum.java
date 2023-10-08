import java.util.Arrays;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter how many numbers you want to add: ");
        int num = sc.nextInt();
        if (num > 21 || num < 0) {
            while ((num > 21 || num < 0)) {
                System.out.println("Enter valid range");
                num = sc.nextInt();
            }
        }
        int arr[] = new int[num];
        int i = 0;
        int count = num;
        while (count > 0) {
            System.out.println("Enter number: ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            count--;
            i++;


        }

        System.out.println(Arrays.toString(arr));
        System.out.println("sum is : " + sum);
    }
}
