package lab2;

public class DigitalVideoDisc {
    // Thuộc tính instance (Instance members)
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // --- PHẦN CẬP NHẬT MỚI THEO YÊU CẦU ---
    private int id; // Thuộc tính instance để lưu id riêng của mỗi DVD
    private static int nbDigitalVideoDiscs = 0; // Thuộc tính class để đếm tổng số DVD đã tạo
    // ------------------------------------

    public DigitalVideoDisc(String title) {
        this.title = title;
        // Cập nhật id tự động mỗi khi tạo instance mới
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title); // Gọi constructor trên để tránh lặp code cập nhật id
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

    // Getter cho id và tiêu đề
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Các Getter khác giữ nguyên...
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }
}