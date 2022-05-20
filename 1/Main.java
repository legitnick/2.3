import java.util.Scanner;

public class Main
{
    static int f(int x){
            int n = 10;
        if(x<21){
            int p = 12;
            for(int i = 0;i<n;i++){
                p*=Math.sin(0.1*x + 1 + 0.3*i);
            }
            return x+p;
        }
        return (int)(Math.pow(x/2 - 9,-1 / 3)+n*2 + (int)1);
    }
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        for (int x = 0;x<30;x++){ 
            int y = f(x);
            System.out.print(y);
				if(x%6!=0){
						  System.out.print(" ");
				}
				else{
						  System.out.print("\n");
				}       
		  }
		  System.out.print("\n");
	}
}


