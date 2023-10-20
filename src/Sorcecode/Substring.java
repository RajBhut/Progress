public class Substring
{
    public static void main(String[] args) {
        String q = "abc";
        String qb = "eajksc";


        int i  = 0, j = 0;
        while(i < q.length() && j < qb.length())
        {
            if(qb.charAt(j) ==q.charAt(i) )
            {
                i++;
                j++;

            }
            else {
                j++;
            }
        }
        if(i == q.length())
        {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
