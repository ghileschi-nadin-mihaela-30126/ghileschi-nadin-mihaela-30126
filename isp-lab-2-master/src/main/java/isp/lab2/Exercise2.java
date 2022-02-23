package isp.lab2;

import static isp.lab2.Exercise3.calculateGeometricMean;
import static isp.lab2.Exercise3.getPrimeNumbersFromInterval;
import static isp.lab2.Exercise3.numberOfPNWithEvenSumOfDigits;
import java.util.Scanner;
import java.lang.Character;
import java.lang.String;

/**
 * Check readme.md file for the exercise requirements.
 *
 * @author Radu Miron
 */
public class Exercise2 {
    /**
     * Reads an enumeration of words separated by comma.
     *
     * @return The console input enumeration if it's valid, null otherwise.
     */
    public static String readEnumeration() {
        System.out.println("Please input an enumeration of words separated by comma:");

        Scanner scanner = new Scanner(System.in);
        String enumeration = scanner.nextLine();

        if (enumeration.trim().length() > 0) {
            return enumeration;
        } else {
            return null;
        }
    }

    /**
     * Reads the searched words starting letter.
     *
     * @return The starting character if it's a valid letter, null otherwise.
     */
    public static Character readStartingLetter() {
        System.out.println("Please input the starting letter of the words you want to search:");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.length() > 0) {
            return line.charAt(0);
        } else {
            return null;
        }
    }

    /**
     * Splits a given {@link String} by comma.
     * TODO: Use {@link String#split(String splitBy)} to split the enumeration;
     * TODO: If you plan on using also whitespace characters in your enumeration (eg. " apple , cat, mouse"), use {@link String#trim()} for each word.
     *
     * @param inputEnumeration The words' enumeration.
     * @return An array of words.
     */
    public static String[] splitEnumerationIntoWords(String inputEnumeration) {
      /*  throw new UnsupportedOperationException("Not implemented yet!"); */
        String cuvant[]= inputEnumeration.split(",");
        
         return cuvant;
    }

    /**
     * Finds the words starting with a given letter in an array.
     *
     * @param words          The array of words.
     * @param startingLetter The starting letter.
     * @return All the words starting with the given letter.
     */
    public static String[] findWordsStartingWith(String[] words, Character startingLetter) {
       /* throw new UnsupportedOperationException("Not implemented yet!"); */
       int i=0;
       int k=0;
      String[] b= new String[words.length];
      
       for(i=0; i<words.length; i++){
         String litera= words[i];
           Character primaLitera=litera.charAt(0);
           if(primaLitera==startingLetter){
                    b[k]=words[i];
                    k++;
           }
        
       }
       String[] c = new String[k];
       for(i=0; i<b.length;i++){
           if(b[i]!=null){
               c[i]=b[i];
           }
           }
       return c;
       }
   
      
    
 
      public static void main(String[] args) {
      String enumeration = readEnumeration();
        Character startingLetter = readStartingLetter();

        if (enumeration != null && startingLetter != null) {
              int i=0;
            String[] words = splitEnumerationIntoWords(enumeration);
            String[] results = findWordsStartingWith(words, startingLetter);
            for(i=0; i<results.length; i++){
                System.out.println(results[i]);
            } 
           /* System.out.println(results);// print results } */
        } else {
            System.out.println("Nu s-a introdus niciun sir si nicio litera!");
        }
    }
}
    

  



