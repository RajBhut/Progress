import java.util.Scanner;

public class practisar
{
    public static void main(String[] args) {
        int temp , year , month, day;
        boolean isposible = true;
        boolean isleapyear =true;
        String op;
        System.out.println("ENter yout input as (DD/MM/YYYY)");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        while(in/10000000 >9 || in /10000000 <1)
        {
            System.out.println("Enter valid input!");
            in = input.nextInt();
        }
         op = String.valueOf(in);
         temp = in;
         year = temp%10000;
        temp = temp/10000;
         month = temp%100;
        temp /= 100;
         day = temp;

        while(day<0 ||day>31 || month > 12 || month < 0 || year < 1000 || year  >9999)
        {
            System.out.println("Enter valid input!");
            in = input.nextInt();
             op = String.valueOf(in);
             temp = in;
             year = temp%1000;
            temp = temp/10000;
             month = temp%100;
            temp /= 100;
             day = temp;

        }

        if(month == 2)
        {
            if(day>29)
            {
                isposible = false;
                System.out.println("Enter valid input!");
                in = input.nextInt();
                op = String.valueOf(in);
                temp = in;
                year = temp%1000;
                temp = temp/10000;
                month = temp%100;
                temp /= 100;
                day = temp;

            }
        }
        if(year %4 ==0 && year %100 != 0 || year%400 == 0)
        {
            isleapyear = true;
        }
        else isleapyear = false;




      switch (month)
      {
           case 4: case 6: case 9: case 11:
      {
          if(day>30)
          {
           isposible = false;
          }

      }
          case 2:
          if( !isleapyear&& day >28 || isleapyear &&day >29  )
          {
              isposible= false;
          }
      }
        if (!isleapyear && month ==2&& day>28)
        {
            System.out.println("Enter valid input!");
            in = input.nextInt();
            op = String.valueOf(in);
            temp = in;
            year = temp%1000;
            temp = temp/10000;
            month = temp%100;
            temp /= 100;
            day = temp;
        }

        int outmonth =month, outday = day, outyear = year;

                if(month ==12 && day != 31) {

                    if((month == 1 || month == 3 ||month == 5||month == 7 || month == 8||month == 10 || month == 12)&& day ==31 ||(month == 2 || month == 4 ||month == 6||month == 9 || month == 11)&&day == 30 || (month == 2 && isleapyear && day ==29)|| (month ==2 && !isleapyear && day ==28))
                    {

                        outday = 1;
                        if(month !=12) {
                            outmonth = month + 1;
                            outyear = year;
                        }
                        else {outmonth = 1;  outyear =1+ year;}
                    }

                }
                else
                {
                    outmonth = month;
                    outyear = year;
                    outday = day+1;

                }

        System.out.printf("This is day : %d this is month: %d this is year %d",outday,outmonth,outyear);

    }
}
