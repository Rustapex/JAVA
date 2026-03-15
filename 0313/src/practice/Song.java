package practice;

public class Song {
    private String albumName;
    private String songName;
    private String genre;
    private String singer;

    public Song(String albumName, String songName,  String genre, String singer){
        this.albumName = albumName;
        this.songName = songName;
        this.genre = genre;
        this.singer = singer;
    }

    public String getAlbumName(){
        return this.albumName;
    }
    public String getSongName(){
        return this.songName;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getSinger(){
        return this.singer;
    }
    public void updateInfo(String albumName, String songName, String genre, String singer){
        this.albumName = albumName;
        this.songName = songName;
        this.genre = genre;
        this.singer = singer;
    }

    public String showInfo() {
        return "앨범 : " + albumName + ", 곡명 : " + songName +
                ", 장르 : " + genre + ", 가수 : " + singer;
    }
}

