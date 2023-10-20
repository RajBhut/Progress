import java.util.Arrays;

public class as
{

    public static void main(String[] args) {
        int num[] = new int[10];
        for(int i = 0 ; i < 10 ; i++)
        {
            num[i] = (int)Math.pow(i ,3);
        }
        System.out.println(Arrays.toString(num));
    }
}
