import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter the current active count : ");

        int active_count = sc.nextInt(); 

        System.out.println("enter the target incriment:  ");
        int target_inc = sc.nextInt();

        System.out.println("enter the final Target : ");
        int final_target = sc.nextInt();

        int total_stage = 10 ;

        int[] stage= new int [total_stage] ;

        for(int i=0; i<total_stage; i++){
           stage[i] = sc.nextInt((final_target-active_count)/i+1);
            
        }
        
        System.out.println("your each stages target are : ");
        
        for(int i=0; i <total_stage; i++)
      { 
        System.out.print(stage[i]);
      }






    }
}
