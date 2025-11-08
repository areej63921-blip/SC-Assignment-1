public class Main4 {
	    public static void main(String[] args) {
	        Order order = new Order(120, 5); 

	        // Choose shipping method 
	        order.setShippingType(new Ground());
	        System.out.println("Ground shipping cost: $" + order.getShippingCost());
	        System.out.println("Delivery date: " + order.getShippingDate());

	        order.setShippingType(new Air());
	        System.out.println("Air shipping cost: $" + order.getShippingCost());
	        System.out.println("Delivery date: " + order.getShippingDate());
	    }
	}

