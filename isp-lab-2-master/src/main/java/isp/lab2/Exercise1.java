package isp.lab2;

import java.util.Random;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers(int min) {
         /*throw new UnsupportedOperationException(); */
        int array[] = null;
        int i;
        for(i=1; i<min; i++){
              array[i]=generateRandom(2,10);
        }
         return array;
    }
    static int generateRandom(int nr_min, int nr_max){
         
        int randomNumber=(int)(Math.random()*(nr_max-nr_min))+nr_min;  
        return randomNumber;
    
    }
    
    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        /*int[] userNumbers = getUserNumbers(); */
        System.out.println(generateRandom(2,10));
        /*System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers)); */
    }


}
