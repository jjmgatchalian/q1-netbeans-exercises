/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1ex_ele_gatchalianjm;

/**
 *
 * @author user
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances;
    
    public void performForAudience(int people, Song newsong){
        
        System.out.println("Hi guys I'm " + name);
        newsong.PlaySong();
        noOfPerformances++;
        totalPerformances++;
        earnings = earnings + (100 * people);
        System.out.println();
    }
    
    public void performForAudience(int people, Song newsong, Singer collaborator) {
        
        System.out.println("Hi guys we're " + name + " and " + collaborator.name);
        newsong.PlaySong();
        noOfPerformances++;
        collaborator.noOfPerformances++;
        totalPerformances++;
        earnings = earnings + (50 * people);
        collaborator.earnings = collaborator.earnings + (50 * people);
        System.out.println();
    }
    
    public void showPerformances() { 
        System.out.println("Total performances of " + name + ": " + noOfPerformances);
    }   
    
    public void showEarnings() {
        System.out.println("Total earnings of " + name + ": " + earnings);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setFavSong(Song fs) {
        favoriteSong = fs;
    }
    
    public Song getFavSong() {
        return favoriteSong;
    }
    
    
    public void changeFavSong(Song newsong){
        favoriteSong = newsong;
        System.out.println("New favorite song of " + name + " is " + newsong.getSongName());
    }
    
    public static void getTotalPerformances() {
        System.out.println("A total of " + totalPerformances + " performances have been performed by all singers combined");
    }
    
    public Singer(String nm, int pfm, double en, Song fvs) {
        name = nm;
        noOfPerformances = pfm;
        totalPerformances = totalPerformances + noOfPerformances;
        earnings = en;
        favoriteSong = fvs;
    }
}
