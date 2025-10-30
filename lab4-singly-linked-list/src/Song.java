public class Song {
    private String title;
    private String artist; 

    public  Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    String getTitle() {
        return (title);
    }


    String getArtist() {
        return (artist);
    }   

    String getSong() {
        return ("Title: " + title + ", Artist: " + artist);
    }
}
