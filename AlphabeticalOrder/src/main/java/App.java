import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        askForLastName();
    }

    public static void askForLastName(){

        System.out.println("What's your last name?");
        Scanner scan = new Scanner(System.in);

        String str1 = "Z";
        String userInputLastName = scan.nextLine().toUpperCase();

        int index = str1.compareTo(userInputLastName);



        if(index <= 25 && index >= 23){
            System.out.println("You don't have to wait long, "+userInputLastName+".");
        }else if(index <= 23 && index >= 16){
            System.out.println("That's not bad, "+userInputLastName+".");
        }else if(index <= 16 && index >= 7){
            System.out.println("Looks like a bit of a wait "+userInputLastName+".");
        }else if(index <= 7 && index >= 1){
            System.out.println("It's gonna be a while "+userInputLastName+".");
        }else{
            System.out.println("Not going anywhere for a while? "+userInputLastName+".");
        }

            System.out.println(index);

    }

}
