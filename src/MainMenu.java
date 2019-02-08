import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JLabel text;
    private JPanel panel;
    private JButton start;
    private JFrame frame;
    public MainMenu(){
        frame = this;
        panel = new JPanel();
        start = new JButton("START GAME");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainClass fm = new MainClass();
                fm.setVisible(true);
                frame.dispose();
            }
        });
        panel.setLayout(new GridLayout(0,1));
        panel.add(new JLabel("FLY BIRD",JLabel.CENTER));
        panel.add(start);
        add(panel);
        setTitle("MAIN MENU");
        setResizable(false);
        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MainMenu fm = new MainMenu();
        fm.setVisible(true);
    }
}
