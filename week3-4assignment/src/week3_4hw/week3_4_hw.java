package week3_4hw;

public class week3_4_hw {

	public static void main(String[] args) {
		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
				//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code).
				// Print the result to the console. 
				
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
				System.out.println(ages [ages.length -1] -ages[0]);
			
			
			
				// b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			
				int ages2 [] = {3, 9, 23, 64, 2, 8, 28, 93, 66}; 
				System.out.println(ages2 [ages2.length -1] -ages2[0]);


			
			
			 // c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			
			int sum = 0;
			double avg;
			for (int i = 0; i< ages.length;i++) {
			sum = sum + ages[i];
			System.out.println(sum);
			} System.out.println("This is the average " + sum / ages.length);
			System.out.println(fullName( "Dan" , "Tom" ));
			//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
			String [] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
					//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			int totalnumberOfLettersPerNames=0;
			double averageNumberOfLettersPerName;
			
			for (int i = 0; i< names.length;i++) {
				 totalnumberOfLettersPerNames = totalnumberOfLettersPerNames+names[i].length();
			 }
			 System.out.println(totalnumberOfLettersPerNames);
			 averageNumberOfLettersPerName = (double) totalnumberOfLettersPerNames / names.length;
			 System.out.println(averageNumberOfLettersPerName);
			 
			 //3.	How do you access the last element of any array?
			 // Answer : anyArrayName.lenght-1
					 
			 //4.	How do you access the first element of any array?
			// Answer : anyArrayName[0];
					 
			//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

			} //end of main 
			public static String fullName(String firstName, String lastName) {
				return firstName + " " + lastName;
			}	
				 
				 //7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
				 //  (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”)

				 
				 // 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

				 
				 // 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

				 
				 // 10.	Write a method that takes an array of double and returns the average of all the elements in the array.

				 
				 // 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

				 
				 //12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

				 
				 //13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

				 
			
			public static String concatenateWord (String word, int n) {
				for (int i = 0; i < n; i++) {
					System.out.println(word);
				}
				return word;
			}
			
			public static boolean sumOfInt (int [] arr) {
				int sum = 0;
				for (int i =0; i< arr.length;i++) {
					sum += arr[i];
				}
				 if (sum>100){
				   return true;
				  }
			    return false; 
			}
			public static double averageofTheElement(double [] array){
				double sum = 0.0;
				double avg;
				for (int i = 0; i< array.length; i++) {
					sum += array[i];
				}
				avg = sum/ array.length;
				return avg;
				
			}
			public static boolean averageofElementInBothArrays(double [] arr1, double [] arr2){
				double sum1= 0.0;
				double sum2= 0.0;
				double avg1,avg2;
				
				for (int i =0 ; i<arr1.length;i++) {
					sum1 += arr1[i];
				}
				for (int i =0 ; i<arr2.length;i++) {
					sum2 += arr2[i];
				}
				avg1 = sum1/ arr1.length;
				avg2 = sum1/ arr2.length;
				
				if (avg1>avg2) {
					return true;
				}
				return false;
			 
			}
			
			public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
				if ((isHotOutside==true && moneyInPocket>10.50)) {
					return true;
				}
				return false;
			}
			//This method will test if the number entered is even or odd.
			public static void evenOrOdd(int numb){
				if (numb % 2== 0) {
					System.out.println("Even number");
				}
				else {
					System.out.println("Odd Number");
				}
			}
			



		

}


