import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter the current active count : ");

        int active_count = sc.nextInt(); 

        System.out.println("enter the target cap :  ");
        int target_inc = sc.nextInt();

        System.out.println("enter the final Target : ");
        int final_target = sc.nextInt();

        int total_stage = 10 ;
        int calc =final_target-active_count;
        int[] stage= new int [total_stage] ;

        for(int i=1; i<total_stage; i++){
           stage[i] = sc.nextInt(calc/i+1);
            
        }
        
        System.out.println("your each stages target are : ");
        
        for(int i=0; i <total_stage; i++)
      { 
        System.out.print(stage[i]);
      }






    }
}
