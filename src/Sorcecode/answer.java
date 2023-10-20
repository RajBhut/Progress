class answer
{

    public static void main (String args[])
    {
        String test = "Hellow";

        System.out.print(reverseVowels(test));
    }

    public static String reverseVowels(String s)
    {
        int count= 0 ;
        int pl = 0;
        int pr = s.length()-1;
        String ns = "";
        char[] stor = new char[s.length()];
        for(int i=0 ; i < s.length(); i++)
        {
            stor[i] = s.charAt(i);
        }
        while(pl<=pr && count <= stor.length/2)
        {
            while(pl < pr &&  stor[pl] != 'a' &&stor[pl] != 'e' &&stor[pl] != 'i' && stor[pl] != 'o' &&stor[pl] != 'u' &&stor[pl] != 'A' &&stor[pl] != 'E' &&stor[pl] != 'I' &&stor[pl] != 'O' &&stor[pl] != 'U' )
            {
                pl++;
            }


            while(pr > pl && stor[pr] != 'a' &&stor[pr] != 'e' &&stor[pr] != 'i' && stor[pr] != 'o' &&stor[pr] != 'u' &&stor[pr] != 'A' &&stor[pr] != 'E' &&stor[pr] != 'I' &&stor[pr] != 'O' &&stor[pr] != 'U' )
            {
                pr--;
            }
            if( (pl < pr &&stor[pl] == 'a' ||stor[pl] == 'e' ||stor[pl] == 'i' || stor[pl] == 'o' ||stor[pl] == 'u' ||stor[pl] == 'A' ||stor[pl] == 'E' ||stor[pl] == 'I' ||stor[pl] == 'O' ||stor[pl] == 'U')&&( stor[pr] == 'a' ||stor[pr] == 'e' ||stor[pr] == 'i' || stor[pr] == 'o' ||stor[pr] == 'u' ||stor[pr] == 'A' ||stor[pr] == 'E' ||stor[pr] == 'I' ||stor[pr] == 'O' ||stor[pr] != 'U' )
) {
                char temp = stor[pl];
                stor[pl] = stor[pr];
                stor[pr] = temp;
                pl++;
                pr--;
            }

count++;
        }
        for(int i = 0 ; i < s.length()-1; i++)
        {
            ns = ns+ stor[i];
        }
        return ns;

    }
}