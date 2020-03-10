package mediaFile;
public class Movie {
    private String title;
    private int rating;
    private int duration;


    public Movie() {
        title = "";
        rating = 0;

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        rating = r;
    }

    public int getDuration() {
        return rating;
    }

    public void setDuration(int d) {
        duration = d;
    }
    public Movie(String title,int rating) {
        this.title = title;
        this.rating = rating;
    }
public void displayDuration(){
     System.out.println("hours: " +(duration/60)+" minutes: "+(60 % duration));
 }
}


