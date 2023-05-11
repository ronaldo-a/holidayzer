public class Holiday {
    
    private String date;
    private String name;

    public Holiday(String newDate, String newName) {
        date = newDate;
        name = newName;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
