package java_course32;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcNumber(-1));
	}
	
	private static int calcNumber(int number){
		if((number % 4) == 0){
			return number;
		} else {
			return calcNumber(--number);
		}
	}

}
