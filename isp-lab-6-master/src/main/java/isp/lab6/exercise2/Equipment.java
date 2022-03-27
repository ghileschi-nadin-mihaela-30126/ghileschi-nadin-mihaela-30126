package isp.lab6.exercise2;


public class Equipment {
    private String name;
    private String serialNumber;
    private String owner;
    private boolean taken;

    public Equipment(String serialNumber) {
        this.serialNumber=serialNumber;
        this.name=null;
        this.owner=null;
        this.taken=false;
    }

    public Equipment(String name, String serialNumber) {
       this.name=name;
       this.serialNumber=serialNumber;
       this.owner=null;
        this.taken=false;
    }

    public Equipment(String name, String serialNumber, String owner) {
     this.name=name;
     this.serialNumber=serialNumber;
     this.owner=owner;
     this.taken=true;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isTaken() {
        return taken;
    }

    /**
     * Provide the owner of the equipment
     * Equipment should be set as taken
     *
     * @param owner - owner name
     */
    public void provideEquipmentToUser(final String owner) {
        this.owner=owner;
        System.out.print("The equipment is given to: "+owner);
        this.taken=true;
        System.out.println();
    }

    /**
     * Equipment is returned to the office
     * Equipment should not be set as taken
     * Remove the owner
     */
    public void returnEquipmentToOffice() {
           if(isTaken()!=false){
                  System.out.println("The equipment is given to: "+this.owner);
                  System.out.println();
                  this.taken=false;
           }
           if(getOwner()!=null){
               System.out.print("The equipment owner is: "+this.owner);
               this.owner=null;
               System.out.println();
           }
           System.out.println("The equipment has been returned.");
    }

    public String displayEquipments(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" --> The name of equipment is: ").append(this.name).append(" the serialNumber is: ").append(this.serialNumber).append(" and the owner is: ").append(this.owner).append("and the equipmnt taken status is: ").append(this.taken);
        return stringBuilder.toString();
    }

}
