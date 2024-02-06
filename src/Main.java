import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your name:");
        String firstName = scanner.next();
        System.out.println("Enter your favourite food:");
        String favouriteFood = scanner.next();
        System.out.println("\n" + "First name: " + firstName +"\n \n" + "Age: " + age+"\n \n" + "Favourite Food: " + favouriteFood);





    }

}