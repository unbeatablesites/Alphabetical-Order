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

        System.out.println(index);




    }

}
