
public class Test {
	public static void main(String args[]){
		String[] s = new String[]{"deer","dooa","cake","card"};
		ValidWordAbbr vwa = new ValidWordAbbr(s);
		System.out.println(vwa.isUnique("deer"));
		System.out.println(vwa.isUnique("cart"));
		System.out.println(vwa.isUnique("cane"));
		System.out.println(vwa.isUnique("make"));
	}
}
