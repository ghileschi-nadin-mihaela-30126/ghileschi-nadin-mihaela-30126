package isp.lab7.safehome;

public class TenantAlreadyExistsException extends Exception{
    public TenantAlreadyExistsException(){}
    public TenantAlreadyExistsException(String msg){
        super(msg);
    }
}
