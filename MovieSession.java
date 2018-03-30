
/**
 * Write a description of class User here.
 * 
 * @author Jyh-woei Yang
 * @version 30/03/2018
 */
public class MovieSession extends Ticket
{
    // instance variables - replace the example below with your own
    private String location;
    private String theatre;
    private String timeSession;
    private String isfree;
    private String weekday;

    /**
     * Constructor for objects of class User
     */
    public MovieSession()
    {
        // initialise instance variables
        super();
        this.location = "";
        this.theatre = "";
        this.timeSession = "";
        this.isfree = "";
        this.weekday = "";
    }
    
    public MovieSession(String location, String theatre, String timeSession, String isfree, String weekday)
    {
        // initialise instance variables
        super();
        this.location = location;
        this.theatre = theatre;
        this.timeSession = timeSession;
        this.isfree = isfree;
        this.weekday = weekday;
    }

    public void setLocation(String location)
    {
        // setter of location
        this.location = location;
    }
    
    public void setTimeSession(String timeSession)
    {
        // setter of timeSession 
        this.timeSession = timeSession;
    }
    
    public void setIsfree(String isfree)
    {
        // setter of isfree
        this.isfree = isfree;
    }

    public void setWeekday(String weekday)
    {
        // setter of weekday
        this.weekday = weekday;
    }
   
    public String getLocation()
    {
        // getter of location
        return this.location;
    }

        public String getTheatre()
    {
        // getter of theatre
        return this.theatre;
    }
    
    public String getTimeSession()
    {
        // getter of timeSession
        return this.timeSession;
    }
    
    public String isfree()
    {
        // getter of isfree
        return this.isfree;
    }
    
    public String getWeekday()
    {
        // getter of weekday
        return this.weekday;
    }
    
    public void display(){        
        System.out.println("Location:"+this.location);
        System.out.println("Theatre:"+this.theatre);
        System.out.println("TimeSession:"+this.timeSession);
        System.out.println("Isfree:"+this.isfree);
        System.out.println("Weekday:"+this.weekday);
    }
}
