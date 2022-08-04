package MovieGame;


	import java.io.File;
	import java.util.ArrayList;
    import java.util.Random;
    import java.util.Scanner;
	import java.io.FileNotFoundException;

	public class MovieList {
	   
		
	    private ArrayList <String> movies;
	    
	    
	    public MovieList(String pathname) {
	       movies = new ArrayList<String>();
	      	       
	        File file = new File ("C:\\Users\\eramr\\eclipse-workspace\\GuessTheMovie\\movies.txt\\movies.txt");
	       
	        try {
	            Scanner scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	                movies.add(scanner.nextLine());
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("File does not exist!");
	        }
	    }	    

	   
	   public String getRandomMovie() {
	       
		  Random random=new Random();
	     
	    int movieIndex=random.nextInt(movies.size());
	    	
	      return movies.get(movieIndex); 
	    
	    }

				}

