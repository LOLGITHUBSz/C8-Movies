import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
      Arrylist <Movie> r = new Arraylist<Movie>();
      for(int i = 0 ; i<pool.size(); i++)
      {
        if( pool.get(i).getStudio().equals(studio)

       
      }
     }
     
    public ArrayList<Movie> getPool()
    {
        ArrayList<Movie> alm = new Arraylist<Movie>();
        
        for(int i = 0; i<pool.length() ; i++)
        {
          if( pool.get(i).getStudio().equals(studio))
          {
             Movie m = pool.get(i);
             alm.add(m);
        }
      }
    }
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    {
        return null;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestrating(ArrayList<Movie> movies)
    {
      ArrayList<Movie> highestRated = new ArrayList<Movie>();
      
        
    }
    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        
        Movie mDisney = highestRated( getByStudio( "Disney"));
        Movie mGhibli = highestRated( getByStudio( "Ghibli"));
        Movie mIndy = highestRated( getByStudio( "Indy"));
        ArrayList<Movie> answer = new ArrayList<Movie>();
        answer.add(mDisney);
        answer.add(mGhibli);
        answer.add(mIndy);
        return answer;
              
              
         return null;
        // return highestRated;
        
    }
     
}
