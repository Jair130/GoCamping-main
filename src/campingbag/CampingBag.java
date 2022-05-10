/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campingbag;

import Items.ExploreItem;
import Items.Item;
import java.util.ArrayList;

/**
 * YOU WILL NEED TO ADJUST SOME OF THIS CODE AND/OR ADD YOUR OWN CODE!
 * 
 * @author Jair Armando Palomera Alvarez 2021231
 */
public class CampingBag {
    private boolean isFull; //true/false
    private int capacity;
    private ArrayList<Item> bagContents = new ArrayList<>();

    public CampingBag(){

    }
    
    /**
     * Create a camping bag with a given capacity
     * @param capacity - the capacity as an int
     */
    public CampingBag(int capacity) {
        this.capacity = capacity;
    }
    
    /**
     * CODE TO BE COMPLETED BY STUDENT
     * YOU NEED TO UPDATE THE COMMENTS ALSO!
     * @return true if bag is full, else false
     * This command will check if the bag is ful with all the items already added
     */
    public boolean isFull(){
        if(this.isFull){
            System.out.println("The bag is full");
            return true;
        }

        return false;
    }
    
    /**
     * CODE TO BE COMPLETED BY STUDENT
     * YOU NEED TO UPDATE THE COMMENTS ALSO!
     * @param thingToAdd - an object that is an Item or a sub-class of Item - to be added to the bag contents
     * @return - true if the item added successfully; false if the item could not be added
     */
    public boolean addItem(Item thingToAdd){
        // 1. validation: Can I add an item
        // 2. validation: My bag is full

        if(this.isFull()){
            return false;
        }

        if(capacity-thingToAdd.getSize()>=0){
            System.out.println("Successfully Item added");
            this.capacity -= thingToAdd.getSize();
            if(this.capacity == 0){
                this.isFull = true;
            }
            return bagContents.add(thingToAdd);
        }else{
            System.out.println("Error Item to big for the bag");
            return false;
        }
        
    }
    
    /*
      YOU MAY ADD ADDITIONAL METHODS HERE TO COMPLETE OTHER TASKS
      REMEMBER THAT METHODS FOR A "CAMPINGBAG" MUST MAKE SENSE!
    */
}