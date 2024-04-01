Composite Design Pattern Example - FileSystem

This Java code demonstrates the Composite Design Pattern by modeling a simple file system. The composite pattern allows clients to treat individual objects and compositions of objects uniformly. In this scenario, a directory can contain both files and subdirectories, which themselves can contain files and subdirectories, forming a hierarchical structure.

Components:

1. **Component (interface):**
   - Defines common operations for both files and directories.
   - Methods:
     - `getName()`: Returns the name of the component.
     - `getSize()`: Returns the size of the component.
     - `getCount()`: Returns the count of components.
     - `display(prefix)`: Displays the component's details with indentation.
     - `search(name)`: Searches for a component by name recursively.

2. File (class):**
   - Represents a file in the file system.
   - Implements the `Component` interface.
   - Properties:
     - `name`: Name of the file.
     - `size`: Size of the file.
   - Methods:
     - Constructor: Initializes the file with a name and size.
     - `getName()`, `getSize()`, `getCount()`: Implements from `Component`.
     - `display(prefix)`: Displays file details with indentation.
     - `search(name)`: Searches for a file by name.

3. Directory (class):**
   - Represents a directory in the file system.
   - Implements the `Component` interface.
   - Properties:
     - `name`: Name of the directory.
     - `children`: List of files and subdirectories.
   - Methods:
     - Constructor: Initializes the directory with a name and an empty list of children.
     - `getName()`, `getSize()`, `getCount()`: Implements from `Component`.
     - `display(prefix)`: Displays directory details with indentation.
     - `search(name)`: Searches for a component recursively.
     - `add(a)`: Adds a component to the directory.
     - `remove(a)`: Removes a component from the directory.

4. FileSystemDriver (class):**
   - Contains the `main()` method to demonstrate the file system structure.

Usage:

1. Create files and directories.
2. Add files to directories and directories to other directories, forming a hierarchical structure.
3. Perform operations such as displaying the structure, getting total size, and searching for components by name.

Running the Example:

The `FileSystemDriver` class in the provided code demonstrates how to create a simple file system structure with directories and files, then display it with custom indentation.

```java
public class FileSystemDriver {
    public static void main(String[] args) {
        // Create directories and files
        // Add files to directories
        // Display the directory structure with indentation
    }
}
```

Note:

This implementation allows flexibility in managing files and directories. Clients can interact with the file system uniformly without needing to distinguish between files and directories, thanks to the Composite Design Pattern.
