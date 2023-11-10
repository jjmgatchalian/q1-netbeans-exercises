/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1ex_ele_gatchalianjm;

/**
 *
 * @author user
 */
public class Song {
    private String songname;
    private String songlyric;
    private int nolistened;
    
    public String getSongName() {
        return songname;
    }
    
    public String getSongLyrics() {
        return songlyric;
    }
    
    public void setSongName(String sn) {
        songname = sn;
    }
    
    public void setSongLyrics(String sl) {
        songlyric = sl;
    }
    
    public void PlaySong() {
        System.out.println("Presenting " + songname);
        System.out.println(songlyric);   
        System.out.println("Fin.");
    } 
    
    public Song(String sn, String sly, int nlist) {
        songname = sn;
        songlyric = sly;
        nolistened = nlist;
    }
}
