/* Name: Akkahshh Narendra Agarwaal
 * Email ID: akkahshh24@gmail.com
 * Guided_Assignment_2022_07_26
 * Assignment 32_02
 */

package movie.directors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MovieDetails {

	public static void main(String[] args) {
		
		List<Movie> movieList = new ArrayList<Movie>();
		
		// creating movie objects
		Movie m1 = new Movie("The Kashmir Files", "Vivek Agnihotri", 170, 2022);
		Movie m2 = new Movie("Gangs of Wasseypur", "Anurag Kashyap", 160, 2012);
		Movie m3 = new Movie("Bombay Velvet", "Anurag Kashyap", 149, 2015);
		Movie m4 = new Movie("Sanju", "Rajkumar Hirani", 155, 2018);
		Movie m5 = new Movie("Jab Tak Hai Jaan", "Yash Chopra", 176, 2012);
		Movie m6 = new Movie("Dev.D", "Anurag Kashyap", 144, 2009);
		Movie m7 = new Movie("PK", "Rajkumar Hirani", 152, 2014);
		Movie m8 = new Movie("Veer-Zaara", "Yash Chopra", 192, 2004);
		Movie m9 = new Movie("3 idiots", "Rajkumar Hirani", 171, 2009);
		Movie m10 = new Movie("Dil Toh Pagal Hai", "Yash Chopra", 180, 1997);
		
		// adding objects to list
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		movieList.add(m5);
		movieList.add(m6);
		movieList.add(m7);
		movieList.add(m8);
		movieList.add(m9);
		movieList.add(m10);
		
		// hashmap to group movie objects according to director's name
		Map<String, List<Movie>> moviesGroupedByDirector = new HashMap<>(); 
		
		for(Movie m: movieList) {
			String directorName = m.getDirectorName();
			if(moviesGroupedByDirector.containsKey(directorName)) {
				moviesGroupedByDirector.get(directorName).add(m);
			}
			else {
				List<Movie> movieListInMap = new ArrayList<Movie>();
				movieListInMap.add(m);
				moviesGroupedByDirector.put(directorName, movieListInMap);
			}
		}
		
		// printing movies grouped by director name
		for(Entry<String, List<Movie>> entry: moviesGroupedByDirector.entrySet()) {
			System.out.println(entry.getKey());
			for(Movie m: entry.getValue()) {
				System.out.println(m);
			}
			System.out.println();
		}
		
	}

}

/* 
OUTPUT: 
Rajkumar Hirani
Movie [name=Sanju, directorName=Rajkumar Hirani, duration=155, releaseYear=2018]
Movie [name=PK, directorName=Rajkumar Hirani, duration=152, releaseYear=2014]
Movie [name=3 idiots, directorName=Rajkumar Hirani, duration=171, releaseYear=2009]

Vivek Agnihotri
Movie [name=The Kashmir Files, directorName=Vivek Agnihotri, duration=170, releaseYear=2022]

Anurag Kashyap
Movie [name=Gangs of Wasseypur, directorName=Anurag Kashyap, duration=160, releaseYear=2012]
Movie [name=Bombay Velvet, directorName=Anurag Kashyap, duration=149, releaseYear=2015]
Movie [name=Dev.D, directorName=Anurag Kashyap, duration=144, releaseYear=2009]

Yash Chopra
Movie [name=Jab Tak Hai Jaan, directorName=Yash Chopra, duration=176, releaseYear=2012]
Movie [name=Veer-Zaara, directorName=Yash Chopra, duration=192, releaseYear=2004]
Movie [name=Dil Toh Pagal Hai, directorName=Yash Chopra, duration=180, releaseYear=1997]
*/
