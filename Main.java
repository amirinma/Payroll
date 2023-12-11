import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String name; // To hold a name
    int hours; //hours worked
    double payRate; // Hourly pay rate
    double grossPay; // Gross pay
  // create scanner object to read input
    Scanner keyboard = new Scanner(System.in);
    // Get the user's name.
    System.out.print("What is your name? ");
    name = keyboard.nextLine();

    //get the number of hours worked this week
    System.out.println("How many hours did you work this week? ");
    hours = keyboard.nextInt();

    //get the number of hourly pay rate 
    System.out.println("What is your hourly pay rate? ");
    payRate = keyboard.nextDouble();

    //calculate the gross pay
    grossPay = hours * payRate;

    // display the result information 
    System.out.println("Hello, " + name);
    System.out.println("Your gross pay is $" + grossPay);
  }
}