package isp.lab2;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        /* throw new UnsupportedOperationException(); */
        int i = 0;
        int nr_max = 7;
        int nr_min = 0;
        int randomNumbers = 0;

        randomNumbers = (int) (Math.random() * (nr_max - nr_min)) + nr_min;

        return randomNumbers;
    }
    public static void duplicate(int numbers[]) {
        int k=0;
        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;
            int j = 0;

            while (j < i){

                if ((i != j) && numbers[i] == numbers[j]) {
                    duplicate = true;
                }

                j++;
            }

            if (!duplicate) {
                k++;
            }
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        int k = 0; /* contor pentru nr de incercari */
        /* while (true) { */
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] < times) {
                System.out.println("The number is smaller than the number you had to guess.");
                System.out.println("Try again.");
                System.out.println(answers[i]);
                boolean duplicate = false;
                int j = 0;

                while (j < i){

                    if ((i != j) && answers[i] == answers[j]) {
                        duplicate = true;
                    }

                    j++;
                }

                if (!duplicate) {
                    k++;
                }
            }
            if (answers[i] > times) {
                System.out.println("The number is bigger than the number you had to guess.");
                System.out.println("Try again.");
                System.out.println(answers[i]);
                boolean duplicate = false;
                int j = 0;

                while (j < i){

                    if ((i != j) && answers[i] == answers[j]) {
                        duplicate = true;
                    }

                    j++;
                }

                if (!duplicate) {
                    k++;
                }
            }
            if (answers[i] == times) {
                System.out.println("Congrats! You found the number.");
                System.out.println(answers[i]);
                boolean duplicate = false;
                int j = 0;

                while (j < i){

                    if ((i != j) && answers[i] == answers[j]) {
                        duplicate = true;
                    }

                    j++;
                }

                if (!duplicate) {
                    k++;
                }
                break;
            }

        }
        System.out.println("The number was:");
        System.out.println(times);
        System.out.println("The number of tries was:");
        System.out.println(k);
       /* duplicate(answers); */

    }
}


