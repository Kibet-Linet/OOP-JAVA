import  java.util.Scanner;
public class Travel{
   static double calculations( double accomodationCost,double mealCost,double activityCost ){
      double totalCost = accomodationCost + mealCost + activityCost;
      return totalCost;
   }
   public static void main (String[]args){
      Scanner input =new Scanner(System.in);

      System.out.println("Enter Accomodation Cost: ");
      double ac = input.nextDouble();

      System.out.println("Enter Meal Cost: ");
      double mc = input.nextDouble();

      System.out.println("Enter Activity Cost: ");
      double actc = input.nextDouble();

      double total=calculations(ac,mc,actc);

      System.out.println("Total Vacation Cost: $"+total);

      input.close();
   }
}