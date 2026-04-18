package lab2;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Tạo các DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Test thêm DVD
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Test xóa DVD
        store.removeDVD(dvd2); // Xóa Star Wars
        store.removeDVD(dvd2); // Thử xóa lại lần nữa để xem thông báo không tìm thấy
    }
}