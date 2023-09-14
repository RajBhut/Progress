public class Main {
    public static void main(String[] args) {



    }
    public static int maxProfit(int[] prices) {
        int ans = 0;

        for(int i = 0; i < prices.length ; i++)
        {
            for(int j = 1; j<prices.length-i;j++)
            {
                if(prices[i]<prices[j])
                {
                    ans = prices[j] - prices[i];
                    break;
                }
                else{  ans = 0;}
            }
        }
        return ans;
    }
}