package file2513830;

public interface Component {
    String getName();
    int getSize();
    int getCount();
    String display(String prefix);
    Component search(String name);
}
