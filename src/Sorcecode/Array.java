import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(fill()));
        fillpoint();
        int[] name = {2,1 };

//        maxmin(name);
       sorter(name);
       int[][] number = {{3,5,7},{10,2,9}};
       printarr(number);
       //first is raw second is collum;

//        String name = " Hellow  world abc";
//        rev(name);
//        System.out.println(name);

    }

    //    public static String rev(String q)
//    {
//        int st = 0;
//        int end = 1;
//        while(Character.isWhitespace(q.charAt(end)))
//        {
//            end = end+1;
//            for(int i = st; i <= end/2 ; i++)
//            {
//                char temp =q.charAt(end-i);
//                q.charAt(i) = q.charAt(end-i) ;
//                q.charAt(end-i) = temp;
//            }
//            st = end;
//        }
//        return q;
//    }

    public static int[] fill() {
        System.out.print("Enter how many integer you want to enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            int in = input.nextInt();
            while (!(in < 21 && in > 0)) {
                in = input.nextInt();
            }
            num[i] = in;
        }
        return num;
    }

    public static void fillpoint() {
        System.out.println("How many points you want to enter:");
        Scanner psc = new Scanner(System.in);
        int pn = psc.nextInt();
        Point[] points = new Point[pn];
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x,y : ");
            points[i] = new Point(psc.nextInt(), psc.nextInt());

        }
        for (int i = 0; i < points.length; i++) {
            System.out.print("(" + points[i].x + "," + points[i].y + ")" + " ");
        }

    }

    public static void maxmin(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("The max is: " + max + ", The minimum is: " + min);
    }
public static void sorter(int[] arr)
{
    int s = 0;
    int e = arr.length-1;
    while(s < e)
    {
        while(arr[s] % 2 != 0)
        {
            s++;

        }

        while (arr[e]% 2 == 0)
        {
            e--;
        }
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
        s++;
        e--;

    }
    System.out.println(Arrays.toString(arr));
}
public static void printarr(int[][] arr)
{
    int length = arr.length;
    int sum = 0;
    for (int i = 0 ; i < length ; i++)
    {
        int max = arr[i][0];
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
            sum = sum+arr[i][j];
            if( max < arr[i][j])
            {
                max = arr[i][j];
            }

        }
        System.out.println("The maximum is: " + max);
        System.out.println("The sum of" + i +"th row is: " + sum);
        sum = 0;
        System.out.println();
    }
}


}

