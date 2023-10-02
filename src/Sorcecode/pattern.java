public class pattern
{
    public static void main(String[] args) {
      int raw = 6;
//        for(int i = 0 ; i < raw ; i++ )
//        {
//            for (int j = 1 ; j <=raw*2-1; j++  )
//            {
//                if(i  ==raw-1  )
//                {
//                    System.out.print("*");
//                    continue;
//                }
//                if(j == raw -i || j == raw +i)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

for (int i = 1 ; i <= raw ; i++ )
{
    for (int j = 1 ; j <= raw ; j++)
    {
        if(i == 1 || i ==raw )
        {
            System.out.print("* ");
            continue;
        }
        if(j ==  1 )
        {
            System.out.print("* ");
        }
        else if( j == raw) System.out.print("*");
        else System.out.print("  ");

    }
    System.out.println();
}
    }

}

