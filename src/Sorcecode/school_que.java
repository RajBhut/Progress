
import java.util.Scanner;

/*
increased price per unit rs.5 in every slab of unit usage from moth of october.
previous bill is 1774.86 with usage of 150 unit & including 18%gst. calculate bill for october .
also check difference of final bill from september and october.
0 -> 50  (02)
051-> 250  (10)
250 -> 350  (13)
350 -> 500  (18)
> 500  (25)

*/
public class school_que
{
    public static void main(String[] args) {
        double  oldbill  =  1774.86;
        double cost =0;
        System.out.println("Enter your october unit: ");
        double userunit = new Scanner(System.in).nextDouble();


        if(userunit >50)
        {
               cost = (50 * 7);
                userunit -= 50;
                if(userunit >200)
            {
                cost += (200*15);
                userunit -= 200;

            }
           else if(userunit>0) {

               cost = (cost + userunit*15);
           userunit = 0;
           }
            if(userunit >100)
            {
                cost += ( 100 *18 );

            }
            else if(userunit>0){

                cost = (cost + userunit*18);
                userunit = 0;
            }
            if (userunit > 150)
            {
                cost += ( 150*23);
                userunit -= 150;
            }
            else if(userunit>0){

                cost = (cost + userunit*23);
                userunit = 0;
            }
            if(userunit > 0)
            {
                cost += (userunit *30);
            }
        }
        else
        {
            cost = (userunit * 7);

        }

        System.out.printf("Your bill of october is %.2f  the diffrence between your pewvious bill is %.2f ",(( cost * 0.18)+cost) ,(Math.abs((( cost * 0.18)+cost)-1774.86)));


    }
}

