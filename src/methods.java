public class methods {
	
	public static void main(String[] args) {
		
		int [] numbers = {24, 54, 64, 2};
		double [] numbers2 = {14.5, 15.5, 20.0};
		double[] numbers3 = {15.5, 14.5, 19};
		
		System.out.println(concatenateNTimes("Hello", 3));
		System.out.println(returnFullName("Kat", "Sundquist"));
		System.out.println(sumGreater100(numbers));
		System.out.println(average(numbers2));
		System.out.println(avgFirstArrayGreater(numbers2, numbers3));
		System.out.println(willBuyDrink(false, 12));
	}
	
//7
	public static String concatenateNTimes (String word, int n) {
		String newString = "";
		while(n > 0) {
			newString += word;
			n --;
		}
		return newString;
	}
	
//8
	public  static String returnFullName(String first, String last) {
		return first + " " + last;
	}

//9
	public static boolean sumGreater100(int [] array) {
		int sum = 0;
		for(int num : array) {
			sum += num;
		}
		if(sum > 100) {
			return true;
		}
		else
			return false;
	}

//10
	public static double average(double [] array) {
		double sum = 0;
		for(double num : array) {
			sum += num;
		}
		return sum / array.length;
	}

//11
	public static boolean avgFirstArrayGreater(double [] array1, double [] array2) {
		double firstArrayAvg = average(array1);
		double secondArrayAvg = average(array2);
		
		if(firstArrayAvg > secondArrayAvg) {
			return true;
		} else
			return false;
	}
	
//12
	public static boolean willBuyDrink(boolean hot, double money) {
		if( hot && money > 10.5) {
			return true;
		}else
			return false;
	}

//13
	/**
	 * This method calculates how many 8 fl oz cups make up
	 * however many gallons of liquid.
	 * 
	 * There are 16 cups to a gallon.
	 * 
	 * If you ever wanted to know how many cups of pudding
	 * it would take to fill a swimming pool, this is your method.
	 * @param numberGallons
	 * @return number of cups in a given quantity of liquid in 
	 * gallons.
	 */
	
	public static int howManyCups(int numberGallons) {
		return numberGallons * 16;
		
	}
}
