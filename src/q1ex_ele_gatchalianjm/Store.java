package q1ex_ele_gatchalianjm;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      this.name = name;
      earnings = 0;
      itemList = new ArrayList<>();
      storeList.add(this);
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      if (index < itemList.size()) {
          System.out.println("----");
          earnings += itemList.get(index).getCost();
          System.out.println("Thank you for purchasing one " + itemList.get(index).getName() + " for " + itemList.get(index).getCost() + "!");
      } 
      else {
          System.out.println("----");
          System.out.println("Sorry, there are only " + itemList.size() + " items in this store.");
      }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
      int iBasedName = -1;
      for (int i=0; i < itemList.size(); i++) {          
          if (itemList.get(i).getName() == name) {
              iBasedName = i;
              break;
          }
      }
      
      if (iBasedName > -1){
          System.out.println("----");
          earnings += itemList.get(iBasedName).getCost();
          System.out.println("Thank you for purchasing one " + itemList.get(iBasedName).getName() + " for " + itemList.get(iBasedName).getCost() + "!");
      }
      else {
          System.out.println("----");
          System.out.println("No such item exists!");
      }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
      int iBasedItem = -1;
      for (int j=0; j < itemList.size(); j++) {
        if (i == Item.getItem(j)) {
            iBasedItem = j;
            break;
        }
      }
      
      if (iBasedItem > -1) {
          System.out.println("----");
          earnings += itemList.get(iBasedItem).getCost();
          System.out.println("Thank you for purchasing one " + itemList.get(iBasedItem).getName() + " for " + itemList.get(iBasedItem).getCost() + "!");
      }
      else {
          System.out.println("----");
          System.out.println("No such item exists!");
      }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
      itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
      System.out.println("----");
      for (int i=0; i < itemList.size(); i++){
          if (itemList.get(i).getType() == type) {
              System.out.println(itemList.get(i).getName());
          }
      }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
      System.out.println("----");
      for (int i=0; i < itemList.size(); i++){
          if (itemList.get(i).getCost() <= maxCost) {
              System.out.println(itemList.get(i).getName());
          }
      }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
      System.out.println("----");
      for (int i=0; i < itemList.size(); i++){
          if (itemList.get(i).getCost() >= minCost) {
              System.out.println(itemList.get(i-1).getName());
          }
      }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
      System.out.println("----");
      for (int i=0; i < storeList.size(); i++){
          System.out.println("Store Name: " + storeList.get(i).getName() + ", " + "Earnings: " + storeList.get(i).getEarnings());
      }
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
