package capgemini.lang;

public class SimpleString {
	public static void main(String[] args) {
		String s1 ="JAVA";
		String s2 ="JAVA";
		String s3 =new String ("JAVA");
		
		//char[] value = new char[] {'J','A','V','A'};
		char[] value = {'J','A','V','A'};
		String s4= new String("CORE");
		String s5= new String(s4);
		
		if(s1==s2) {	//values are same and memory location are also same
			System.out.println("s1==s2");
		}
		
		if(s1!= s3) {	//values are same and but diff memory location
			System.out.println("s1==s3");
		}
		System.out.println("s1 equals s2 "+ (s1.equals(s2)));	//true
		System.out.println("s1 equals s3 "+ (s1.equals(s3)));	//true
		System.out.println(s5);
		System.out.println(s1.charAt(1));
		System.out.println(s5.concat(s2));
		System.out.println(s5.endsWith(s2));
		System.out.println(s4.getBytes());
		System.out.println(s1.indexOf(3));
		System.out.println(s3.indexOf(s4));
		System.out.println(s2.isEmpty());
		System.out.println(s3.length());
		System.out.println(s5.split(s2));
		System.out.println(s2.startsWith(s4));
		System.out.println(s1.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s2.toCharArray());
	}
}
