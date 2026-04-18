package lab2;

public class DigitalVideoDisc {
    // 1. Instance members (Thuộc tính của đối tượng)
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    // 2. Class members & ID (Cập nhật theo phần 5)
    private int id; 
    private static int nbDigitalVideoDiscs = 0; 

    // 3. Setter cho title (Cập nhật theo phần 3 để TestPassingParameter không bị lỗi)
    public void setTitle(String title) {
        this.title = title;
    }

    // 4. Các Constructor (Sử dụng 'this' để tự động tăng ID cho mọi trường hợp khởi tạo)
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
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

    // 5. Các Getter
    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
}