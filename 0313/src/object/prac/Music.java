package object.prac;

class Music {
    String title, artist, album, genre;

    public Music(String title, String artist, String album, String genre) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    public void showInfo() {
        System.out.printf("[%s] %s - %s (%s)\n", album, title, artist, genre);
    }
}