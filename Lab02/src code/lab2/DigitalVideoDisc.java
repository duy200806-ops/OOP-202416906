package lab2;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor nạp chồng (overloading) để linh hoạt khi tạo đối tượng
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Các Getter và Setter
    public String getTitle() { return title; }
    public int getId() { return id; }
    public float getCost() { return cost; }

    // Yêu cầu mục 6: Phương thức trả về chuỗi thông tin DVD
    @Override
    public String toString() {
        return "DVD - " + title + " - " + (category != null ? category : "N/A") +
                " - " + (director != null ? director : "N/A") +
                " - " + length + ": " + cost + " $";
    }

    // Yêu cầu mục 6: Kiểm tra tiêu đề có khớp hay không
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
}