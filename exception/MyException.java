package capgemini.exception;

public class MyException {
	static int div1(int no1,int no2){ //Unhandled exception type Exception
		try{
			if(no2 <=0) throw new Exception("no2 has a value:"+no2);
		}catch(Exception ex) {
			System.err.println("Can not divide by zero.....");
		}
		return no1/no2;
	}
	
	static int div2(int no1,int no2) throws Exception {
		if(no2 <=0) throw new Exception("no2 has a value:"+no2);
		return no1/no2;
	}
	static int div3(int no1,int no2) throws Exception {
		if(no2 <=0) throw new Exception("no2 has a value:"+no2);
		return no1/no2;
	}
	public static void main(String[] args)  throws Exception	{	
		
		System.out.println("Started....");
		
		if(args.length < 2){
			System.err.println("please provide 2 arguments...");
			System.exit(0);
		}
		int  no1,no2, result;
		no1=no2=result=0;
		try{
			no1=Integer.parseInt(args[0]);
			no2=Integer.parseInt(args[1]);
			result = div1(no1,no2);
			result = div2(no1,no2);
			System.out.println("Result:"+result);
		}catch(NumberFormatException ex) {
			System.err.println("Please provide 2 numeric arguments...");
		//ex.printStackTrace();
		}catch(ArithmeticException ex) {
			System.err.println("Please provide 2nd non 0 numeric arguments...");
		}catch(Exception ex) {
			System.err.println("Exception occured in div2"+ex.getMessage());
		}
		finally {
			System.out.println("i will reach in any conditions...");
		}
		System.out.println("end...");
	//Unhandled exception type FileNotFoundException
		//FileInputStream fileInput =new FileInputStream("D:\\Readme.txt");
	
	}

}
