package user;

public class KitchenUser extends BaseUser {

    KitchenUser(String firstName, String lastName, String middleName, String email) {
        super(firstName, lastName, middleName, email);
        
    }

    @Override
    void login(String email) {
        System.out.println("Kitchen Staff logged in");
    }
    
}
