package isp.lab2;

import static isp.lab2.Exercise3.isPrimeNumber;

public class Exercise4 {

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
     * This method should get the first(by position) odd number from the given array
     *
     * @param someNumbers the given int array
     * @return first odd number from the array
     */
    public static int firstOdd(int[] someNumbers) {
       /* throw new UnsupportedOperationException(); */
        int i=0;
        int number=0;
        for(i=0; i<someNumbers.length; i++){
            if(someNumbers[i]%2==0){
                System.out.println("This is an even number.");
            }
            else   { 
                number=someNumbers[i];
                break;
            }
            }
         System.out.println("This: ");
         System.out.println(number+ " is the first Odd number");
        return number;
    }

    /**
     * This method should get the first(by position) even number from the given array
     *
     * @param someNumbers the given int array
     * @return first even number from the array
     */
    public static int firstEven(int[] someNumbers) {
       /* throw new UnsupportedOperationException(); */
        int i=0;
        int number=0;
        for(i=0; i<someNumbers.length; i++){
            if(someNumbers[i]%2==0){
                number=someNumbers[i];
                break;
            }
        }
         System.out.println("This: ");
         System.out.println(number+ " is the first Even number");
        return number;
    }

    /**
     * This method should get the first(by position) prime number from the given array
     *
     * @param someNumbers the given int array
     * @return first prime number from the array
     */
    public static int firstPrime(int[] someNumbers) {
        // TODO: Use isPrimeNumber(final int number)
       /* throw new UnsupportedOperationException(); */
      int i=0;
        int number=0;
        for(i=0; i<someNumbers.length; i++){
            if(isPrimeNumber(i)){
                number=someNumbers[i];
                break;
            }
        }
         System.out.println("This: ");
         System.out.println(number+ " is the first Prime number");
        return number;
    }

    /**
     * Don't forget to also display the position of ech number
     */
    public static void main(String[] args) {
        int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

        System.out.println("First odd number: " + firstOdd(someNumbers));
        System.out.println("First even number: " + firstEven(someNumbers));
        System.out.println("First prime number: " + firstPrime(someNumbers));
    }
}
