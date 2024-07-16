import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for user inputs
        System.out.println("Enter the current active count: ");
        int active_count = sc.nextInt();

        System.out.println("Enter the target increment: ");
        int target_inc = sc.nextInt();

        System.out.println("Enter the final Target: ");
        int final_target = sc.nextInt();

        // Assuming total_stage is fixed to 10 as per your original code
        int total_stage = 10;
        int[] stage = new int[total_stage];

        // Calculate stage targets
        for (int i = 1; i < total_stage; i++) {
            // Adjust the formula to avoid division by zero and calculate stage targets
            // We add 1 to i because i starts from 0, so we don't divide by zero
            stage[i] = active_count + target_inc * i;

            // Optionally, you can limit each stage target to not exceed final_target
            if (stage[i] > final_target) {
                stage[i] = final_target;
            }
        }

        // Print out each stage target
        System.out.println("Your each stage's target are: ");
        for (int i = 0; i < total_stage; i++) {
          System.out.println("stage "+ (i+1));
            System.out.println(stage[i+1] + " ");
        }

        // Close the scanner
        sc.close();
    }
}
