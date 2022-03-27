package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EquipmentController {

    List<Equipment> equipments= new ArrayList<Equipment>();
    int count=0;
    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        equipments.add(equipment);
        count++;
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        for(int i=0; i<equipments.size();i++){
            System.out.println(equipments.get(i).displayEquipments());
        }
       return equipments;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        System.out.println("We have "+count+" equipments.");
     return count;
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> collect = equipments.stream().collect(Collectors.groupingBy(Equipment::getOwner));
        return collect;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        Equipment e1=new Equipment(serialNumber);
        for(int i=0; i<equipments.size();i++){
            if(equipments.get(i).getSerialNumber()==serialNumber){
                 e1=equipments.get(i);
            } else {
                e1= null;
            }
            if(equipments.get(i).getSerialNumber()==serialNumber){
                equipments.remove(i);
                count--;
                System.out.println(equipments.get(i).displayEquipments());
            }
        }
        return e1;
    }
}
