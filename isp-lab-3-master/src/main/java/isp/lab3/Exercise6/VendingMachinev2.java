package isp.lab3.Exercise6;

class VendingMachinev2 {

    private static VendingMachinev2 instance;
    public String[] s;
    public double[] d;
    private String[] products;
    private double[] prices;
    public static int count=0;

    private VendingMachinev2() {
        this.products=new String[]{"Bounty","Water"};
        this.prices=new double[]{5,5};
        count++;
    }
   // VendingMachinev2 v1= new VendingMachinev2(new String[]{"Bounty","Water"}, new double[]{5,5});

    public static VendingMachinev2 getInstance() {
        if (instance == null) {
            synchronized (VendingMachinev2.class) {
                if (instance == null) {
                    instance = new VendingMachinev2();
                }
            }
        }
        System.out.println(instance);
        return instance;
    }
}

