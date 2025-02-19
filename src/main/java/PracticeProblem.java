public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String word){
		word = word.toLowerCase();
		if (word.endsWith("y") && (!word.endsWith("ey"))){
			return "ies";
		}else if (word.endsWith("ey")){
			return "eys";
		}else if(word.endsWith("ife")){
			return "ives";
		}else{
			return "s";
		}
	}

	public static int min(int num1, int num2, int num3){
		if ((num1 < num2) && (num1 < num3)){
			return num1;
		}else if ((num2 < num1)&&(num2 < num3)){
			return num2;
		}else{
			return num3;
		}
		
	}

	public static boolean isLeapYear(int year){
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}else{
			return false;
		}
	}

}
