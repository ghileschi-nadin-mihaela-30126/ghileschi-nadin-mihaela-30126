package isp.lab2;

public class Exercise5 {

    /**
     * This method should generate an array that have 20 random nubers between -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
       /* throw new UnsupportedOperationException(); */
       int i=0;
       int nr_max=1000;
       int nr_min=-1000;
       int randomNumbers[]= new int[20];
         for(i=0; i<20; i++){
             
          randomNumbers[i]=(int)(Math.random()*(nr_max-nr_min))+nr_min;
         
         }
         return randomNumbers;
    
    }
    

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
       /* throw new UnsupportedOperationException(); */
        int n = randomNumbers.length;  
        int temp = 0; 
        int ordonate[]= new int[20];
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(randomNumbers[j-1] > randomNumbers[j]){  
                                 //swap elements  
                                 temp = randomNumbers[j-1];  
                                 randomNumbers[j-1] = randomNumbers[j];  
                                 randomNumbers[j] = temp;  
                         }  
                          
                 }  
         } 
         return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
