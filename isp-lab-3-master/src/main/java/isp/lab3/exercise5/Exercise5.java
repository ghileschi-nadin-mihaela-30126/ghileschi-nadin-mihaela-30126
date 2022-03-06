package isp.lab3.exercise5;

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        boolean menu = true;
        VendingMachine v1 = new VendingMachine(new String[]{"Snickers","Mars","Water","Sandwich","Candy"}, new double[]{5,5,5,15,6});
        Scanner scanner = new Scanner(System.in);
        while(menu){
            System.out.println(v1.userMenu());
            switch(scanner.nextInt()){
                case 1:
                     v1.displayCredit();
                    break;
                case 2:
                    System.out.println("insert product id");
                    System.out.println(v1.selectProduct(scanner.nextInt()));
                    break;
                case 3:
                    v1.insertCoins((double) scanner.nextDouble());
                    break;
                case 4:
                    System.out.println(v1.displayProducts());
                    break;
                case 5:
                    menu = false;
                    System.out.println("Thank you and come again.");
                    break;
                default:
                    System.out.println("The option does not exist. Please try again.");
            }
        }
    }
}
