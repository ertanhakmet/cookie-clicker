import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CookieClickerGUI extends JFrame {
    JLabel title;
    JLabel cookie;
    int clickCounter = 0;
    JLabel clicked;

    // constructor
    public CookieClickerGUI(){
        super("Cookie Clicker");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        // title label
        title = new JLabel("Click the Cookie!");
        title.setFont(new Font(null, Font.BOLD, 20));
        title.setBounds(120, 20, 300, 15);
        add(title);

        // Cookie image
        ImageIcon cookieIcon = null;
        try{
            cookieIcon = new ImageIcon("images/cookie.png");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        // clicked label
        clicked = new JLabel("You clicked " + clickCounter + " times!");
        clicked.setFont(new Font(null, Font.BOLD, 20));
        clicked.setBounds(90, 205, 250, 50);


        if (cookieIcon != null){
            cookie = new JLabel(cookieIcon);
            cookie.setBounds(130, 60, 128, 150);
            add(cookie);
            cookie.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    clickCounter++;
                    clicked.setText("You clicked " + clickCounter + " times!");
                }
            });
        }

        add(clicked);

    }

    public static void main(String[] args) {
            CookieClickerGUI cookieClickerGUI = new CookieClickerGUI();
            cookieClickerGUI.setVisible(true);
    }
}
