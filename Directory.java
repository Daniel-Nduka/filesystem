package file2513830;
import java.util.ArrayList;

public class Directory implements Component {
	// This will store the leaves
		private ArrayList<Component> children;
		private String name;
		
		// Constructor - create the list and set the name
		public Directory (String n) {
			this.children = new ArrayList<Component>();
			this.name = n;
			
		}
		
		public String getName() {
			
			return name;
			
		}
		// Method to calculate and return the total size of the directory and its children
		public int getSize() {
			int size = 0;
			// Iterate over the children and sum up their sizes
			for(Component a: children) {
				size += a.getSize();
			}
			return size;
		}
		
		
		// Method to calculate and return the total count of components in the directory and its children
		public int getCount() {
			int Count = 0;
			// Iterate over the children and sum up their counts
			for(Component a: children) {
				Count = Count + a.getCount();
			}
			return Count;
		}
		
		public String display(String prefix) {
	        // Start the recursive display with an initial depth of 0
	        return displayHelper(prefix, 0).trim();
	    }

	    // Helper method for recursive display with depth tracking
		private String displayHelper(String prefix, int depth) {
		    String display = "";

		    // Apply prefix based on depth
		    if (depth > 0) { // Skip prefix for the top-level directory
		        display += prefix.repeat(depth - 1);
		    }

		    // Add the directory's own name and stats
		    display += (depth > 0 ? prefix : "") + this.name + ": (count=" + this.getCount() + ", size=" + this.getSize() + ")\n";

		    // Increment depth for children
		    depth++;

		    for (Component child : children) {
		        // Recursive call with incremented depth
		        display += (child instanceof Directory ? ((Directory) child).displayHelper(prefix, depth) : prefix.repeat(depth) + child.display(""));
		    }

		    return display;
		}
	
		 // Method to search for a component with a specific name within the directory and its children
		 public Component search(String name) {
		        for (Component a : children) {
		            Component result = a.search(name);
		            if (result != null) {
		                return result; // If found, return the component
		            }
		        }
		        return null; // If not found, return null
		    }
		 
		// Method to add a component to the directory
		public void add(Component a) {
			children.add(a);
		}
		// Method to remove a component from the directory
		public void remove(Component a) {
			children.remove(a);
			
			
		}

}
