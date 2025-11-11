import java.util.Scanner;
public class Fitness {
    static void steps(int stepCount){
        if (stepCount >=10000){
            System.out.println("Excellent");
        }else if(stepCount <10000 && stepCount >=7000){
            System.out.println("Good");
        }else if (stepCount <7000 && stepCount >=4000){
            System.out.println("Average");
        }else{
            System.out.println("Poor");
        }
    }
    public static void main(String[]args){
       Scanner input =new Scanner(System.in);

       System.out.println("Enter your Steps: ");
       int step=input.nextInt();
       
       steps(step);

       input.close();
    }
}
