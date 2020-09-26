import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name,age and salery:");

        // String input
        String name = myObj.nextLine();
        // numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // output input by user
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
    }

}
