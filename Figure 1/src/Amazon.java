
public	class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {

	    @Override
	    public void createServer(String region) {
	        System.out.println("Amazon creating server in region: " + region);
	    }

	    @Override
	    public void listServers(String region) {
	        System.out.println("Listing Amazon servers in region: " + region);
	    }

	    @Override
	    public String getCDNAddress() {
	        return "Amazon CDN Address";
	    }

	    @Override
	    public void storeFile(String name) {
	        System.out.println("Amazon storing file: " + name);
	    }

	    @Override
	    public void getFile(String name) {
	        System.out.println("Amazon retrieving file: " + name);
	    }
	}

