import convert.* ;
public class Main
{
	public static void main(String[] args) {
		Converter c = new Converter();
		
		System.out.println("0 ?");
		System.out.println(c.i_to_b(0));
		
		System.out.println("3 ?");
		System.out.println(c.i_to_b(3));
	}
}

