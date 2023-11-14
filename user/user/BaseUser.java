package user;

import java.util.Date;
import java.util.UUID;

//a base implementation of the user of the system
// this class cannot be instantiated

abstract class BaseUser{
    private String id;
    private String authToken;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    //record the time a new instance is created
    private Date dateCreated;

        //constructor here is called BaseUser
    BaseUser(String firstName, String lastName, 
    String middleName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;

        //creating a new instance of the date in Java
        this.dateCreated = new Date();

        //gives long 64 digits randomized
        this.id = UUID.randomUUID().toString();
        this.authToken = UUID.randomUUID().toString();

    }

    //this is to get the user ID, no setter for this
    public String getId(){
        return id;
    }

    // public String getDateCreated(){
    //     return dateCreated;
    // }

    public String getLastName(){
        return lastName;
    }
    //set method is used to change the user name
        public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getMiddleName(){
        return middleName;
    }
    //set method is used to change the user name
        public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public String getFirstName(){
        return firstName;
    }
    //set method is used to change the user name
        public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getEmail(){
        return email;
    }
    //set method is used to change the user name
        public void setEmail(String email){
        this.email = email;
    }

    public String getAuthToken(){
        return authToken;
    }
    
//abstract means concrete in java. all children must implement this method. 
    abstract void login(String email);



}