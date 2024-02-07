package file2513830;

public class File implements Component { //Utilising a class named File that implements the Component interface
	private int size;
	private String name;
	
	public File (String n, int s) {
		this.size = s;
		this.name = n;
	}
	
	    public String getName() {
	 
	        return name;
	    }

	  
	    public int getSize() {
	        return size;
	    }

	    
	    public int getCount() { 
	        return 1;
	    }

	    
	    public String display(String prefix) { 
	    	return prefix + name + " (" + size + ")\n"; //returns the name of the file and the corresponding size
	    }

	   
	    public Component search(String name) {
	        if (this.name.equals(name)) {
	            return this;  // Return the current File object when names match
	        }
	        return null;  // Return null when names do not match
	    }
}

