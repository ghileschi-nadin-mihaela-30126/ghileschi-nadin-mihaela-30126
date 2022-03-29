package isp.lab7.safehome;

import java.util.List;
import java.util.Map;

public class DoorLockController implements ControllerInterface {

    private Map<Tenant, AccessKey> validAccess;
    private List<AccessKey> accessKey;
    private List<Tenant> tenant;
    private List<AccessLog> accessLog;
    private Door door;

    public DoorLockController(Map<Tenant, AccessKey> validAccess, List<AccessKey> accessKey, List<Tenant> tenant, List<AccessLog> accessLog, Door door) {
        this.validAccess = validAccess;
        this.accessKey = accessKey;
        this.tenant = tenant;
        this.accessLog = accessLog;
        this.door = door;
    }

    public Map<Tenant, AccessKey> getValidAccess() {
        return validAccess;
    }

    public List<AccessKey> getAccessKey() {
        return accessKey;
    }

    public List<Tenant> getTenant() {
        return tenant;
    }

    public List<AccessLog> getAccessLog() {
        return accessLog;
    }

    public Door getDoor() {
        return door;
    }

    public DoorStatus enterPin(String pin) throws TooManyAttemptsException, InvalidPinException{
        int attempts=0;
        String masterPin = ("MASTER");
       if(accessKey.equals(pin)){
           door.unlockDoor();
           attempts=0;
       } else {
           door.lockDoor();
           attempts++;}
       if(attempts>3){
           throw new TooManyAttemptsException("Too many attempts when opening the door.");
          if(pin.equals(masterPin)){
              attempts=0;
          }
       }
       return door;
    }

   public void addTenant(String pin, String tenantName) throws TenantAlreadyExistsException{
        return null;
    }

    public void removeTenant(String name) throws TenantNotFoundException{
        return null;
    }

    public List<AccessLog> getAccessLogs(){
        return null;
    }

}
