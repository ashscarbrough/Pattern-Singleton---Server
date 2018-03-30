/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 4
 */

 class Order
 {
     private String detail;
     private Restaurant restaurant; 
     
     public Order(String detail)
     {
         this.detail = detail;
         this.restaurant = Restaurant.getRestaurant();
     }
     
     public void placeOrder()
     {
         this.restaurant.acceptOrder(this.detail);
     }
     
     public void cancelOrder()
     {
         this.restaurant.removeOrder(this.detail);
     }
 }