
package Assignment3;

public class UserAlreadyExistException extends Exception {
    private int id;

    public UserAlreadyExistException(int id){
        this.id = id;
    }
    
    @Override
    public String getMessage(){
        return "User with id: "+id+" already exists";
    }
    
  
}
