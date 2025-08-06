package built_in_packages;

public class Built_in_example {

	public static void main(String[] args) {
		String greeting="Hello world";
		System.out.println("Original String -"+greeting);
		System.out.println("Upper case -"+greeting.toUpperCase());
		System.out.println("substring -"+greeting.substring(6));
		
		int max=Math.max(10,20);
		double sqrt=Math.sqrt(25.0);
		System.out.println("max number "+ max);
		System.out.println("sqrt "+sqrt);
		}
}