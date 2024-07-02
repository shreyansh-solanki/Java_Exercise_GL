import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
    private final ArrayList<Song> songs = new ArrayList<>();

//    public MusicLibrary() {
//        this.songs = new ArrayList<Song>();
//    }

    public void addSong(Song song) {
        this.songs.add(song);
        System.out.println("Song added successfully!!");
    }

    public Song playRandomSong() {
        if(this.songs.isEmpty()) {
            System.out.println("No song present!!");
            return null;
        }

        Random rm = new Random();
        int randomNum = rm.nextInt(songs.size());

        return this.songs.get(randomNum);
    }

    public ArrayList<Song> getAllSongs() {
        return this.songs;
    }

    public void removeSong(Song song) {
        this.songs.remove(song);
        System.out.println("Song removed successfully!!");
        System.out.println("Removed Song title: " + song.getTitle());
    }
}