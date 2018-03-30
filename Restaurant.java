/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 4
 */

class Restaurant
{
	 private static Restaurant restaurant = null;
     int number_of_orders_so_far = 0;
     
     private Restaurant()
     { }
     
     public static Restaurant getRestaurant() {
    	 if (restaurant == null) 
    		 restaurant = new Restaurant();
    	 return restaurant;
     }
     
     public void acceptOrder(String Orderdetail)
     {
    	 number_of_orders_so_far = number_of_orders_so_far + 1;
    	 System.out.println("latest order: " + Orderdetail);
    	 System.out.println(number_of_orders_so_far + " Orders are received so far\n");
     }
     
     public void removeOrder(String Orderdetail)
     {
    	 number_of_orders_so_far = number_of_orders_so_far - 1;
    	 System.out.println("Canceled order: " + Orderdetail);
    	 System.out.println(number_of_orders_so_far + " Orders are received so far\n");
     }
 }