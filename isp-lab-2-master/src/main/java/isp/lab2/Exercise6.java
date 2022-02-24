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
     
       /* int vector[]= new int[n];
       vector[0]=1;
       vector[1]=2;
       int newVector[]= new int[n];
       newVector[0]=vector[0];
       int count=n;
       int i=0;
         for(i=1; i<count-1; i++){
             
        newVector[i]=vector[i]; /*1=>n=2; 2=> n=2 3=> n=4 4=>8            */
        
         /*  vector[i+1]=vector[i]*vector[i-1]; /* v2=2 v3=2*2=4 v4=4*2=8             */
        /*   vector[i-1]=vector[i]; /*v0=2 v1=2 v2=4                */
         /*  vector[i]=vector[i+1]; /*v1=2 v2=4 v3=8            */
       /*}
         for(i=0; i<=count-1; i++){
              System.out.println(newVector[i]);
         }
       return newVector; */
       int vector[]= new int[n];
       vector[0]=1;
       vector[1]=2;
       int i=0;
       
       for(i=2; i<n; i++){
            vector[i]=vector[i-1]*vector[i-2];
       }
       return vector; 
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
