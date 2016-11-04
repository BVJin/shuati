
public class BVjin {
	public int reverse(int x) {
	       String s = Integer.toString(x);
			if(s.charAt(0)==new Character('-')){
				s = s.substring(1);
			}
			System.out.println(s);
			StringBuffer sb = new StringBuffer();
			for(int j=s.length()-1;j>-1;j--){
				sb.append(s.charAt(j));
			}
			
			if(x<0) sb.insert(0, "-");	
			//this will automatically get rid of '0'
			long l = Long.parseLong(sb.toString());
			if(l>(Math.pow(2,31)-1) || l<(Math.pow(-2,31))){
				return 0;
			}else{
				return Integer.parseInt(sb.toString());
			}
	    }
}
