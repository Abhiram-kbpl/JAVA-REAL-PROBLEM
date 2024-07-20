import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for user inputs
        System.out.println("Enter the current active count: ");
        int active_count = sc.nextInt();

<<<<<<< HEAD
        System.out.println("enter the current active count : ");

        int active_count = sc.nextInt(); 

        System.out.println("enter the target cap :  ");
=======
        System.out.println("Enter the target increment: ");
>>>>>>> 32876945bdf5299be344a13f0eca4da33126d5c7
        int target_inc = sc.nextInt();

        System.out.println("Enter the final Target: ");
        int final_target = sc.nextInt();

<<<<<<< HEAD
        int total_stage = 10 ;
        int calc =final_target-active_count;
        int[] stage= new int [total_stage] ;

        for(int i=1; i<total_stage; i++){
           stage[i] = sc.nextInt(calc/i+1);
            
=======
        // Assuming total_stage is fixed to 10 as per your original code
        int total_stage = 10;
        int[] stage = new int[total_stage];

        // Calculate stage targets
        for (int i = 1; i < total_stage; i++) {
            // Adjust the formula to avoid division by zero and calculate stage targets
            // We add 1 to i because i starts from 0, so we don't divide by zero
            stage[i] = active_count + final_target/target_inc * i;

            // Optionally, you can limit each stage target to not exceed final_target
            if (stage[i] > final_target) {
                stage[i] = final_target;
            } 
>>>>>>> 32876945bdf5299be344a13f0eca4da33126d5c7
        }

        // Print out each stage target
        System.out.println("Your each stage's target are: ");
        for (int i = 1; i <= total_stage; i++) {
          System.out.println("stage "+ (i));
            System.out.println(stage[i] + " ");
        }

        // Close the scanner
        sc.close();
    }
}
