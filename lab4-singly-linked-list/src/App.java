public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");

        Song song_1 = new Song("Beat it", "Micheal Jackson");
        Song song_2 = new Song("September", "Earth, Fire and Wind");
        Song song_3 = new Song("Carribean Queen", "Billy Ocean");
        Song song_4 = new Song("Bohemian Rhapsody", "Queen");
        Song song_5 = new Song("Hey Jude", "The Beatles");

        Playlist playlist = new Playlist();


        playlist.addSong(song_1);
        playlist.addSong(song_2);
        playlist.addSong(song_3);
        playlist.addSong(song_4);
        playlist.addSong(song_5);

        playlist.displayPlaylist();
        
        playlist.playNext();
        // playlist.playNext();
        playlist.removeSong("Hey Jude"); // Remove by title
        playlist.removeSong("Beat it"); 
        
        playlist.displayPlaylist();
        playlist.playNext();
        playlist.playNext();
        playlist.playNext();
        playlist.removeSong("Carribean Queen"); 
        playlist.playNext();
    }
}
