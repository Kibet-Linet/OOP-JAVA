public class Travel{
   static double calculations( double accomodationCost,double mealCost,double activityCost ){
      double totalCost = accomodationCost + mealCost + activityCost;
      return totalCost;
   }
   public static void main (String[]args){
      System.out.println("Total Vacation Cost:$"+(calculations(300,900, 800)));
   }
}