package isp.lab3.exercise1;

public class Tree {
    private int height;

    public Tree() {
        this.height = 15;
    }
    public void grow(int meters){
        if(meters>=1){
            this.height+=meters;
            System.out.println("New tree height is: "+this.height);

        } else {
            System.out.println("Error: meters must be positive!");
        }

    }
    public String toString() {
        return ""+height;
    }

    public int getHeight() {
        return height;
    }
}
