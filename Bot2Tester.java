import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Hello. What is your name? ");
        String yourName = input.nextLine();
        Bot2 b = new Bot2(yourName);
        
        b.greeting();
        System.out.println ("What's your favorite animal?");
        String yourAnimal = input.nextLine();
        b.favoriteAnimal(yourAnimal);
        System.out.println ("Where do you live?");
        String location = input.nextLine();
        b.home(location);
        System.out.println ("What's your favorite number?");
        int yourNumber = input.nextInt();
        b.favoriteNumber(yourNumber); 
        b.goodbye();
    }
}
