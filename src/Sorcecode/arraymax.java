import java.util.Arrays;
import java.util.Scanner;

public class arraymax
{
    public static void main(String[] args) {
        System.out.println("Enyer how many number you want yo add!");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int [size];
        for (int i = 0 ; i < size ; i ++)
        {
            System.out.println("Enter number:");
            array[i] = input.nextInt();
        }
        int newarray[] = new int [array.length-1];

        System.out.println("Enter from wich index you want to remove?");
        int dlt = new Scanner(System.in).nextInt();
        for (int i = 0; i < dlt; i++) {
            newarray[i] = array[i];

       }

        for (int i = dlt+1 ; i < array.length ; i++)
        {
            newarray[i-1] = array[i];
        }
        System.out.println("This is old array"+ Arrays.toString(array));
    System.out.println(Arrays.toString(newarray));

      //  int maxarr[] = {1,2,3,3,3,6,5,4,3,9,2,9};
//        int count = 0 ;
//        for (int i = 0; i <maxarr.length ; i++) {
//
//
//        }
//



    }

}
