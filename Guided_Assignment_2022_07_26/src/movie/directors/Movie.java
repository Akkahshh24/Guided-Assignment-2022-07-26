/* Name: Akkahshh Narendra Agarwaal
 * Email ID: akkahshh24@gmail.com
 * Guided_Assignment_2022_07_26
 * Assignment 32_02
 */

package movie.directors;

public class Movie {
	
	private String name;
	private String directorName;
	private int duration;
	private int releaseYear;
	
	public Movie() {
		// default constructor
	}
	
	public Movie(String name, String directorName, int duration, int releaseYear) {
		this.name = name;
		this.directorName = directorName;
		this.duration = duration;
		this.releaseYear = releaseYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", directorName=" + directorName + ", duration=" + duration + ", releaseYear="
				+ releaseYear + "]";
	}
	
}
