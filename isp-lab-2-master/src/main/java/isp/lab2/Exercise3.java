package isp.lab2;

import java.util.Scanner;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
       /* throw new UnsupportedOperationException(); */
    int num = number, i = 2;
    boolean flag = true;
    if(num==1){
        flag=false;    
    }
    if(num==0){
         flag=false;
    }
   for(i=2; i<num; i++){
           if (num%i==0) {   
               flag = false;
               break;
        }   
   }
   
    if (flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number."); 
    
     return flag; 
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
      /*  throw new UnsupportedOperationException(); */
      int primeNumber=number;
      
      int result=0, digit=0;
      
      while(primeNumber > 0){
          
      digit=primeNumber%10;
      
      result=result+digit;
      
      primeNumber= primeNumber/10;
      
      }
      return result;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
       /* throw new UnsupportedOperationException(); */
       int i=a, k=0;
       int array[] = new int[b];
       for(i=a; i<=b; i++){
           
       if(isPrimeNumber(i)){
           array[k]=i;
           k++;
       }
       
       } 
       int thePrimeNumbers[]= new int[k];
       
          for(i=0; i<array.length; i++){
              
           if(array[i]!= 0){
               thePrimeNumbers[i]=array[i];
           }
   
       } 
                  return thePrimeNumbers;
    }
    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
       /* throw new UnsupportedOperationException(); */
       double sum = primeNumbers[0];

	for (int i = 1; i < primeNumbers.length; i++) {
		sum *= primeNumbers[i]; 
	}
        
	return Math.pow(sum, 1.0 / primeNumbers.length); 
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
      /*  throw new UnsupportedOperationException(); */
      int i=0;
      int result=0;
      int howMany=0;
      for(i=0; i<primeNumbers.length; i++){
             result=calculateSumOfDigits(primeNumbers[i]);
          if(result%2==0){
               howMany++;
          }
      }
      return howMany;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner number= new Scanner(System.in);
        System.out.println("Give the a number:");
           a=number.nextInt();
        System.out.println("Give the b number: ");
           b=number.nextInt();
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b))); 
    }
}
