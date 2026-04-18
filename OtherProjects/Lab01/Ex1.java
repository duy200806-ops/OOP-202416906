import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change?");
        if(option == JOptionPane.YES_OPTION) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}
