import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){
		List<String> l = new ArrayList<String>();
		l.add("abc/");
		l.add("/cs");
		l.add("4b/2");
		
		Codec c = new Codec();
		String s = c.encode(l);
		System.out.println(s);
		List<String> res = c.decode(s);
		for(String ss : res){
			System.out.println(ss);
		}
	}
}
