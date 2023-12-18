package gameLibrary;

public class VideoGame implements Comparable<VideoGame> {
    public String name;
    public String developer;
    public double rating;
    public VideoGame(String name, String developer, double rating){
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    @Override
    public int compareTo(VideoGame o) {
        return Double.compare(this.rating, o.rating);
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", rating=" + rating +
                '}';
    }
}

