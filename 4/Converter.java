package convert;
public class Converter
{
    public static void main(String args[]){
	Converter obj = new Converter();
	System.out.println(obj.i_to_b(10));
   }
	public static boolean i_to_b(int n) {
		return !(n==0);
	}
	
}

