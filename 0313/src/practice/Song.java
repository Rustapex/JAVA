package practice;

class Song {
    String albumName;
    String songName;
    String genre;
    String singer;

    public Song(String albumName, String songName,  String genre, String singer){
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

