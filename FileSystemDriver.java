package file2513830;



public class FileSystemDriver {
    public static void main(String[] args) {
        Directory root = new Directory("root");

        // Creating files
        File settings = new File("Settings", 10);
        File ringtone = new File("ringtone", 120);
        File familyHoliday = new File("family-holiday", 201);
        File portrait = new File("portrait", 134);
        File wallpaper = new File("wallpaper", 421);

        // Creating directories
        Directory music = new Directory("music");
        Directory pictures = new Directory("pictures");
        Directory personal = new Directory("personal");
        Directory misc = new Directory("misc");

        // Building the directory structure
        root.add(settings);
        root.add(music);
        root.add(pictures);

        music.add(ringtone);
        pictures.add(personal);
        pictures.add(misc);

        personal.add(familyHoliday);
        personal.add(portrait);
        misc.add(wallpaper);

        // Displaying the directory structure with custom indentation
        System.out.println(root.display("\t"));
    }
}


