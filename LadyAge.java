import java.util.Scanner;

public class LadyAge{
	public static void main(String[] args){
		System.out.print("please input your age!");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
	}
	    int c = 0;
	    if(age >= 18){
			c=1;
		}
	    if(age < 18){
			c=2;
		}
	switch(c){
		case 1:
				  System.out.println("hello!women!");
				  System.out.println("welcome using");
				  break;
		case 2:	
                  System.out.println("hello!girl！");
				  System.out.println("welcome using!");
                  break;
        default:
                  System.out.println("please try again!");
                  break;				  
	}
   }
 }
