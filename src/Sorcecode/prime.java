public class prime
{

    public static void main(String[] args) {
        printPrimebetween(10 ,50);

    }
    public static boolean isprime(int n)
    {
        for (int i = 2 ; i <= n/2 ; i++)
        {
            if (n %i == 0) {
                return false;

            }
        }
        return true;
    }
    public static void printPrimebetween(int start , int end)
    {
        for (int i = start ; i <= end ; i++)
        {
            if(isprime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}
