/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlooringOrdersController;

import FlooringOrdersDTO.Order;
import FlooringOrdersServiceLayer.Service;
import FlooringOrdersUI.View;

/**
 *
 * @author laptop
 */
public class Controller {
    
    private View myView;
    private Service myService;
    
    //Constructor
    public Controller(View myView, Service myService){
        this.myView = myView;
        this.myService = myService;
    }
    
    public void run(){
        boolean keepGoing = true;
        int menuSelection = 1;
        
        
        switch (printMenuAndGetSelection()){
            
            case 1:
                //display orders
            case 2:
                addOrder();
            case 3:
                editOrder();
            case 4:
                //remove an order
            case 5:
                //save an order
            case 6: 
                exitBanner();
            
        }
        
        
    }
    
    
    
    
    //Methods below
    private int printMenuAndGetSelection(){
        
        return myView.printMenuAndGetSelection();
    }
    
    private void exitBanner(){
        myView.exitBanner();
    }

    private void addOrder() { //add exception
        Order placement = myView.setUsersOrder(myService.getOrderNumber());//Prompts the user to input info
        boolean usersChoice = myView.areYouSure();//Returns boolean true or false
        if (usersChoice) {
            myService.addOrder(placement);
        } else {
            myView.thankYouBanner();
        }
    }
    
//    private void displayAllOrders {
////    return myService.
//}

    private void editOrder() {
        //Have the user input the date and order number
        //
    }

    
}