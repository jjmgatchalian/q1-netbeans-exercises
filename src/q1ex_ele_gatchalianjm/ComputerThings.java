/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1ex_ele_gatchalianjm;

/**
 *
 * @author user
 */
public class ComputerThings {
    private String name;
    private String size;
    private int buttons;
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String s) {
        size = s;
    }
    
     public int getButtons() {
        return buttons;
    }
    
    public void setButtons(int b) {
        buttons = b;
    }
    
    public void giveDetails() {
      System.out.println(name + ", " + size + " size, " + buttons + " buttons");   
    }
    
    public ComputerThings(String n, String s, int b){
       name = n;
       size = s;
       buttons = b;
    }
}
