import javax.swing.*;

public class MainClass extends JFrame {
    private JLabel time;
    private JPanel panel;
    public MainClass(){
        init();
    }

    public void init(){
            time = new JLabel("Play TIme",JLabel.CENTER);
            panel = new PlayBoard();
            panel.add(time);
            add(panel);
            Thread background = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while(true){
                    count++;
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                    time.setText("Play Time "+count);
                }
            }
        });
            background.start();
            setSize(400,400);
            setResizable(false);

            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
