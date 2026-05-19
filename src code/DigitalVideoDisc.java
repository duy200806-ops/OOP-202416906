package lab2;

public class DigitalVideoDisc {
    // 1. Thuộc tính (Attributes)
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    // Thuộc tính dùng chung cho Class (Phần 5)
    private int id; 
    private static int nbDigitalVideoDiscs = 0; 

    // 2. Constructors (Nạp chồng - Overloading)
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title); // Gọi constructor phía trên
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    // 3. Getters & Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; } // Cần cho phần 3
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }
    public int getId() { return id; }

    // 4. Các phương thức bổ trợ (Phần 6)
    @Override
    public String toString() {
        return "DVD - " + title + " - " + (category != null ? category : "N/A") + 
               " - " + (director != null ? director : "N/A") + 
               " - " + length + ": " + cost + " $";
    }

    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
}