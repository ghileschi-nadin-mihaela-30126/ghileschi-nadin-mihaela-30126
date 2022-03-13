package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Andrei", "Popescu");
        e1.getPaymentAmount();
        System.out.println("The salary of Employee is: ");
        System.out.println( e1.getPaymentAmount());
        ComissionEmployee c1 = new ComissionEmployee("Stefan","Moga",2500, 5);
        SalariedEmployee s1 = new SalariedEmployee("Maria", "Popa", 800);
        HourlyEmployee h1 = new HourlyEmployee("Daniel", "Varga", 15 , 8);
        System.out.println("The salary of ComissionEmployee is: ");
        System.out.println(c1.getPaymentAmount());
        System.out.println("The salary of SalariedEmployee is: ");
        System.out.println(s1.getPaymentAmount());
        System.out.println("The salary of HourlyEmployee is: ");
        System.out.println(h1.getPaymentAmount());
        Employee[] e2 = new Employee[6];
        ComissionEmployee c2 = new ComissionEmployee("Andrada","Milea",2550, 7);
        SalariedEmployee s2 = new SalariedEmployee("Mara", "Popa", 850);
        HourlyEmployee h2 = new HourlyEmployee("Dan", "Barca", 20 , 8);
        e2[0]=c1;
        e2[1]=c2;
        e2[2]=s1;
        e2[3]=s2;
        e2[4]=h1;
        e2[5]=h2;
        double result=0;
        for(int i=0; i<6; i++){
            result=result+e2[i].getPaymentAmount();
        }
        System.out.println("The total of the 6 objects paymeny ammount is: ");
        System.out.println(result);
    }
}
