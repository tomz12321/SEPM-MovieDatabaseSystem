import java.util.*;
import java.io.*;

/**
 * Write a description of class MovieDatabase here.
 * 
 * @author Jyhwoei Yang 
 * @version 30/03/2018
 */
public class MovieDatabase
{    
    // instance variables 
    private ArrayList<Movie> movieList; // should be private
    private ArrayList<User> userList;
    private ArrayList<Ticket> ticketList;
    
    /** Default Constructor of Class MovieDatabase
     * 
     */
    public MovieDatabase()
    {
        //initialise the variables
        movieList = new ArrayList<Movie>();
        userList = new ArrayList<User>();
        ticketList = new ArrayList<Ticket>();
    }
    
    /** Constructor of Class MovieDatabase
     * 
     */
    public MovieDatabase(ArrayList<Movie> movieList, ArrayList<User> userList, ArrayList<Ticket> ticketList)
    {
        //initialise the variables
        this.movieList = movieList;
        this.userList = userList;
        this.ticketList = ticketList;
    }
    
    /**
     * A method to add Movie to the list
     * 
     * @param Movie the Movie Object
     * @return 
     */
    public void addMovie(Movie newMovie)
    {
        movieList.add(newMovie);
    } 
    
    /**
     * A method to delete Movie to the list
     * 
     * @param delMovieName the name of delete movie
     * @return 
     */
    public void deleteMovie(String delMovieName)
    {        
        //remove()
        boolean isDeleted = false;
        for (int i = 0 ; i < getNumbersOfMovies() ; i++)
        {
            if(getMovieList().get(i).getTitle().equals(delMovieName))
            {
                System.out.println(getMovieList().get(i).getTitle() + " are deleted.");
                getMovieList().remove(i);
                isDeleted = true;
            }                        
        }        
        if (! isDeleted)
        {
            System.out.println(" No matched movies are deleted."); 
        }
    } 
    
    /**
     * A method to edit Movie to the list
     * 
     * @param editMovieName the name of delete movie
     * @return 
     */
    public void editMovie(String editMovieName, ArrayList<Actors> editActorList, int editRating)
    {        
        //set()
        boolean isEdited = false;
        for (int i = 0 ; i < getNumbersOfMovies() ; i++)
        {
            if(getMovieList().get(i).getTitle().equals(editMovieName))
            {
                System.out.println(getMovieList().get(i).getTitle() + " are edited.");
                getMovieList().get(i).cleanListOfActors();
                getMovieList().get(i).setActorList(editActorList);
                getMovieList().get(i).setRating(editRating);
               
                isEdited = true;
            }                        
        }        
        if (! isEdited)
        {
            System.out.println(" No matched movies are Edited."); 
        }
    }
    
    /**
     * A method to return elements from the movie list
     * 
     * @param index the index
     * @return elements in the movieList
     */
    public Movie getMovie(int index)
    {
        return movieList.get(index);
    }
    
    /**
     * A method to return the whole movie list
     * 
     * @param 
     * @return the whole movieList
     */
    public ArrayList<Movie> getMovieList()
    {
        return movieList;
    }
    
    /**
     * A method to return the size of movie list
     * 
     * @param
     * @return count number of Movies
     */
    public int getNumbersOfMovies()
    {
        return movieList.size();
    }   
   
    /**
     * A method to return the size of user list
     * 
     * @param
     * @return count number of Users
     */
    public int getNumbersOfUsers()
    {
        return userList.size();
    } 
    
    /**
     * List all the movies currently in the database on standard out.
     */
    public void listAll() 
    {
        for (int j = 0 ; j < movieList.size() ; j++)
            movieList.get(j).displayMovieRecord();        
    }
    
    /**
     * A method to search movie
     * 
     * @param searchTitle the searchTitle
     * @return resultList the resultList
     */
    public ArrayList<Movie> searchMovie(String searchTitle) //not case-sensitive source.toLowerCase().contains(target.toLowerCase())
    {
        ArrayList<Movie> resultList = new ArrayList<Movie>();
        
        for (int i = 0 ; i < getNumbersOfMovies(); i++)
        {
            if(getMovieList().get(i).getTitle().toLowerCase().contains(searchTitle))
                resultList.add(getMovieList().get(i));
            
        }
                
        return resultList;
    }
    
    /**
     * A method to search movie
     * 
     * @param searchDirector
     * @return resultList
     */
    public ArrayList<Movie> searchByDirector(String searchDirector) //not case-sensitive source.toLowerCase().contains(target.toLowerCase())
    {
        ArrayList<Movie> resultList = new ArrayList<Movie>();
        
        for (int i = 0 ; i < getNumbersOfMovies(); i++)
        {
            if(getMovieList().get(i).getDirector().toLowerCase().contains(searchDirector))
                resultList.add(getMovieList().get(i));            
        }
                
        return resultList;
    }
    
    /**
     * A method to match user
     * 
     * @param ArrayList<User> userList, searchName, searchPassword
     * @return resultList
     */
    public ArrayList<User> matchUsernameAndPassword(ArrayList<User> userList, String searchUserName, String searchPassword) //not case-sensitive source.toLowerCase().contains(target.toLowerCase())
    {
        ArrayList<User> resultList = new ArrayList<User>();
        
        for (int i = 0 ; i < userList.size(); i++)
        {
            if(userList.get(i).getUserName().toLowerCase().equals(searchUserName))
            {
                if(userList.get(i).getPassword().toLowerCase().equals(searchPassword))
                    resultList.add(userList.get(i));           
            }
        }        
        return resultList;
    }
    
    /**
     * A method to set movie Name
     * 
     * @param movieName the movieName, index the index
     * @return 
     */
    public void setMovie(Movie insertedMovie, int index)
    {
        movieList.set(index, insertedMovie);
    }
    
    /**
    * Method to check Movie Name repeatation
    * 
    * @param MovieName the Name
    * @return the boolean of Movie Name repeatation
    */
    public boolean validMovieName(String movieName) //method to check Movie Name repeatation
    {
        //check if movie title is not in database , and return false to break while loop
        for (int i = 0 ; i < getNumbersOfMovies() ; i++ )
        {
            if (movieName.equals(getMovieList().get(i).getTitle()))
                return true;
        }
        
        return false;        
    }
}   
    