//Write a Java program to create a class called "MusicLibrary" with a collection of songs
// and methods to add and remove songs, and to play a random song.
public class Main {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();

        musicLibrary.addSong(new Song("i believe", "frankie laine", "pop", 2.5f));
        musicLibrary.addSong(new Song("patricia", "pérez prado", "pop", 3.1f));
        musicLibrary.addSong(new Song("the wanderer", "eden ahbez", "pop", 1.9f));

        System.out.println("All songs");
        for(Song song : musicLibrary.getAllSongs())
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Genre: " + song.getGenre() + ", Duration: " + song.getDuration());

        System.out.println("Random Songs");
        Song randomSong = musicLibrary.playRandomSong();
        System.out.println("Random song 1");
        System.out.println("Title: " + randomSong.getTitle() + ", Artist: " + randomSong.getArtist() + ", Genre: " + randomSong.getGenre() + ", Duration: " + randomSong.getDuration());

        randomSong = musicLibrary.playRandomSong();
        System.out.println("Random song 2");
        System.out.println("Title: " + randomSong.getTitle() + ", Artist: " + randomSong.getArtist() + ", Genre: " + randomSong.getGenre() + ", Duration: " + randomSong.getDuration());

        musicLibrary.removeSong(musicLibrary.playRandomSong());
    }
}
