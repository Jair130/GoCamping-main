/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gocamping;

import Items.ExploreItem;
import Items.HikingItem;
import Items.Item;
import Items.PersonalItem;
import campingbag.CampingBag;

import java.util.Scanner;


/**
 *
 * @author Ken Healy
 */
public class GoCamping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sizeOfBag = 0; //initial


        // include code here to get the size of the bag from the user
        System.out.println("Which is the size of your bag?");
        Scanner myKB = new Scanner(System.in);
        sizeOfBag = myKB.nextInt();
        CampingBag myCampingBag = new CampingBag(sizeOfBag);
        //variable called myCampingBag type CampingBag
        //Instantiation  object CampingBag invoking constructor with one parameter sizeOfBag (int)
        Item myItem = new PersonalItem(1, "bottle", 1);
        Item myItem2 = new ExploreItem(2, "lantern", 1);
        Item myItem3 = new HikingItem(3, "sticks", 1);


        myCampingBag.addItem(myItem);
        myCampingBag.addItem(myItem2);
        myCampingBag.addItem(myItem3);

            int option;
            int quantity=0;
            String[] Itemname;

            do {
                System.out.println("Choose an option from the menu");
                System.out.println("1.Add a Personal Item to the bag");
                System.out.println("2.Add an Explore Item to the bag");
                System.out.println("3.Add a Hiking Item to the bag");
                System.out.println("4.Go Camping !! ");
                System.out.println("5.exit");
                option = myKB.nextInt();
            }while(option > 5 || option <1 );
            switch(option) {
                case 1:
                    System.out.println("How many do u want to add?");
                    quantity = myKB.nextInt();
                    myKB.nextLine();
                    Itemname = new String[quantity];


                    for (int i = 0; i < sizeOfBag; i++) {
                        System.out.println("Personal item name " + (i + 1));
                        Itemname[i] = myKB.nextLine();

                    }
                    if (sizeOfBag == 0) {
                        System.out.println("Bag is full");
                    } else {
                        System.out.println("Item added");
                    }
                    break;
                case 2:
                    System.out.println("How many do u want to add?");
                    quantity = myKB.nextInt();
                    myKB.nextLine();
                    Itemname = new String[quantity];


                    for (int i = 0; i < sizeOfBag; i++) {
                        System.out.println("Explore item name " + (i + 1));
                        Itemname[i] = myKB.nextLine();
                    }
                    if (sizeOfBag == 0) {
                        System.out.println("Bag is full");
                    } else {
                        System.out.println("Item added");
                    }
                    break;
                case 3:
                    System.out.println("How many do u want to add?");
                    quantity = myKB.nextInt();
                    myKB.nextLine();
                    Itemname = new String[quantity];


                    for (int i = 0; i < sizeOfBag; i++) {
                        System.out.println("Hiking item name " + (i + 1));
                        Itemname[i] = myKB.nextLine();
                        if (sizeOfBag == 0) {
                            System.out.println("Bag is full");
                        } else {
                            System.out.println("Item added");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Go camping!!");

                    break;
                case 5:
                    break;

            }



            // System.out.println("Printing my Object");
            // System.out.println(myItem);

            //dynamic method dispatch
            //ParentClass NameOfVariable = new Subclass();
            //Item myItem = new ExploreItem(2,"Example",1);
            // 1. Methods are call from father unless
            // 2. Methods are overriden  by the subClasess

            //DMD belongs polimorphism
            // polimorphism = poli = muchos morphism = forma -> muchas formas
            // Dynamic => java ejecucion/ corra run

        /*
           YOU WILL NEED TO INCLUDE MORE CODE HERE TO COMPLETE THE CA REQUIREMENTS
        */

        }
    }
