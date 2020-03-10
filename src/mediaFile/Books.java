package mediaFile;
public class Books {
    private String title;
    private int rating;

    public Books() {
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
}

