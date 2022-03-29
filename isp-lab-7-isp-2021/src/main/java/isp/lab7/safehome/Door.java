package isp.lab7.safehome;

public class Door {

    private DoorStatus status;

    public void unlockDoor(){
        status=DoorStatus.OPEN;
    }
    public void lockDoor(){
        status=DoorStatus.CLOSE;
    }


}
