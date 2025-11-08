
public class main1 {

		    public static void main(String[] args) {
		        Amazon amazon = new Amazon();
		        amazon.createServer("US-East");
		        amazon.listServers("US-East");
		        amazon.storeFile("project.zip");
		        amazon.getFile("project.zip");
		        System.out.println(amazon.getCDNAddress());
                
		        Dropbox dropbox = new Dropbox();
		        dropbox.storeFile("report.pdf");
		        dropbox.getFile("report.pdf");

	}
}
