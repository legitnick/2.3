import java.util.Scanner;
public class Main
{
    public static double expr_eval(double n,double x){
        double sum = 0,prod = 1;
        for(double i = 1;i<n;i++){
            for(double j =0;j<n+1;j++){
                if((j+x)==0){
                    System.err.println("Division by zero, program terminated");
                    break;
                }
                double expr = i/(j+x);
                if(expr == 0)continue;
                sum+=expr;
            }
            prod*=sum;
            sum = 0;
        }
        return prod;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter n:");
        double n = scanner.nextDouble();
        
        System.out.println("Enter x:");
        double x = scanner.nextDouble(); 
	    
	    System.out.println(expr_eval(n,x));
	}
}


