package mediaFile;
public class Song {
    private String title;
    private int rating;
    private double price;
    private boolean favorite;
    private int numSongs=0;






    public Song() {
        title = "";
        rating = 0;
        price = 0;
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


    public void setPrice(double p)
    {
        price =p;
    }
    public double getPrice(){
        return price;
    }

    public void addToFavorites() {
        favorite = true;
    }


    public Song(String title, double price,int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        ++numSongs;
    }
    public double getNumSongs(){
        return numSongs;
    }
}