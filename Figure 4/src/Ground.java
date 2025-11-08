public class Ground implements Shipping {

	    @Override
	    public double getCost(Order order) {
	        if (order.getTotal() > 100) {
	            return 0;
	        }
	        return Math.max(10, order.getTotalWeight() * 1.5);
	    }

	    @Override
	    public String getDate(Order order) {
	        return "5-7 business days";
	    }
	}

