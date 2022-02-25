package isp.lab2;

import java.util.Scanner;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        /* throw new UnsupportedOperationException(); */
            int vector[]= new int[n];
       vector[0]=1;
       vector[1]=2;
       int i=0;
       for(i=0; i<n-2; i++){
            vector[i+2]=vector[i]*vector[i+1];
       }
       return vector; 
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {
       /* throw new UnsupportedOperationException(); */
     int first= 1; 
     int second=2;
        int vector[]= new int[n];
       vector[0]=first;
       vector[1]=second;
       int newVector[]= new int[n];
       newVector[0]=first;
       newVector[1]=second;
       int i=0, k=2;
       int produs=0;
         for(i=0; i<n-2; i++){
             produs=first*second;
             first=second;
             second=produs;
             newVector[k]=produs;
             k++;
       }
         for(i=0; i<n; i++){
              System.out.println(newVector[i]);
         }
       return newVector; 
      
     }    
    

    public static void main(String[] args) {
        // TODO: print the vectors
        Scanner scan= new Scanner(System.in);
        int i=0;
        System.out.println("Give the vector length: ");
        int n=scan.nextInt();
        int result[]=generateVector(n); 
        int result1[]=generateRandomVectorRecursively(n);
    }
}
