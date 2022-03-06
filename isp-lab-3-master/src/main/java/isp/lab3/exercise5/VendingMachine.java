package isp.lab3.exercise5;

public class VendingMachine {
    private String[] products;
    private double[] price;
    private double credit;
    private int count=0;

   /* public VendingMachine(String[] products, double[] price) {
        this.products = products;
        this.price = price;
        this.credit=0;
        count++;
    } */

    public VendingMachine(String[] products, double[] price) {
        this.products = products;
        this.price = price;
        count++;
    }

    public String[] getProducts() {
        return products;
    }

    public double[] getPrice() {
        return price;
    }

    public String displayProducts(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<this.products.length; i++){
            stringBuilder.append(i).append(" --> The product is: ").append(this.products[i]).append(" The price is: ").append(this.price[i]).append(" lei \n");
        }

       /* for(int j=0; j<this.products.length; j++){
            System.out.println("List of products: " +stringBuilder[j]);
        } */
        return stringBuilder.toString();
    }

    public String selectProduct(int id){

        if(id < this.products.length && id >= 0){
            return "The product with id: " + id + " is: " +this.products[id];
            }
        else{
            return "The product with id: " + id + " is not available";
        }
    }

   /* public String toString() {
        return "id='" + id +
                ", product=" + product +
                ", cost=" + cost +
                '}';
    } */

    public double insertCoins(double cash){
       /* if(this.credit==0){
            System.out.println("No credit available. Please insert cash.");
            this.credit=this.credit+cash;
            break;
        } */
            System.out.println("Your curent credit is: " +this.credit);
            System.out.println("Please insert the amount of money u need to buy your product.");
            this.credit=this.credit+cash;

        System.out.println("Your credit is now: " +this.credit);
        return this.credit;
    }

    public double displayCredit(){
        System.out.println("Your credit is: "+ this.credit + " \n");
        return this.credit;
    }

    public String userMenu() {
        return "1 -> Display credit\n2 -> Select product by id\n3 -> Insert coin \n4 -> Display products \n5 -> Exit\n";
    }


}
