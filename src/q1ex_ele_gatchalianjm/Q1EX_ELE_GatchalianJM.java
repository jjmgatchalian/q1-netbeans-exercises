/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1ex_ele_gatchalianjm;

/**
 *
 * @author user
 */
public class Q1EX_ELE_GatchalianJM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //exercise part1
        ComputerThings monitor = new ComputerThings("Monitor", "Large", 5);
        ComputerThings keyboard = new ComputerThings("Keyboard", "Medium", 106);
        ComputerThings mouse = new ComputerThings("Mouse", "Small", 3);
        monitor.giveDetails();
        keyboard.giveDetails();
        mouse.giveDetails();
        System.out.println(" -------------------- ");
        
        //exercisepart2
        Song odetoCS = new Song("Ode to CS", "ily CS ily CS ily CS..", 2147483647);
        Song amongus = new Song("Sussy Impostor Time", "dun x7, dun dun dun, amongus time", 166940);
        Song genZ = new Song("Gyatt Rizz", "gyatt rizz in that homie ohio skibidy toilet", 15901250);
        
        Singer joebiden = new Singer("Joe Biden", 23, 500, amongus);
        Singer barackobama = new Singer("Barack Obama", 116, 2300, genZ);
        joebiden.performForAudience(12, joebiden.getFavSong());
        joebiden.showPerformances();
        joebiden.showEarnings();
        System.out.println();
        joebiden.changeFavSong(odetoCS);
        System.out.println(" -------------------- ");
        
        barackobama.performForAudience(210, genZ, joebiden);
        barackobama.showPerformances();
        barackobama.showEarnings();
        joebiden.showPerformances();
        joebiden.showEarnings();
        System.out.println(" -------------------- ");
        
        Singer.getTotalPerformances();

    }
    
}
