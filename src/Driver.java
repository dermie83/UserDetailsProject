import java.util.Scanner;

/**
 * This class runs the application and handles the Product I/O
 * @version 1.0
 */
public class Driver{

    private Scanner input = new Scanner(System.in);
    private User user;

    public static void main(String[] args) {
        Driver c = new Driver();
        c.addUser();
        c.printUserDetails();
    }

    //gather the product data from the user and create a new product.
    private void addUser(){
        System.out.print("Enter your Name:  ");
        String userName = input.nextLine();
        System.out.print("Enter your Address:  ");
        String userAddress = input.nextLine();
        System.out.print("Enter your D.O.B.:  ");
        String userDOB = input.nextLine();
        System.out.print("Enter your height in cm: ");
        double userHeight = input.nextDouble();


        user = new User(userName, userAddress, userDOB, userHeight);
    }

    //print the product (the toString method is automatically called).
    private void printUserDetails(){
        System.out.println(user);
    }

}
