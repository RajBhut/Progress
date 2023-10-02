import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist
{
    public static void main(String[] args) {

//         ArrayList<Integer> arl = new ArrayList<>(takearrlist());
//        for ( int e:arl) {
//            System.out.print(e + " ");
//
//        }
//
        arlist listarr = new arlist();
        System.out.println("1 : add");
        System.out.println("2 : remove");
        System.out.println("3 :Display");
        System.out.println("4 : Exit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while ((num == 4 || num == 1||num == 2||num == 3))
        {
            if(num == 1)
            {
                System.out.println("Enter num: ");
                Scanner input = new Scanner(System.in);
                int a = input.nextInt();
                arlist.addel(a);
            }
            if(num == 2)
            {
                System.out.println("Enter index: ");
                Scanner input = new Scanner(System.in);
                int a = input.nextInt();
                arlist.remove(a);
            }
            if(num == 3)
            {
               arlist.display();
            }
            if(num == 4)
            {
                System.out.println("Ended!");
                break ;
            }
            System.out.println();
            System.out.println("1 : add");
            System.out.println("2 : remove");
            System.out.println("3 :Display");
            System.out.println("4 : Exit");

            num = sc.nextInt();

        }



    }
    public static ArrayList<Integer> takearrlist()
    {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("How many eliment you want to enter? ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num ; i++) {
      int add = sc.nextInt();
      if(!al.contains(add)) {
          al.add(add);
      }

        }
        Collections.sort(al);

        return al;
    }
    public static class arlist
    {
        public static ArrayList<Integer> al = new ArrayList<>();


        public static void addel(int num)
        {
            al.add(num);
            System.out.println("Added! ");
        }
        public static void remove(int n) {
            if (n < al.size()) {
                al.remove(n);
                System.out.println("Removed! ");
            }
            else {
                System.out.println("Enter valid index : ");
            }
        }
        public static void display()
        {
            System.out.print("[ ");
            for (int e:al
                 ) {
                System.out.print(  e + " " );

            }
            System.out.print(" ]");
        }


    }
}
