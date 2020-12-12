public class App {
	public static void main(String[] args) {
	
	// 1 create array of int ages 
		
		int[] ages = new int [8];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;		
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
	
	// a.
		int firstMinusLast = ages[(ages.length - 1)] - ages[0];
		System.out.println(firstMinusLast);
		
	// b. 
		int[] ages2 = new int [9];
		
		ages2[0] = 3;
		ages2[1] = 9;
		ages2[2] = 23;
		ages2[3] = 64;		
		ages2[4] = 2;
		ages2[5] = 8;
		ages2[6] = 28;
		ages2[7] = 93;
		ages2[8] = 30;
		
		firstMinusLast = ages2[(ages2.length - 1)] - ages2[0];
		System.out.println(firstMinusLast);
		
	// c.
		int count = 0;
		for (int age : ages) {
			count += age;
		}
		
		int averageAge = count / ages.length;
		System.out.println(averageAge);
	
	// 2
	
		String [] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
	// a. 
		int cCount = 0;
		for(int i = 0; i < names.length; i++) {
			cCount += names[i].length();
		}
		
		int avgLength = cCount / names.length;
		
		//double avgLength = (cCount * 1.0) / names.length;
		// I'm not sure if you guys wanted this value as 
		// an int or a decimal number, but multiplying
		// the cCount by 1.0 was the only way to get 
		// the correct decimal value to return.
		
		System.out.println(avgLength);
		
	//b.
		String allNames = "";
		for(String name : names) {
			allNames = name + " " + allNames;
		}
		
		System.out.println(allNames);
		//I had them print out in this order 
		//because I didn't care for there bieng
		//a space at the beginning.
	
	//3
		// arrayName[(arrayName.length - 1)]
	
	//4
		// arrayName[0];
	
	//5
		int [] nameLengths = new int [names.length];
		
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
	//6
		int lengthSum = 0;
		for(int name : nameLengths) {
			lengthSum += name;
		}
		
		System.out.println(lengthSum);
	}
}
