Question 1- printing Hello world
  
  //CT101/G/19500/23
//This a code dhowing the simple syntax for printing hello world
public class Main{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}

Question 2

  public class Main {
    public static void main(String[] args) {
        int num1 = 45; // First number
        int num2 = 5; // Second number

        int sum = num1 + num2; // Calculate the sum

        System.out.println("The sum is: " + sum); // Print the result
    }
}

    Question 3

       public class Main {
    public static void main(String[] args) {
        // Hardcoded inputs
        double salary = 50000; // Example salary
        int yearsOfService = 8; // Example years of service

        // Determine the bonus percentage
        double bonusPercentage = (yearsOfService > 10) ? 12 :
                                 (yearsOfService >= 6) ? 10 : 8;

        // Calculate and display the bonus
        double bonus = salary * bonusPercentage / 100;
        System.out.println("Your net bonus amount is: $" + bonus);
    }
}
