package withoutAOP.domain;

public class Song {

    //  generally the class which hold getter and setter we does not create bean
    private String songName;
    private String artistName;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
