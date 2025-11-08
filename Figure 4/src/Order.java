import java.util.List;

	public class Order {
	    private List<String> lineItems;  
	    private double totalWeight;
	    private double total;
	    private Shipping shipping;

	    public Order(double total, double totalWeight) {
	        this.total = total;
	        this.totalWeight = totalWeight;
	    }

	    public double getTotal() {
	        return total;
	    }

	    public double getTotalWeight() {
	        return totalWeight;
	    }

	    public void setShippingType(Shipping shipping) {
	        this.shipping = shipping;
	    }

	    public double getShippingCost() {
	        return shipping.getCost(this);
	    }

	    public String getShippingDate() {
	        return shipping.getDate(this);
	    }
}
