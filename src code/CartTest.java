package lab2;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Tạo các DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Kiểm tra hàm in giỏ hàng
        cart.print();

        // Kiểm tra các hàm tìm kiếm
        System.out.println("\n--- Search Results ---");
        cart.searchById(2);        // Tìm thấy Star Wars
        cart.searchByTitle("Lion"); // Tìm thấy The Lion King
    }
}