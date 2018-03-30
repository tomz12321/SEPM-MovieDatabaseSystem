
/**
 * Write a description of class Ticket here.
 * 
 * @author Jyh-woei Yang
 * @version 30/03/2018
 */
public class Ticket extends User
{
    // instance variables - replace the example below with your own
    private String name;
    private String userName;
    private String password;
    private String seatNumber;

    /**
     * Constructor for objects of class User
     */
    public Ticket()
    {
        // initialise instance variables
        this.name = "";
        this.userName = "";
        this.password = "";
        this.seatNumber = "";
    }
    
    public Ticket(String name, String userName, String password, String seatNumber)
    {
        // initialise instance variables
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.seatNumber = seatNumber;
    }

    public void setUserName(String name)
    {
        // setter of userName
        this.userName = name;
    }
    
    public void setName(String name)
    {
        // setter of name 
        this.name = name;
    }
    
    public void setPassword(String password)
    {
        // setter of password
        this.password = password;
    }

    public void setSeatNumber(String seatNumber)
    {
        // setter of seatNumber
        this.seatNumber = seatNumber;
    }
    
    public String getUserName()
    {
        // getter of userName
        return this.userName;
    }
    
    public String getPassword()
    {
        // getter of password
        return this.password;
    }
    
    public String getName()
    {
        // getter of name
        return this.name;
    }
   
    public String getSeatNumber()
    {
        //getter of seat number
        return this.seatNumber;
    }
    
    public void display(){
        
        System.out.println("Name:"+this.name);
        System.out.println("UserName:"+this.userName);
        System.out.println("Password:"+this.password);
        System.out.println("SeatNumber:"+this.seatNumber);
    }
}