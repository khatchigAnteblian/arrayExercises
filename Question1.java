import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    Scanner sc = new Scanner(System.in);
    int input;
    System.out.println("Enter number of month: ");
    while (true) {
        try {
            input = sc.nextInt();
            break;
        } catch (Exception e) {
            //System.out.println("Please input an integer between 1-12");
          System.out.print(e);
          break;
        }
    }
    
    try {
      System.out.printf("%s", months[input - 1]);
    }
      catch(ArrayIndexOutOfBoundsException e) {
        System.out.printf("%d%s", input, " is not a month");
      }
  }
}