public class Main3 {
		    public static void main(String[] args) {

		        Company gameCompany = new GameDevCompany();
		        System.out.println("=== Game Development Company ===");
		        gameCompany.createSoftware();

		        Company outsourceCompany = new OutsourcingCompany();
		        System.out.println("=== Outsourcing Company ===");
		        outsourceCompany.createSoftware();
	
	}

}
