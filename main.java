import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello");
        int randomNum = (int) (Math.random() *11);
        System.out.println(randomNum);
        System.out.println("enter number");
        int guess = myObj.nextInt();
        System.out.println(guess);

        if (randomNum==guess) {
            System.out.println("You did it");
        }
        else{
            System.out.println("You failed");
            
        }


        
    }  
}