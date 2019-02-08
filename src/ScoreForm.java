import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreForm extends JFrame {
    private JPanel panel;
    private JLabel score;
    private JButton btn;
    private JFrame frame;
    public ScoreForm(int score) throws HeadlessException {
        frame = this;
       init(score);
    }

    private void init(int score){

        btn = new JButton("Restart");
        panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        panel.add(new JLabel("Score Kamu "+score,JLabel.CENTER));
        panel.add(btn);
        add(panel);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainClass fm = new MainClass();
                fm.setVisible(true);
                frame.dispose();
            }
        });
        setSize(200,200);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
