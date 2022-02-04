
package Assignment3;

public class UserAccountIsBlockedException extends RuntimeException {
    private int id;
    public UserAccountIsBlockedException(int id) {
        this.id = id;
    }
    
    @Override
    public String getMessage(){
        return "Account of User with id: "+id+" is Blocked";
    }
    
}

