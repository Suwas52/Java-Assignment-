import java.util.Scanner;
public class Assignment{
    public static void main(String[] args){
        System.out.println("What is the total number of employees?");
        Scanner scanEmployee = new Scanner(System.in);
        int  firstNumber = scanEmployee.nextInt();

        System.out.println("What is the name of supervisor?");
        Scanner scannerSupervisor = new Scanner(System.in);
        String  supervisor = scannerSupervisor.nextLine();

        System.out.println("How many times the Nuclear waste is removed from the core?");
        Scanner scanNuclear = new Scanner(System.in);
        int  removedNeuclear = scanNuclear.nextInt();

        System.out.println("What is the total weight of the waste produced every 1 week?");
        Scanner scanWeight = new Scanner(System.in);
        float  weight = scanWeight.nextFloat();

        System.out.println("Is Electric Motor being replaced every 18 days?");
        Scanner scanMotor = new Scanner(System.in);
        char   isReplaced = scanMotor.next().charAt(0);

        System.out.println("What is the core average temperature ( celsius ) of the Nuclear Reactor?");
        Scanner scanNuclearReactor= new Scanner(System.in);
        double   celsius = scanNuclearReactor.nextDouble();

        System.out.println("The total number of employeers is "+" "+ firstNumber); 
        System.out.println("The total number of employeers is "+" "+ supervisor); 
        System.out.println("The total weight of the waste produced every 1 week is "+" "+ weight + "kg"); 
        
        if (isReplaced == 'y' ) {
            System.out.println("Yes,The electric motor is being replaced every 18 days.");
        } else if (isReplaced == 'n') {
            System.out.println("No, The electric motor is not being replaced every 18 days.");
        } else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
        }

        System.out.println("The core average temperature ( celsius ) of the Nuclear Reactor is "+" "+ celsius + "C"+" "+ "and Kelvin is"+" "+  (273.15 + celsius) +"K");

    }
}