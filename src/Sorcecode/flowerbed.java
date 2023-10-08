public class flowerbed
{
    public static void main(String[] args) {

        int[] bed = {0,0,1,0,0,0};
        System.out.println(canPlaceFlowers(bed,2));

    }

//        public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//
//
//            int i = 0  , counter = 0 ;
//            while(i < flowerbed.length)
//            {
//                if(i == 0 ) {
//                    if (flowerbed[0] == 0 && flowerbed[1] == 0) {
//                        n--;
//                        i++;
//                        continue;
//                    }
//                }
//                    while (  i < flowerbed.length && flowerbed[i] == 0)
//                    {
//                        counter++;
//                        i++;
//                        if(counter == 3)
//                        {
//                            n--;
//                            counter = 0;
//                            i++;
//                        }
//
//                    }
//
//                i++;
//                    counter = 0;
//            }
//
//
//
//
//
//
//            return n <=0;
//        }




        public static boolean canPlaceFlowers(int[] flowerbed, int n) {
            int i = 0, counter = 0;
            while (i < flowerbed.length) {
                if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    n--;
                    counter = 1; // Set counter to 1 as the current position is occupied
                } else {
                    counter = 0; // Reset counter if the current position cannot be used for planting
                }
                i++;
            }
            return n <= 0;
        }





}
