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
        String item1 = "Monitor";
        String size1 = "large";
        int buttons1 = 5;
        
        String item2 = "Keyboard";
        String size2 = "medium";
        int buttons2 = 106;
        
        String item3 = "Mouse";
        String size3 = "small";
        int buttons3 = 3;
        
        System.out.println("Item 1");
        System.out.println("Name: " + item1);
        System.out.println("Size: " + size1);
        System.out.println("Number of Buttons: " + buttons1);
        System.out.println("");
        
        System.out.println("Item 2");
        System.out.println("Name: " + item2);
        System.out.println("Size: " + size2);
        System.out.println("Number of Buttons: " + buttons2);
        System.out.println("");
        
        System.out.println("Item 3");
        System.out.println("Name: " + item3);
        System.out.println("Size: " + size3);
        System.out.println("Number of Buttons: " + buttons3);
        System.out.println("");
        
        boolean sizeCheck = size1.equals(size2)&&size2.equals(size3)&&size3.equals(size1);
        System.out.println("Any of the items have the same sizes: " + sizeCheck);
        int totalButtons = buttons1 + buttons2 + buttons3;
        System.out.println("Total Buttons: " + totalButtons);
        boolean buttsCheck = buttons1 + buttons3 > buttons2;
        System.out.println("Monitor and mouse have more buttons combined than Keyboard: " + buttsCheck);
    }
    
}
