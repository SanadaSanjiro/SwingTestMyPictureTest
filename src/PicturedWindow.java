import javax.swing.*;

    public class PicturedWindow extends JFrame {
        public PicturedWindow() {
            super("Окошко с картинкой");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon("images/wolf.jpg"));
            JScrollPane pane = new JScrollPane(label);
            getContentPane().add(pane);
            setSize(300, 250);
            setVisible(true);
        }


        public static void main(String[] args) {
            // write your code here
            PicturedWindow pw = new PicturedWindow();
        }
    }

