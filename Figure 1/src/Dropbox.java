
public class Dropbox implements CloudStorageProvider {

	    @Override
	    public void storeFile(String name) {
	        System.out.println("Dropbox storing file: " + name);
	    }

	    @Override
	    public void getFile(String name) {
	        System.out.println("Dropbox retrieving file: " + name);
	    }
	}

