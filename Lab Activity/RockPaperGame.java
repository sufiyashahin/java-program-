package Java;
import java.util.Random;
import java.util.Scanner;


public class RockPaperGame {

	public static void main(String[] args) {
		
		Random rm=new Random();
		Scanner sc=new Scanner(System.in);
		int cmp_choice=rm.nextInt(3)+1;
        int no_choices=0;
        int t_chances=5;
        int C_point=0;
        int P_point=0;
        
        while (no_choices<t_chances){
            System.out.println("Enter Rock, Paper, Scissor as 1, 2, 3 respectively:");
            byte user_input = sc.nextByte();

            if(user_input==cmp_choice){
            	System.out.println("It is a Tie hence no addition of score");
	    }
            else if (user_input<=3 && user_input>=1) {
                // Computer inputs 3
                if (user_input==1 && cmp_choice==3){
                    System.out.println("Congrats You Won!!");
		    C_point = (int)C_point + 1;
		    System.out.println("Your Score is" + C_point + "Computer score is" + P_point);
                    System.out.println("You Entered" + user_input +"and the Computer choice was"+ cmp_choice);
                }
                
                else if (user_input==2 && cmp_choice==3){
                    System.out.println("Alas you lost!!");
		    P_point = (int)P_point + 1;
		    System.out.println("Your Score is" + C_point + "Computer score is" + P_point);
                    System.out.println("You Entered" + user_input +"and the Computer choice was"+ cmp_choice);
                }

      
                // Computer inputs 2
                if (user_input==1 && cmp_choice==2){
                    System.out.println("Alas you lost!!");
		    P_point = (int)P_point + 1;
		    System.out.println("Your Score is" + C_point + "Computer score is" + P_point);
                    System.out.println("You Entered" + user_input +"and the Computer choice was"+ cmp_choice);
                }


                else if (user_input==3 && cmp_choice==2){
                    System.out.println("Congrats You Won!!");
		    C_point = (int)C_point + 1;
		    System.out.println("Your Score is" + C_point + "Computer score is" + P_point);
                    System.out.println("You Entered" + user_input +"and the Computer choice was"+ cmp_choice);
                }

                // Computer inputs 1
                else if (user_input==2 && cmp_choice==1){
                    System.out.println("Alas you lost!!");
		    P_point = (int)P_point + 1;
		    System.out.println("Your Score is" + C_point + "Computer score is" + P_point);
                    System.out.println("You Entered" + user_input +"and the Computer choice was"+ cmp_choice);
                }

                else if (user_input==3 && cmp_choice==1){
                    System.out.println("Congrats You Won!!");
		    C_point = (int)C_point + 1;
		    System.out.println("Your Score is" + C_point + "Computer score is" + P_point);
                    System.out.println("You Entered" + user_input +"and the Computer choice was"+ cmp_choice);
                }
            }
            else {
                System.out.println("Please Enter Right Input.");
            }
            no_choices ++;
            int left = t_chances - no_choices;
            System.out.println("You are left with only "+left+" chances");
        }
	System.out.println("Game Over");
	System.out.println("Scoreboard");
	if(C_point>P_point){
	    System.out.println("You win the game");
	    System.out.println("Your Final Score is " + C_point + "Computer Final score is " + P_point);
	}
	else if(C_point<P_point){
	    System.out.println("You loss the game");
	    System.out.println("Your Final Score is" + C_point + "Computer Final score is" + P_point);
	}
	else if(C_point==P_point){
	    System.out.println("Tie");
	    System.out.println("Your Final Score is" + C_point + "Computer Final score is" + P_point);
	}
	sc.close();
        
	}

}
