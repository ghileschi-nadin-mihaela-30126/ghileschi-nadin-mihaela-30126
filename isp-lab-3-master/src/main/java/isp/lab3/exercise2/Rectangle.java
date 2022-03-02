package isp.lab3.exercise2;

public class Rectangle {
    private int length=2;
    private int width=1;
    private String color="red";


     public Rectangle(int length, int width) {
         this.length = length;
         this.width = width;
     }

    public Rectangle() {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength(){
         return length;
     }
     public int getWidth(){
         return width;
     }

    public String getColor() {
        return color;
    }
    public int getPerimetre(){
         return 2*(length+width);
    }
    public int getArea(){
         return length*width;
    }
}
