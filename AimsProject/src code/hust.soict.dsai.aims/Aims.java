package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;

public class Aims {
    public static void main(String[] args) {
        // Tạo giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo các loại Media
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        
        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setCategory("Education");
        book1.setCost(15.5f);
        book1.addAuthor("James Gosling");

        CompactDisc cd1 = new CompactDisc();
        cd1.setTitle("Abbey Road");
        cd1.setArtist("The Beatles");
        cd1.setCategory("Rock");
        cd1.setCost(20.0f);
        
        Track track1 = new Track("Come Together", 4);
        Track track2 = new Track("Something", 3);
        cd1.addTrack(track1);
        cd1.addTrack(track2);

        // Thêm vào giỏ hàng
        anOrder.addMedia(dvd1);
        anOrder.addMedia(book1);
        anOrder.addMedia(cd1);

        // Hiển thị giỏ hàng
        anOrder.print();
    }
}