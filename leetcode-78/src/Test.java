import java.util.Arrays;


public class Test {
	public static void main(String args[]){
		System.out.println("haha");
		String str = "eat";
		char[] arr = new char[26];
		//Arrays.fill(arr, 'a');
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'a'] = str.charAt(i);
        }
        String ns = new String(arr);
        System.out.println(ns);
	}
}
