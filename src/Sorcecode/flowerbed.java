public class flowerbed
{
//    public static void main(String[] args) {
//
//        int[] bed = {0,1,0,0,0,1};
//        System.out.println(canPlaceFlowers(bed,1));
//
//    }
//
//        public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//
//
//            int i = 0  , counter = 0 ;
//            while(n != 0 && i < flowerbed.length)
//            {
//                while(flowerbed[i] != 1 && i < flowerbed.length )
//                {
//                    counter++;
//                    if(counter == 3)
//                    {
//                        n--;
//                       i = i +counter;
//                       counter = 0;
//
//                    }
//
//                }
//                i++;
//
//
//
//            }
//            if( n >0 )
//            {
//                return false;
//            }
//            else return true;
//        }




    public static void main(String[] args) {
        int[] bed = {0, 1, 0, 0, 1, 1};
        System.out.println(canPlaceFlowers(bed, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, counter = 0;
        while (i < flowerbed.length) {
            while (i < flowerbed.length && flowerbed[i] == 1) {
                i += 2;
            }
            while (i < flowerbed.length && flowerbed[i] == 0) {
                counter++;
                if (counter == 2) {
                    n--;
                    counter = 0;
                }
                i += 2;
            }
        }
        return n <= 0;
    }

}
