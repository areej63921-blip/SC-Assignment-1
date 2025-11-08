public class Air implements Shipping {

	    @Override
	    public double getCost(Order order) {
	        return order.getTotalWeight() * 3.0;
	    }

	    @Override
	    public String getDate(Order order) {
	        return "1-2 business days";
	    }
	}
