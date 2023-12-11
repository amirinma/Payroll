import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String name;
    int age;
    double income;
    Scanner keyboard = new Scanner(System.in);
    // get the user age 
    System.out.println("What's your age?");
    age = keyboard.nextInt();
    // get the user income
    System.out.println("What is your income?");
    income = keyboard.nextDouble();

    // consume the new line 
    keyboard.nextLine();
    // get the user name
    System.out.println("What is your name?");
    name = keyboard.nextLine();
    // display the information back to the user
    System.out.println("Hello, " + name + ". Your age is " + age + " and your income is " + income);
  }
}