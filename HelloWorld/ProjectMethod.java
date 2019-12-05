
public class ProjectMethod {

	public static void main(String[] args) {
		printTowTimes("a","*");
		System.out.println(twoTimes("a","----------"));
		
		printTowTimes("B","+");
	

		printTowTimes("c","-");
	
	}
	public static String twoTimes(String text, String delimiter) {
		String out ="";
		out = out + delimiter +"\n";
		out = out + text +"\n";
		out = out + text +"\n";
		return out;
	}
	public static void printTowTimes(String param,String delimiter) {
		System.out.println(delimiter);
		System.out.println(param);
		System.out.println(param);
	}
 
}
