package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StoreScreen extends JFrame {
    private Store store;
    private Cart cart;

    public StoreScreen(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem smUpdateStoreBook = new JMenuItem("Add Book");
        JMenuItem smUpdateStoreCD = new JMenuItem("Add CD");
        JMenuItem smUpdateStoreDVD = new JMenuItem("Add DVD");

        smUpdateStore.add(smUpdateStoreBook);
        smUpdateStore.add(smUpdateStoreCD);
        smUpdateStore.add(smUpdateStoreDVD);

        menu.add(smUpdateStore);
        
        JMenuItem smViewStore = new JMenuItem("View store");
        JMenuItem smViewCart = new JMenuItem("View cart");
        menu.add(smViewStore);
        menu.add(smViewCart);

        smViewCart.addActionListener(e -> {
            new CartScreen(cart);
            dispose();
        });

        smUpdateStoreBook.addActionListener(e -> {
            // new AddBookToStoreScreen(store, cart);
            // dispose();
            JOptionPane.showMessageDialog(this, "Add Book screen coming soon!");
        });
        smUpdateStoreCD.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Add CD screen coming soon!");
        });
        smUpdateStoreDVD.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Add DVD screen coming soon!");
        });

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cartBtn = new JButton("View cart");
        cartBtn.setPreferredSize(new Dimension(100, 50));
        cartBtn.setMaximumSize(new Dimension(100, 50));
        cartBtn.addActionListener(e -> {
            new CartScreen(cart);
            dispose();
        });

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cartBtn);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < 9 && i < mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
            center.add(cell);
        }

        return center;
    }

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        store.addMedia(new DigitalVideoDisc("DVD1's Title", "Action", "Director A", 90, 76.0f));
        store.addMedia(new Book(2, "Book2's Title", "Education", 61.0f));
        store.addMedia(new CompactDisc(3, "CD3's Title", "Music", 59.0f, 0, "", "Artist A"));
        store.addMedia(new CompactDisc(4, "CD4's Title", "Jazz", 38.0f, 0, "", "Artist B"));
        store.addMedia(new DigitalVideoDisc("DVD5's Title", "Comedy", "Director B", 120, 43.0f));
        store.addMedia(new CompactDisc(6, "CD6's Title", "Pop", 95.0f, 0, "", "Artist C"));
        store.addMedia(new Book(7, "Book7's Title", "Science", 24.0f));
        store.addMedia(new Book(8, "Book8's Title", "History", 78.0f));
        store.addMedia(new CompactDisc(9, "CD9's Title", "Rock", 95.0f, 0, "", "Artist D"));

        new StoreScreen(store, cart);
    }
}
