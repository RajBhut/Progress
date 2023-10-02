import java.util.Random;
import java.util.Scanner;

public class practice_50
{
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.greetgame();Scanner sc = new Scanner(System.in);
        System.out.println("do you want to add coustom guss chances?");
        System.out.println("If yes then press 1 or otherwise press 2");
        int cg = sc.nextInt();
        if(cg ==1)
        {
            System.out.println("Ener your chance: ");
            int temp = sc.nextInt();
            g1.setGuss(temp);
        }

        System.out.println("ENter your guss");
        int num = sc.nextInt();
        int random = g1.rangan() ;

        while(g1.getGuss() != 0)
        {


            if (random == num)
            {
                System.out.println("You are right!");
                break;
            } else if (random < num) {
                System.out.println("The number is big");

            }
            else {
                System.out.println("The number is small");
            }
            g1.setGuss(g1.getGuss()-1);
            System.out.println("Enter your guss: ");
            num =  sc.nextInt();
        }
        if (random != num)
        {
            System.out.println("You are out of moves!");
        }



    }
    static class Game{
     //   private int ran;
        private int guss;

      public  static void greetgame()
        {
            System.out.println("Welcom to Our game!");
            System.out.println("In this  game you have to choos number between 1 to 100. ");
            System.out.println("In certain number of gusses you have to guss the number.");
        }

        public Game() {

            this.guss = 5;



        }
        public Game(int guss)
        {
            this.guss = guss;
        }

        public void setGuss(int guss) {
            this.guss = guss;
        }

        public int getGuss() {
            return guss;
        }





       public  static int rangan()
        {
            Random ra = new Random();
            int ran = ra.nextInt(101);

             return ran;
        }


    }
}
